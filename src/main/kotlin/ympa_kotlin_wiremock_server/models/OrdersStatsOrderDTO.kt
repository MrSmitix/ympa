@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package ympa_kotlin_wiremock_server.models

import com.fasterxml.jackson.annotation.JsonProperty

data class OrdersStatsOrderDTO(
    @field:JsonProperty("items")
    val items: kotlin.collections.List<OrdersStatsItemDTO>,

    @field:JsonProperty("payments")
    val payments: kotlin.collections.List<OrdersStatsPaymentDTO>,

    @field:JsonProperty("commissions")
    val commissions: kotlin.collections.List<OrdersStatsCommissionDTO>,

    @field:JsonProperty("id")
    val id: kotlin.Long? = null,

    @field:JsonProperty("creationDate")
    val creationDate: java.time.LocalDate? = null,

    @field:JsonProperty("statusUpdateDate")
    val statusUpdateDate: java.time.OffsetDateTime? = null,

    @field:JsonProperty("status")
    val status: OrderStatsStatusType? = null,

    @field:JsonProperty("partnerOrderId")
    val partnerOrderId: kotlin.String? = null,

    @field:JsonProperty("paymentType")
    val paymentType: OrdersStatsOrderPaymentType? = null,

    @field:JsonProperty("fake")
    val fake: kotlin.Boolean? = null,

    @field:JsonProperty("deliveryRegion")
    val deliveryRegion: OrdersStatsDeliveryRegionDTO? = null,

    @field:JsonProperty("initialItems")
    val initialItems: kotlin.collections.List<OrdersStatsItemDTO>? = null,

)
