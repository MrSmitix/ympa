@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package ympa_kotlin_wiremock_server.models

import com.fasterxml.jackson.annotation.JsonProperty

data class OfferConditionDTO(
    @field:JsonProperty("type")
    val type: OfferConditionType? = null,

    @field:JsonProperty("quality")
    val quality: OfferConditionQualityType? = null,

    @field:JsonProperty("reason")
    val reason: kotlin.String? = null,

)
