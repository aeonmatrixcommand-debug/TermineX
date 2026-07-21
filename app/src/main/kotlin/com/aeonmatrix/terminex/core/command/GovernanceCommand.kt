package com.aeonmatrix.terminex.core.command

import com.aeonmatrix.terminex.core.governance.*

class GovernanceCommand:Command {

    override fun execute(){

        val policy =
            AIApprovalPolicy(
                requireHumanApproval = true,
                maxRiskLevel = "LOW"
            )

        println("Human Approval : ${policy.requireHumanApproval}")
        println("Max Risk Level : ${policy.maxRiskLevel}")

    }

}
