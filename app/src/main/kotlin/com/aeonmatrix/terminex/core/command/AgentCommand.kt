package com.aeonmatrix.terminex.core.command

import com.aeonmatrix.terminex.core.agent.*

class AgentCommand:Command {

    override fun execute(){

        val agent =
            Agent(
                id="AEON-001",
                role="AI Decision Agent"
            )

        val context =
            AgentContext(
                task="Analyze System",
                priority="HIGH"
            )

        AgentRuntime()
            .execute(agent,context)

    }

}
