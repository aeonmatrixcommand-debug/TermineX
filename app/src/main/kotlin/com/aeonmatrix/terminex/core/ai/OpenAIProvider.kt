package com.aeonmatrix.terminex.core.ai


class OpenAIProvider:AIProvider {


    override fun name():String {

        return "OpenAI"

    }


    override fun generate(
        prompt:String
    ):AIResponse {


        return AIResponse(
            provider = name(),
            content = "AI analysis completed: $prompt",
            confidence = 0.95
        )

    }

}
