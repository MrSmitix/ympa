@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package ympa_kotlin_wiremock_server.models

import com.fasterxml.jackson.annotation.JsonProperty

data class UpdateGoodsFeedbackCommentRequest(
    @field:JsonProperty("feedbackId")
    val feedbackId: kotlin.Long,

    @field:JsonProperty("comment")
    val comment: UpdateGoodsFeedbackCommentDTO,

)
