@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package ympa_kotlin_wiremock_server.models

import com.fasterxml.jackson.annotation.JsonProperty

data class GpsDTO(
    @field:JsonProperty("latitude")
    val latitude: java.math.BigDecimal,

    @field:JsonProperty("longitude")
    val longitude: java.math.BigDecimal,

)
