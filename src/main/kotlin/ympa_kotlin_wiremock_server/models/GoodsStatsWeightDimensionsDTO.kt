@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package ympa_kotlin_wiremock_server.models

import com.fasterxml.jackson.annotation.JsonProperty

data class GoodsStatsWeightDimensionsDTO(
    @field:JsonProperty("length")
    val length: java.math.BigDecimal? = null,

    @field:JsonProperty("width")
    val width: java.math.BigDecimal? = null,

    @field:JsonProperty("height")
    val height: java.math.BigDecimal? = null,

    @field:JsonProperty("weight")
    val weight: java.math.BigDecimal? = null,

)
