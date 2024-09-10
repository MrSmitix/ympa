@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package ympa_kotlin_wiremock_server.models

import com.fasterxml.jackson.annotation.JsonProperty

data class ApiErrorDTO(
    @field:JsonProperty("code")
    val code: kotlin.String,

    @field:JsonProperty("message")
    val message: kotlin.String? = null,

)
