@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package ympa_kotlin_wiremock_server.models

import com.fasterxml.jackson.annotation.JsonProperty

data class ExtensionShipmentDTO(
    @field:JsonProperty("availableActions")
    val availableActions: kotlin.collections.Set<ShipmentActionType>,

    @field:JsonProperty("currentStatus")
    val currentStatus: ShipmentStatusChangeDTO? = null,

)
