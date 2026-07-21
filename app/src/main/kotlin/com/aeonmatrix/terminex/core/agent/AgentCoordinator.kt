package com.aeonmatrix.terminex.core.agent

class AgentCoordinator {


    fun send(
        message:AgentMessage
    ){

        println(
            "${message.from} -> ${message.to}"
        )

        println(
            message.message
        )

    }


}
