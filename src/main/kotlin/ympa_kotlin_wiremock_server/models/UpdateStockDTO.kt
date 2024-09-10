@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package ympa_kotlin_wiremock_server.models

import com.fasterxml.jackson.annotation.JsonProperty

data class UpdateStockDTO(
    @field:JsonProperty("sku")
    val sku: kotlin.String,

    @field:JsonProperty("items")
    val items: kotlin.collections.List<UpdateStockItemDTO>,

)
