@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package ympa_kotlin_wiremock_server.models

import com.fasterxml.jackson.annotation.JsonProperty

data class GoodsFeedbackDescriptionDTO(
    @field:JsonProperty("advantages")
    val advantages: kotlin.String? = null,

    @field:JsonProperty("disadvantages")
    val disadvantages: kotlin.String? = null,

    @field:JsonProperty("comment")
    val comment: kotlin.String? = null,

)
