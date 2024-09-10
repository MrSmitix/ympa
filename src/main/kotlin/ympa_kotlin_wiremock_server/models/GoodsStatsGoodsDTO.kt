@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package ympa_kotlin_wiremock_server.models

import com.fasterxml.jackson.annotation.JsonProperty

data class GoodsStatsGoodsDTO(
    @field:JsonProperty("shopSku")
    val shopSku: kotlin.String? = null,

    @field:JsonProperty("marketSku")
    val marketSku: kotlin.Long? = null,

    @field:JsonProperty("name")
    val name: kotlin.String? = null,

    @field:JsonProperty("price")
    val price: java.math.BigDecimal? = null,

    @field:JsonProperty("categoryId")
    val categoryId: kotlin.Long? = null,

    @field:JsonProperty("categoryName")
    val categoryName: kotlin.String? = null,

    @field:JsonProperty("weightDimensions")
    val weightDimensions: GoodsStatsWeightDimensionsDTO? = null,

    @field:JsonProperty("warehouses")
    val warehouses: kotlin.collections.List<GoodsStatsWarehouseDTO>? = null,

    @field:JsonProperty("tariffs")
    val tariffs: kotlin.collections.List<TariffDTO>? = null,

    @field:JsonProperty("pictures")
    val pictures: kotlin.collections.List<kotlin.String>? = null,

)
