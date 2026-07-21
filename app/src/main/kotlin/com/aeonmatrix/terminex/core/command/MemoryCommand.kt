package com.aeonmatrix.terminex.core.command

import com.aeonmatrix.terminex.core.memory.*

class MemoryCommand:Command {

    override fun execute(){

        val memory = AIMemory()

        memory.remember(
            "AI Runtime Initialized"
        )

        println(memory.recall())

    }

}
