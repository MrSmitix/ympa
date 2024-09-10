@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package ympa_kotlin_wiremock_server.models

import com.fasterxml.jackson.annotation.JsonProperty

data class FeedbackListDTO(
    @field:JsonProperty("feedbackList")
    val feedbackList: kotlin.collections.List<FeedbackDTO>,

    @field:JsonProperty("paging")
    val paging: ScrollingPagerDTO? = null,

)
