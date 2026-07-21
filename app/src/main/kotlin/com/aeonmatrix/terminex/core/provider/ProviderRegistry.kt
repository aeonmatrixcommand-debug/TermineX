package com.aeonmatrix.terminex.core.provider

import com.aeonmatrix.terminex.core.ai.*

class ProviderRegistry {


    private val providers =
        mutableMapOf<String,AIProvider>()


    fun register(
        provider:AIProvider
    ){

        providers[provider.name()] = provider

    }


    fun get(
        name:String
    ):AIProvider?{

        return providers[name]

    }


    fun list():List<String>{

        return providers.keys.toList()

    }

}
