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

            else ->
                HelpCommand()
        }
    }

}
