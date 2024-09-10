@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package ympa_kotlin_wiremock_server.models

import com.fasterxml.jackson.annotation.JsonProperty

data class ModelPriceDTO(
    @field:JsonProperty("avg")
    val avg: java.math.BigDecimal? = null,

    @field:JsonProperty("max")
    val max: java.math.BigDecimal? = null,

    @field:JsonProperty("min")
    val min: java.math.BigDecimal? = null,

)
