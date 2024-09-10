@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package ympa_kotlin_wiremock_server.models

import com.fasterxml.jackson.annotation.JsonProperty

data class ShipmentStatusChangeDTO(
    @field:JsonProperty("status")
    val status: ShipmentStatusType? = null,

    @field:JsonProperty("description")
    val description: kotlin.String? = null,

    @field:JsonProperty("updateTime")
    val updateTime: java.time.OffsetDateTime? = null,

)
