package com.aeonmatrix.terminex.core.storage


class Storage {


    private val data =
        mutableMapOf<String,String>()


    fun save(
        key:String,
        value:String
    ){

        data[key]=value

    }


    fun read(
        key:String
    ):String?{

        return data[key]

    }

}
