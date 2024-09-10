@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package ympa_kotlin_wiremock_server.models

import com.fasterxml.jackson.annotation.JsonProperty

data class AgeDTO(
    @field:JsonProperty("value")
    val `value`: java.math.BigDecimal,

    @field:JsonProperty("ageUnit")
    val ageUnit: AgeUnitType,

)
