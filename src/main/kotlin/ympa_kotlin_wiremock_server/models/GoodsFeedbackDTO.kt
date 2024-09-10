@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package ympa_kotlin_wiremock_server.models

import com.fasterxml.jackson.annotation.JsonProperty

data class GoodsFeedbackDTO(
    @field:JsonProperty("feedbackId")
    val feedbackId: kotlin.Long,

    @field:JsonProperty("createdAt")
    val createdAt: java.time.OffsetDateTime,

    @field:JsonProperty("needReaction")
    val needReaction: kotlin.Boolean,

    @field:JsonProperty("identifiers")
    val identifiers: GoodsFeedbackIdentifiersDTO,

    @field:JsonProperty("statistics")
    val statistics: GoodsFeedbackStatisticsDTO,

    @field:JsonProperty("author")
    val author: kotlin.String? = null,

    @field:JsonProperty("description")
    val description: GoodsFeedbackDescriptionDTO? = null,

    @field:JsonProperty("media")
    val media: GoodsFeedbackMediaDTO? = null,

)
