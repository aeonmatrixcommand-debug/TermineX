package com.aeonmatrix.terminex.core.observability

data class AITrace(
    val action:String,
    val provider:String,
    val confidence:Double
)
