@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package ympa_kotlin_wiremock_server.models

import com.fasterxml.jackson.annotation.JsonProperty

data class OutletAddressDTO(
    @field:JsonProperty("regionId")
    val regionId: kotlin.Long,

    @field:JsonProperty("street")
    val street: kotlin.String? = null,

    @field:JsonProperty("number")
    val number: kotlin.String? = null,

    @field:JsonProperty("building")
    val building: kotlin.String? = null,

    @field:JsonProperty("estate")
    val estate: kotlin.String? = null,

    @field:JsonProperty("block")
    val block: kotlin.String? = null,

    @field:JsonProperty("additional")
    val additional: kotlin.String? = null,

    @field:JsonProperty("km")
    val km: kotlin.Int? = null,

    @field:JsonProperty("city")
    val city: kotlin.String? = null,

)
