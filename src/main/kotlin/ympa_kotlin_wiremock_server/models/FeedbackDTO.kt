@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package ympa_kotlin_wiremock_server.models

import com.fasterxml.jackson.annotation.JsonProperty

data class FeedbackDTO(
    @field:JsonProperty("comments")
    val comments: kotlin.collections.List<FeedbackCommentDTO>,

    @field:JsonProperty("id")
    val id: kotlin.Long? = null,

    @field:JsonProperty("createdAt")
    val createdAt: java.time.OffsetDateTime? = null,

    @field:JsonProperty("text")
    val text: kotlin.String? = null,

    @field:JsonProperty("state")
    val state: FeedbackStateType? = null,

    @field:JsonProperty("author")
    val author: FeedbackAuthorDTO? = null,

    @field:JsonProperty("pro")
    val pro: kotlin.String? = null,

    @field:JsonProperty("contra")
    val contra: kotlin.String? = null,

    @field:JsonProperty("shop")
    val shop: FeedbackShopDTO? = null,

    @field:JsonProperty("resolved")
    val resolved: kotlin.Boolean? = null,

    @field:JsonProperty("verified")
    val verified: kotlin.Boolean? = null,

    @field:JsonProperty("recommend")
    val recommend: kotlin.Boolean? = null,

    @field:JsonProperty("grades")
    val grades: FeedbackGradesDTO? = null,

    @field:JsonProperty("order")
    val order: FeedbackOrderDTO? = null,

)
