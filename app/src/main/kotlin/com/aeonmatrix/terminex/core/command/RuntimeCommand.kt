package com.aeonmatrix.terminex.core.command


import com.aeonmatrix.terminex.core.runtime.RuntimeManager


class RuntimeCommand:Command {


    override fun execute(){

        RuntimeManager()
            .boot()

    }

}
