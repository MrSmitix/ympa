@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package ympa_kotlin_wiremock_server.models

import com.fasterxml.jackson.annotation.JsonProperty

data class SetOrderDeliveryTrackCodeRequest(
    @field:JsonProperty("trackCode")
    val trackCode: kotlin.String,

    @field:JsonProperty("deliveryServiceId")
    val deliveryServiceId: kotlin.Long,

)
