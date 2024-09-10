@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package ympa_kotlin_wiremock_server.models

import com.fasterxml.jackson.annotation.JsonProperty

data class UpdateGoodsFeedbackCommentDTO(
    @field:JsonProperty("text")
    val text: kotlin.String,

    @field:JsonProperty("id")
    val id: kotlin.Long? = null,

    @field:JsonProperty("parentId")
    val parentId: kotlin.Long? = null,

)
