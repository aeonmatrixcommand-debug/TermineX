package com.aeonmatrix.terminex.core.memory


class PersistentMemory {


    private val store =
        mutableMapOf<String,String>()


    fun save(
        key:String,
        value:String
    ){

        store[key]=value

    }


    fun load(
        key:String
    ):String?{

        return store[key]

    }


}
