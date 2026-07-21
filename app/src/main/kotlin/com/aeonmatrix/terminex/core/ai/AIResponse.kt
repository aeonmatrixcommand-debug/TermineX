package com.aeonmatrix.terminex.core.ai

data class AIResponse(
    val provider:String,
    val content:String,
    val confidence:Double
)
