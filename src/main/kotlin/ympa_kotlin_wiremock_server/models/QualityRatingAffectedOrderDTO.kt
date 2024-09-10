@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package ympa_kotlin_wiremock_server.models

import com.fasterxml.jackson.annotation.JsonProperty

data class QualityRatingAffectedOrderDTO(
    @field:JsonProperty("orderId")
    val orderId: kotlin.Long,

    @field:JsonProperty("description")
    val description: kotlin.String,

    @field:JsonProperty("componentType")
    val componentType: AffectedOrderQualityRatingComponentType,

)
