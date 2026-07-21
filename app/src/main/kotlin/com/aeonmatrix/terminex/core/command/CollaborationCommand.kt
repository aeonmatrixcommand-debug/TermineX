package com.aeonmatrix.terminex.core.command


import com.aeonmatrix.terminex.core.event.*
import com.aeonmatrix.terminex.core.agent.*
import com.aeonmatrix.terminex.core.memory.*


class CollaborationCommand:Command {


    override fun execute(){


        val bus =
            EventBus()


        bus.publish(
            Event(
                type="AI_ANALYSIS",
                payload="System Scan"
            )
        )


        val coordinator =
            AgentCoordinator()


        coordinator.send(
            AgentMessage(
                from="Analyst-Agent",
                to="Guardian-Agent",
                message="Risk detected"
            )
        )


        val memory =
            PersistentMemory()


        memory.save(
            "last_event",
            "AI_ANALYSIS"
        )


        println(
            "Memory : ${memory.load("last_event")}"
        )


    }


}
