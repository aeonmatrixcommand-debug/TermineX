package com.aeonmatrix.terminex

fun main(args: Array<String>) {
    when (args.firstOrNull()) {
        "help" -> {
            println("TermineX CLI")
            println("Commands:")
            println("  help")
            println("  version")
            println("  status")
        }

        "version" -> {
            println("TermineX v0.1.0")
        }

        "status" -> {
            println("Status : OK")
        }

        else -> {
            println("Welcome to TermineX")
            println("Run: ./gradlew run --args=\"help\"")
        }
    }
}
