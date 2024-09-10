@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package ympa_kotlin_wiremock_server.models

import com.fasterxml.jackson.annotation.JsonProperty

data class FeedbackCommentDTO(
    @field:JsonProperty("id")
    val id: kotlin.Long? = null,

    @field:JsonProperty("parentId")
    val parentId: kotlin.Long? = null,

    @field:JsonProperty("body")
    val body: kotlin.String? = null,

    @field:JsonProperty("createdAt")
    val createdAt: java.time.OffsetDateTime? = null,

    @field:JsonProperty("updatedAt")
    val updatedAt: java.time.OffsetDateTime? = null,

    @field:JsonProperty("author")
    val author: FeedbackCommentAuthorDTO? = null,

    @field:JsonProperty("children")
    val children: kotlin.collections.List<FeedbackCommentDTO>? = null,

)
