@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package ympa_kotlin_wiremock_server.models

import com.fasterxml.jackson.annotation.JsonProperty

data class OrderItemDTO(
    @field:JsonProperty("id")
    val id: kotlin.Long? = null,

    @field:JsonProperty("offerId")
    val offerId: kotlin.String? = null,

    @field:JsonProperty("offerName")
    val offerName: kotlin.String? = null,

    @field:JsonProperty("price")
    val price: java.math.BigDecimal? = null,

    @field:JsonProperty("buyerPrice")
    val buyerPrice: java.math.BigDecimal? = null,

    @field:JsonProperty("buyerPriceBeforeDiscount")
    val buyerPriceBeforeDiscount: java.math.BigDecimal? = null,

    @field:JsonProperty("priceBeforeDiscount")
    val priceBeforeDiscount: java.math.BigDecimal? = null,

    @field:JsonProperty("count")
    val count: kotlin.Int? = null,

    @field:JsonProperty("vat")
    val vat: OrderVatType? = null,

    @field:JsonProperty("shopSku")
    val shopSku: kotlin.String? = null,

    @field:JsonProperty("subsidy")
    val subsidy: java.math.BigDecimal? = null,

    @field:JsonProperty("partnerWarehouseId")
    val partnerWarehouseId: kotlin.String? = null,

    @field:JsonProperty("promos")
    val promos: kotlin.collections.List<OrderItemPromoDTO>? = null,

    @field:JsonProperty("instances")
    val instances: kotlin.collections.List<OrderItemInstanceDTO>? = null,

    @field:JsonProperty("details")
    val details: kotlin.collections.List<OrderItemDetailDTO>? = null,

    @field:JsonProperty("subsidies")
    val subsidies: kotlin.collections.List<OrderItemSubsidyDTO>? = null,

    @field:JsonProperty("requiredInstanceTypes")
    val requiredInstanceTypes: kotlin.collections.List<OrderItemInstanceType>? = null,

)
