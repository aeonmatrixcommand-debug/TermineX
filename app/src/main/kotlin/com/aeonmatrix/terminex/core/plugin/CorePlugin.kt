package com.aeonmatrix.terminex.core.plugin


class CorePlugin:Plugin {


    override fun name():String {

        return "Core Plugin"

    }


    override fun start(){

        println(
            "${name()} started"
        )

    }

}
