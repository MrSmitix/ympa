@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package ympa_kotlin_wiremock_server.models

import com.fasterxml.jackson.annotation.JsonProperty

data class ConfirmShipmentRequest(
    @field:JsonProperty("externalShipmentId")
    val externalShipmentId: kotlin.String? = null,

)
