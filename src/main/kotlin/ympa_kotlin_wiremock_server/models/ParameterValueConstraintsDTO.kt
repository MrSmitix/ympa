@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package ympa_kotlin_wiremock_server.models

import com.fasterxml.jackson.annotation.JsonProperty

data class ParameterValueConstraintsDTO(
    @field:JsonProperty("minValue")
    val minValue: kotlin.Double? = null,

    @field:JsonProperty("maxValue")
    val maxValue: kotlin.Double? = null,

    @field:JsonProperty("maxLength")
    val maxLength: kotlin.Int? = null,

)
