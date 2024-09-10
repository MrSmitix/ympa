@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package ympa_kotlin_wiremock_server.models

import com.fasterxml.jackson.annotation.JsonProperty

data class TariffParameterDTO(
    @field:JsonProperty("name")
    val name: kotlin.String,

    @field:JsonProperty("value")
    val `value`: kotlin.String,

)
