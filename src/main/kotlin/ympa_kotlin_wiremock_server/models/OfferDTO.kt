@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package ympa_kotlin_wiremock_server.models

import com.fasterxml.jackson.annotation.JsonProperty

data class OfferDTO(
    @field:JsonProperty("modelId")
    val modelId: kotlin.Long,

    @field:JsonProperty("price")
    val price: java.math.BigDecimal? = null,

    @field:JsonProperty("feedId")
    val feedId: kotlin.Long? = null,

    @field:JsonProperty("id")
    val id: kotlin.String? = null,

    @field:JsonProperty("shopCategoryId")
    val shopCategoryId: kotlin.String? = null,

    @field:JsonProperty("marketCategoryId")
    val marketCategoryId: kotlin.Int? = null,

    @field:JsonProperty("preDiscountPrice")
    val preDiscountPrice: java.math.BigDecimal? = null,

    @field:JsonProperty("discount")
    val discount: kotlin.Int? = null,

    @field:JsonProperty("cutPrice")
    val cutPrice: kotlin.Boolean? = null,

    @field:JsonProperty("url")
    val url: kotlin.String? = null,

    @field:JsonProperty("name")
    val name: kotlin.String? = null,

    @field:JsonProperty("currency")
    val currency: CurrencyType? = null,

    @field:JsonProperty("bid")
    val bid: java.math.BigDecimal? = null,

    @field:JsonProperty("cbid")
    val cbid: java.math.BigDecimal? = null,

    @field:JsonProperty("fee")
    val fee: java.math.BigDecimal? = null,

    @field:JsonProperty("blocked")
    val blocked: kotlin.Boolean? = null,

)
