@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package ympa_kotlin_wiremock_server.models

import com.fasterxml.jackson.annotation.JsonProperty

data class GoodsFeedbackListDTO(
    @field:JsonProperty("feedbacks")
    val feedbacks: kotlin.collections.List<GoodsFeedbackDTO>,

    @field:JsonProperty("paging")
    val paging: ForwardScrollingPagerDTO? = null,

)
