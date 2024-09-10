@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package ympa_kotlin_wiremock_server.models

import com.fasterxml.jackson.annotation.JsonProperty

data class SearchShipmentsResponseDTO(
    @field:JsonProperty("shipments")
    val shipments: kotlin.collections.List<ShipmentInfoDTO>,

    @field:JsonProperty("paging")
    val paging: ForwardScrollingPagerDTO? = null,

)
