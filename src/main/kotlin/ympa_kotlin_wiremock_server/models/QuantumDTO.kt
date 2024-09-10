@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package ympa_kotlin_wiremock_server.models

import com.fasterxml.jackson.annotation.JsonProperty

data class QuantumDTO(
    @field:JsonProperty("minQuantity")
    val minQuantity: kotlin.Int? = null,

    @field:JsonProperty("stepQuantity")
    val stepQuantity: kotlin.Int? = null,

)
