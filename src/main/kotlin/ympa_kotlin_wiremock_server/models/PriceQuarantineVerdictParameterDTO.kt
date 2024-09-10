@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package ympa_kotlin_wiremock_server.models

import com.fasterxml.jackson.annotation.JsonProperty

data class PriceQuarantineVerdictParameterDTO(
    @field:JsonProperty("name")
    val name: PriceQuarantineVerdictParamNameType,

    @field:JsonProperty("value")
    val `value`: kotlin.String,

)
