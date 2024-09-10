@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package ympa_kotlin_wiremock_server.models

import com.fasterxml.jackson.annotation.JsonProperty

data class WarehouseAddressDTO(
    @field:JsonProperty("city")
    val city: kotlin.String,

    @field:JsonProperty("gps")
    val gps: GpsDTO,

    @field:JsonProperty("street")
    val street: kotlin.String? = null,

    @field:JsonProperty("number")
    val number: kotlin.String? = null,

    @field:JsonProperty("building")
    val building: kotlin.String? = null,

    @field:JsonProperty("block")
    val block: kotlin.String? = null,

)
