@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package ympa_kotlin_wiremock_server.models

import com.fasterxml.jackson.annotation.JsonProperty

data class GetWarehouseStocksDTO(
    @field:JsonProperty("warehouses")
    val warehouses: kotlin.collections.List<WarehouseOffersDTO>,

    @field:JsonProperty("paging")
    val paging: ScrollingPagerDTO? = null,

)
