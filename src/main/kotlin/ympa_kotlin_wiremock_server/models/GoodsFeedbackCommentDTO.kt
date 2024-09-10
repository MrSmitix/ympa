@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package ympa_kotlin_wiremock_server.models

import com.fasterxml.jackson.annotation.JsonProperty

data class GoodsFeedbackCommentDTO(
    @field:JsonProperty("id")
    val id: kotlin.Long,

    @field:JsonProperty("text")
    val text: kotlin.String,

    @field:JsonProperty("author")
    val author: GoodsFeedbackCommentAuthorDTO,

    @field:JsonProperty("status")
    val status: GoodsFeedbackCommentStatusType,

    @field:JsonProperty("canModify")
    val canModify: kotlin.Boolean? = null,

    @field:JsonProperty("parentId")
    val parentId: kotlin.Long? = null,

)
