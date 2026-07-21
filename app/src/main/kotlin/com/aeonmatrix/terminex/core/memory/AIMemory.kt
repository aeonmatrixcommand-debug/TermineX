package com.aeonmatrix.terminex.core.memory

class AIMemory {

    private val records =
        mutableListOf<String>()

    fun remember(value:String){
        records.add(value)
    }

    fun recall():List<String>{
        return records
    }

}
