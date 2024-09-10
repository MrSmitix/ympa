@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package ympa_kotlin_wiremock_server.models

import com.fasterxml.jackson.annotation.JsonProperty

data class ParcelBoxLabelDTO(
    @field:JsonProperty("url")
    val url: kotlin.String,

    @field:JsonProperty("supplierName")
    val supplierName: kotlin.String,

    @field:JsonProperty("deliveryServiceName")
    val deliveryServiceName: kotlin.String,

    @field:JsonProperty("orderId")
    val orderId: kotlin.Long,

    @field:JsonProperty("orderNum")
    val orderNum: kotlin.String,

    @field:JsonProperty("recipientName")
    val recipientName: kotlin.String,

    @field:JsonProperty("boxId")
    val boxId: kotlin.Long,

    @field:JsonProperty("fulfilmentId")
    val fulfilmentId: kotlin.String,

    @field:JsonProperty("place")
    val place: kotlin.String,

    @field:JsonProperty("weight")
    val weight: kotlin.String,

    @field:JsonProperty("deliveryServiceId")
    val deliveryServiceId: kotlin.String,

    @field:JsonProperty("deliveryAddress")
    val deliveryAddress: kotlin.String? = null,

    @field:JsonProperty("shipmentDate")
    val shipmentDate: kotlin.String? = null,

)
