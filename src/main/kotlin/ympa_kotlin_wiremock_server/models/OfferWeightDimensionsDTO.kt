@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package ympa_kotlin_wiremock_server.models

import com.fasterxml.jackson.annotation.JsonProperty

data class OfferWeightDimensionsDTO(
    @field:JsonProperty("length")
    val length: java.math.BigDecimal,

    @field:JsonProperty("width")
    val width: java.math.BigDecimal,

    @field:JsonProperty("height")
    val height: java.math.BigDecimal,

    @field:JsonProperty("weight")
    val weight: java.math.BigDecimal,

)
