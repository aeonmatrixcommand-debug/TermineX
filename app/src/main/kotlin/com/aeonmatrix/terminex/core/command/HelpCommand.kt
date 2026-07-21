package com.aeonmatrix.terminex.core.command

class HelpCommand : Command {

    override fun execute() {
        println("TermineX CLI")
        println("Commands:")
        println("  help")
        println("  version")
        println("  status")
    }
}
