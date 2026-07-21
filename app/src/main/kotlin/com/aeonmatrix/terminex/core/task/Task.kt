package com.aeonmatrix.terminex.core.task

data class Task(
    val id:String,
    val title:String,
    var completed:Boolean=false
)
