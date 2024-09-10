@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package ympa_kotlin_wiremock_server.models

import com.fasterxml.jackson.annotation.JsonProperty

data class GoodsFeedbackStatisticsDTO(
    @field:JsonProperty("rating")
    val rating: kotlin.Int,

    @field:JsonProperty("commentsCount")
    val commentsCount: kotlin.Long,

    @field:JsonProperty("recommended")
    val recommended: kotlin.Boolean? = null,

    @field:JsonProperty("paidAmount")
    val paidAmount: kotlin.Long? = null,

)
