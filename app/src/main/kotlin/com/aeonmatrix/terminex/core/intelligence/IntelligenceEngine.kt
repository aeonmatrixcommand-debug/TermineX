package com.aeonmatrix.terminex.core.intelligence


import com.aeonmatrix.terminex.core.event.*


class IntelligenceEngine {


    private val eventBus =
        EventBus()


    fun analyze(input:String){


        val event =
            Event(
                name="ANALYZE:$input"
            )


        eventBus.publish(event)

    }


    fun status(){

        println(
            "Intelligence Engine : READY"
        )

    }

}
