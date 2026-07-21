package com.aeonmatrix.terminex.core.config


class ConfigManager {


    fun load():Config {

        return Config(
            name="TermineX",
            version="0.1.0"
        )

    }

}
