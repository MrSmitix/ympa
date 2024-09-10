@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package ympa_kotlin_wiremock_server.models

import com.fasterxml.jackson.annotation.JsonProperty

data class WarehouseGroupDTO(
    @field:JsonProperty("name")
    val name: kotlin.String,

    @field:JsonProperty("mainWarehouse")
    val mainWarehouse: WarehouseDTO,

    @field:JsonProperty("warehouses")
    val warehouses: kotlin.collections.List<WarehouseDTO>,

)
