package com.aeonmatrix.terminex.core.governance

data class AIApprovalPolicy(
    val requireHumanApproval:Boolean,
    val maxRiskLevel:String
)
