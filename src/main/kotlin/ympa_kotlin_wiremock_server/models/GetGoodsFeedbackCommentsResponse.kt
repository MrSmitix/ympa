@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package ympa_kotlin_wiremock_server.models

import com.fasterxml.jackson.annotation.JsonProperty

data class GetGoodsFeedbackCommentsResponse(
    @field:JsonProperty("status")
    val status: ApiResponseStatusType? = null,

    @field:JsonProperty("result")
    val result: GoodsFeedbackCommentListDTO? = null,

)
