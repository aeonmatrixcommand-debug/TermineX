package com.aeonmatrix.terminex.core.command


import com.aeonmatrix.terminex.core.event.*
import com.aeonmatrix.terminex.core.intelligence.*


class EventCommand:Command {


    override fun execute(){


        val bus =
            EventBus()


        bus.register(
            IntelligenceListener()
        )


        bus.publish(
            Event(
                type="SYSTEM_START",
                payload="BOOT"
            )
        )


    }

}
