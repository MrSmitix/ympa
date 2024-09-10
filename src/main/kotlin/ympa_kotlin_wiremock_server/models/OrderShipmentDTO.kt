@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package ympa_kotlin_wiremock_server.models

import com.fasterxml.jackson.annotation.JsonProperty

data class OrderShipmentDTO(
    @field:JsonProperty("id")
    val id: kotlin.Long? = null,

    @field:JsonProperty("shipmentDate")
    val shipmentDate: kotlin.String? = null,

    @field:JsonProperty("shipmentTime")
    val shipmentTime: kotlin.String? = null,

    @field:JsonProperty("tracks")
    val tracks: kotlin.collections.List<OrderTrackDTO>? = null,

    @field:JsonProperty("boxes")
    val boxes: kotlin.collections.List<OrderParcelBoxDTO>? = null,

)
