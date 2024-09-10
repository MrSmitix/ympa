@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package ympa_kotlin_wiremock_server.models

import com.fasterxml.jackson.annotation.JsonProperty

data class OrderDeliveryAddressDTO(
    @field:JsonProperty("country")
    val country: kotlin.String? = null,

    @field:JsonProperty("postcode")
    val postcode: kotlin.String? = null,

    @field:JsonProperty("city")
    val city: kotlin.String? = null,

    @field:JsonProperty("district")
    val district: kotlin.String? = null,

    @field:JsonProperty("subway")
    val subway: kotlin.String? = null,

    @field:JsonProperty("street")
    val street: kotlin.String? = null,

    @field:JsonProperty("house")
    val house: kotlin.String? = null,

    @field:JsonProperty("block")
    val block: kotlin.String? = null,

    @field:JsonProperty("entrance")
    val entrance: kotlin.String? = null,

    @field:JsonProperty("entryphone")
    val entryphone: kotlin.String? = null,

    @field:JsonProperty("floor")
    val floor: kotlin.String? = null,

    @field:JsonProperty("apartment")
    val apartment: kotlin.String? = null,

    @field:JsonProperty("phone")
    val phone: kotlin.String? = null,

    @field:JsonProperty("recipient")
    val recipient: kotlin.String? = null,

    @field:JsonProperty("gps")
    val gps: GpsDTO? = null,

)
