package com.aeonmatrix.terminex.core.event

data class Event(
    val name: String,
    val timestamp: Long = System.currentTimeMillis()
)
