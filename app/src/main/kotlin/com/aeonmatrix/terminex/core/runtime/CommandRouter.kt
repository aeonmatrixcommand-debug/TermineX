package com.aeonmatrix.terminex.core.runtime

import com.aeonmatrix.terminex.core.command.*

class CommandRouter {

    fun route(command:String): Command {

        return when(command) {

            "event" ->
                EventCommand()

            "ai" ->
                AICommand()

            "governance" ->
                GovernanceCommand()

            "memory" ->
                MemoryCommand()

            "agent" ->
                AgentCommand()

            "collaboration" ->
                CollaborationCommand()

            "enterprise" ->
                EnterpriseAICommand()

            else ->
                HelpCommand()
        }
    }

}
