package com.aeonmatrix.terminex.core.observability


class AITraceLogger {


    fun log(
        trace:AITrace
    ){

        println(
            "TRACE : ${trace.action} | ${trace.provider} | ${trace.confidence}"
        )

    }

}
