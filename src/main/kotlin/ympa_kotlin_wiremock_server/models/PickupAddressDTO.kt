@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package ympa_kotlin_wiremock_server.models

import com.fasterxml.jackson.annotation.JsonProperty

data class PickupAddressDTO(
    @field:JsonProperty("country")
    val country: kotlin.String? = null,

    @field:JsonProperty("city")
    val city: kotlin.String? = null,

    @field:JsonProperty("street")
    val street: kotlin.String? = null,

    @field:JsonProperty("house")
    val house: kotlin.String? = null,

    @field:JsonProperty("postcode")
    val postcode: kotlin.String? = null,

)
