package com.aeonmatrix.terminex.core.runtime


import com.aeonmatrix.terminex.core.config.*
import com.aeonmatrix.terminex.core.plugin.*


class RuntimeManager {


    fun boot(){


        val config =
            ConfigManager()
                .load()


        println(
            "${config.name} Runtime ${config.version}"
        )


        val plugin =
            CorePlugin()


        plugin.start()

    }

}
