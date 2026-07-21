package com.aeonmatrix.terminex

import com.aeonmatrix.terminex.core.runtime.CommandRouter

fun main(args: Array<String>) {

    val command = CommandRouter()
        .route(
            args.firstOrNull() ?: "help"
        )

    command.execute()
}
