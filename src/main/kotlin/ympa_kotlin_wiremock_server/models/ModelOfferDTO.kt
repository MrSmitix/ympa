@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package ympa_kotlin_wiremock_server.models

import com.fasterxml.jackson.annotation.JsonProperty

data class ModelOfferDTO(
    @field:JsonProperty("discount")
    val discount: kotlin.Int? = null,

    @field:JsonProperty("name")
    val name: kotlin.String? = null,

    @field:JsonProperty("pos")
    val pos: kotlin.Int? = null,

    @field:JsonProperty("preDiscountPrice")
    val preDiscountPrice: java.math.BigDecimal? = null,

    @field:JsonProperty("price")
    val price: java.math.BigDecimal? = null,

    @field:JsonProperty("regionId")
    val regionId: kotlin.Long? = null,

    @field:JsonProperty("shippingCost")
    val shippingCost: java.math.BigDecimal? = null,

    @field:JsonProperty("shopName")
    val shopName: kotlin.String? = null,

    @field:JsonProperty("shopRating")
    val shopRating: kotlin.Int? = null,

    @field:JsonProperty("inStock")
    val inStock: kotlin.Int? = null,

)
