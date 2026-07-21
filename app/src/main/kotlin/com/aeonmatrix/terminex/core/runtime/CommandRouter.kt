package com.aeonmatrix.terminex.core.runtime


import com.aeonmatrix.terminex.core.command.*


class CommandRouter {


    fun route(args:Array<String>):Command {


        return when(args.firstOrNull()) {


            "help" ->
                HelpCommand()


            "version" ->
                VersionCommand()


            "status" ->
                StatusCommand()


            "intelligence" ->
                IntelligenceCommand()


            "runtime" ->
                RuntimeCommand()


            else ->
                HelpCommand()

        }

    }

}
