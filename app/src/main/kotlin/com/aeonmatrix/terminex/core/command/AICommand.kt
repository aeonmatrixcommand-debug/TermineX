package com.aeonmatrix.terminex.core.command

import com.aeonmatrix.terminex.core.ai.*

class AICommand:Command {

    override fun execute(){

        val ai =
            OpenAIProvider()

        val result =
            ai.generate(
                "Analyze system status"
            )

        println("Provider : ${result.provider}")
        println("Response : ${result.content}")
        println("Confidence : ${result.confidence}")

    }

}
