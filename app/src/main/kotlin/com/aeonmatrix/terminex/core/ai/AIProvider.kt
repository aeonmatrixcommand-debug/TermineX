package com.aeonmatrix.terminex.core.ai

interface AIProvider {

    fun name():String

    fun generate(
        prompt:String
    ):AIResponse

}
