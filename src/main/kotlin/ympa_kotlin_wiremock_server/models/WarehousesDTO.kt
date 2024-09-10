@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package ympa_kotlin_wiremock_server.models

import com.fasterxml.jackson.annotation.JsonProperty

data class WarehousesDTO(
    @field:JsonProperty("warehouses")
    val warehouses: kotlin.collections.List<WarehouseDTO>,

    @field:JsonProperty("warehouseGroups")
    val warehouseGroups: kotlin.collections.List<WarehouseGroupDTO>,

)
