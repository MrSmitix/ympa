@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package ympa_kotlin_wiremock_server.models

import com.fasterxml.jackson.annotation.JsonProperty

data class FulfillmentWarehousesDTO(
    @field:JsonProperty("warehouses")
    val warehouses: kotlin.collections.List<FulfillmentWarehouseDTO>,

)
