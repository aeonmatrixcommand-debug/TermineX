package com.aeonmatrix.terminex.core.agent

class AgentRuntime {

    fun execute(
        agent:Agent,
        context:AgentContext
    ){

        println("Agent : ${agent.id}")
        println("Role : ${agent.role}")
        println("Task : ${context.task}")
        println("Priority : ${context.priority}")

    }

}
