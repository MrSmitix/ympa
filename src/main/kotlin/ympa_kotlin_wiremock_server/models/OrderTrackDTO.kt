@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package ympa_kotlin_wiremock_server.models

import com.fasterxml.jackson.annotation.JsonProperty

data class OrderTrackDTO(
    @field:JsonProperty("trackCode")
    val trackCode: kotlin.String? = null,

    @field:JsonProperty("deliveryServiceId")
    val deliveryServiceId: kotlin.Long? = null,

)
