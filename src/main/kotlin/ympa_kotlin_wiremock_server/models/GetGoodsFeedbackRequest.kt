@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package ympa_kotlin_wiremock_server.models

import com.fasterxml.jackson.annotation.JsonProperty

data class GetGoodsFeedbackRequest(
    @field:JsonProperty("dateTimeFrom")
    val dateTimeFrom: java.time.OffsetDateTime? = null,

    @field:JsonProperty("dateTimeTo")
    val dateTimeTo: java.time.OffsetDateTime? = null,

    @field:JsonProperty("reactionStatus")
    val reactionStatus: FeedbackReactionStatusType? = null,

    @field:JsonProperty("ratingValues")
    val ratingValues: kotlin.collections.Set<kotlin.Int>? = null,

    @field:JsonProperty("modelIds")
    val modelIds: kotlin.collections.Set<kotlin.Long>? = null,

    @field:JsonProperty("paid")
    val paid: kotlin.Boolean? = null,

)
