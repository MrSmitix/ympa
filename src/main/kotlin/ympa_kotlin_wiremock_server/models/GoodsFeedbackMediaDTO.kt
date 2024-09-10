@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package ympa_kotlin_wiremock_server.models

import com.fasterxml.jackson.annotation.JsonProperty

data class GoodsFeedbackMediaDTO(
    @field:JsonProperty("photos")
    val photos: kotlin.collections.List<kotlin.String>? = null,

    @field:JsonProperty("videos")
    val videos: kotlin.collections.List<kotlin.String>? = null,

)
