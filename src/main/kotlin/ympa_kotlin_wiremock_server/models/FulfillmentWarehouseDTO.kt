@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package ympa_kotlin_wiremock_server.models

import com.fasterxml.jackson.annotation.JsonProperty

data class FulfillmentWarehouseDTO(
    @field:JsonProperty("id")
    val id: kotlin.Long,

    @field:JsonProperty("name")
    val name: kotlin.String,

    @field:JsonProperty("address")
    val address: WarehouseAddressDTO? = null,

)
