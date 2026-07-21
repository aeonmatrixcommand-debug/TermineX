package com.aeonmatrix.terminex.core.governance


class RiskEvaluator {


    fun evaluate(
        action:String
    ):String{


        return when {

            action.contains("delete") ->
                "HIGH"


            action.contains("modify") ->
                "MEDIUM"


            else ->
                "LOW"

        }

    }

}
