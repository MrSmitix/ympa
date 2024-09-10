@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package ympa_kotlin_wiremock_server.models

import com.fasterxml.jackson.annotation.JsonProperty

data class ParameterValueOptionDTO(
    @field:JsonProperty("id")
    val id: kotlin.Long,

    @field:JsonProperty("value")
    val `value`: kotlin.String,

    @field:JsonProperty("description")
    val description: kotlin.String? = null,

)
