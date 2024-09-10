@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package ympa_kotlin_wiremock_server.models

import com.fasterxml.jackson.annotation.JsonProperty

data class ReturnDecisionDTO(
    @field:JsonProperty("returnItemId")
    val returnItemId: kotlin.Long? = null,

    @field:JsonProperty("count")
    val count: kotlin.Int? = null,

    @field:JsonProperty("comment")
    val comment: kotlin.String? = null,

    @field:JsonProperty("reasonType")
    val reasonType: ReturnDecisionReasonType? = null,

    @field:JsonProperty("subreasonType")
    val subreasonType: ReturnDecisionSubreasonType? = null,

    @field:JsonProperty("decisionType")
    val decisionType: ReturnDecisionType? = null,

    @field:JsonProperty("refundAmount")
    val refundAmount: kotlin.Long? = null,

    @field:JsonProperty("partnerCompensation")
    val partnerCompensation: kotlin.Long? = null,

    @field:JsonProperty("images")
    val images: kotlin.collections.List<kotlin.String>? = null,

)
