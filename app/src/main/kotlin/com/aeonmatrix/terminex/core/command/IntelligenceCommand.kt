package com.aeonmatrix.terminex.core.command


import com.aeonmatrix.terminex.core.intelligence.IntelligenceEngine


class IntelligenceCommand : Command {


    override fun execute(){

        val engine =
            IntelligenceEngine()


        engine.status()

        engine.analyze(
            "system-check"
        )

    }

}
