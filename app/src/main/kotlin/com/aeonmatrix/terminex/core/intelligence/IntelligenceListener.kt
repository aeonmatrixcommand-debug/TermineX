package com.aeonmatrix.terminex.core.intelligence

import com.aeonmatrix.terminex.core.event.*


class IntelligenceListener:
    EventListener {


    override fun onEvent(
        event:Event
    ){

        val decision =
            IntelligenceEngine()
                .analyze()


        println(
            "Event : ${event.type}"
        )

        println(
            "Decision : ${decision.action}"
        )

        println(
            "Confidence : ${decision.confidence}"
        )

    }

}
