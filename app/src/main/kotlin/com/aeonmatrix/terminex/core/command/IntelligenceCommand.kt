package com.aeonmatrix.terminex.core.command

import com.aeonmatrix.terminex.core.intelligence.*

class IntelligenceCommand:Command {

    override fun execute(){

        val result =
            IntelligenceEngine()
                .analyze()

        println("Decision : ${result.action}")
        println("Confidence : ${result.confidence}")

    }

}
