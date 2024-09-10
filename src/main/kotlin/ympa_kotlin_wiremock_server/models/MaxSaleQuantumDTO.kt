@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package ympa_kotlin_wiremock_server.models

import com.fasterxml.jackson.annotation.JsonProperty

data class MaxSaleQuantumDTO(
    @field:JsonProperty("id")
    val id: kotlin.Long,

    @field:JsonProperty("name")
    val name: kotlin.String? = null,

    @field:JsonProperty("maxSaleQuantum")
    val maxSaleQuantum: kotlin.Int? = null,

)
