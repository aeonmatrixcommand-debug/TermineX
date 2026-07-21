package com.aeonmatrix.terminex.core.reasoning

class ReasoningEngine {

    fun evaluate(input:String):Decision {

        return Decision(
            action = "EXECUTE:$input",
            confidence = 0.92
        )

    }

}
