@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package ympa_kotlin_wiremock_server.models

import com.fasterxml.jackson.annotation.JsonProperty

data class OrderDTO(
    @field:JsonProperty("items")
    val items: kotlin.collections.List<OrderItemDTO>,

    @field:JsonProperty("id")
    val id: kotlin.Long? = null,

    @field:JsonProperty("status")
    val status: OrderStatusType? = null,

    @field:JsonProperty("substatus")
    val substatus: OrderSubstatusType? = null,

    @field:JsonProperty("creationDate")
    val creationDate: kotlin.String? = null,

    @field:JsonProperty("updatedAt")
    val updatedAt: kotlin.String? = null,

    @field:JsonProperty("currency")
    val currency: CurrencyType? = null,

    @field:JsonProperty("itemsTotal")
    val itemsTotal: java.math.BigDecimal? = null,

    @field:JsonProperty("deliveryTotal")
    val deliveryTotal: java.math.BigDecimal? = null,

    @field:JsonProperty("buyerItemsTotal")
    val buyerItemsTotal: java.math.BigDecimal? = null,

    @field:JsonProperty("buyerTotal")
    val buyerTotal: java.math.BigDecimal? = null,

    @field:JsonProperty("buyerItemsTotalBeforeDiscount")
    val buyerItemsTotalBeforeDiscount: java.math.BigDecimal? = null,

    @field:JsonProperty("buyerTotalBeforeDiscount")
    val buyerTotalBeforeDiscount: java.math.BigDecimal? = null,

    @field:JsonProperty("paymentType")
    val paymentType: OrderPaymentType? = null,

    @field:JsonProperty("paymentMethod")
    val paymentMethod: OrderPaymentMethodType? = null,

    @field:JsonProperty("fake")
    val fake: kotlin.Boolean? = null,

    @field:JsonProperty("subsidies")
    val subsidies: kotlin.collections.List<OrderSubsidyDTO>? = null,

    @field:JsonProperty("delivery")
    val delivery: OrderDeliveryDTO? = null,

    @field:JsonProperty("buyer")
    val buyer: OrderBuyerDTO? = null,

    @field:JsonProperty("notes")
    val notes: kotlin.String? = null,

    @field:JsonProperty("taxSystem")
    val taxSystem: OrderTaxSystemType? = null,

    @field:JsonProperty("cancelRequested")
    val cancelRequested: kotlin.Boolean? = null,

    @field:JsonProperty("expiryDate")
    val expiryDate: kotlin.String? = null,

)
