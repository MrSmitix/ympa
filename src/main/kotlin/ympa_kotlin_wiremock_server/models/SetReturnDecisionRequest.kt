@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package ympa_kotlin_wiremock_server.models

import com.fasterxml.jackson.annotation.JsonProperty

data class SetReturnDecisionRequest(
    @field:JsonProperty("returnItemId")
    val returnItemId: kotlin.Long,

    @field:JsonProperty("decisionType")
    val decisionType: ReturnRequestDecisionType,

    @field:JsonProperty("comment")
    val comment: kotlin.String? = null,

)
