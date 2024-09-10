@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package ympa_kotlin_wiremock_server.models

import com.fasterxml.jackson.annotation.JsonProperty

data class WarehouseDTO(
    @field:JsonProperty("id")
    val id: kotlin.Long,

    @field:JsonProperty("name")
    val name: kotlin.String,

    @field:JsonProperty("campaignId")
    val campaignId: kotlin.Long,

    @field:JsonProperty("express")
    val express: kotlin.Boolean,

    @field:JsonProperty("address")
    val address: WarehouseAddressDTO? = null,

)
