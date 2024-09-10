@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package ympa_kotlin_wiremock_server.models

import com.fasterxml.jackson.annotation.JsonProperty

data class DeliveryServicesDTO(
    @field:JsonProperty("deliveryService")
    val deliveryService: kotlin.collections.List<DeliveryServiceInfoDTO>,

)
