@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package ympa_kotlin_wiremock_server.models

import com.fasterxml.jackson.annotation.JsonProperty

data class ReturnDTO(
    @field:JsonProperty("items")
    val items: kotlin.collections.List<ReturnItemDTO>,

    @field:JsonProperty("id")
    val id: kotlin.Long? = null,

    @field:JsonProperty("orderId")
    val orderId: kotlin.Long? = null,

    @field:JsonProperty("creationDate")
    val creationDate: java.time.OffsetDateTime? = null,

    @field:JsonProperty("updateDate")
    val updateDate: java.time.OffsetDateTime? = null,

    @field:JsonProperty("refundStatus")
    val refundStatus: RefundStatusType? = null,

    @field:JsonProperty("logisticPickupPoint")
    val logisticPickupPoint: LogisticPickupPointDTO? = null,

    @field:JsonProperty("shipmentRecipientType")
    val shipmentRecipientType: RecipientType? = null,

    @field:JsonProperty("shipmentStatus")
    val shipmentStatus: ReturnShipmentStatusType? = null,

    @field:JsonProperty("refundAmount")
    val refundAmount: kotlin.Long? = null,

    @field:JsonProperty("returnType")
    val returnType: ReturnType? = null,

    @field:JsonProperty("fastReturn")
    val fastReturn: kotlin.Boolean? = null,

)
