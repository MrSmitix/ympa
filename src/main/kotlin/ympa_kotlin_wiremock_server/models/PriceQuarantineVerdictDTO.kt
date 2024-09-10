@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package ympa_kotlin_wiremock_server.models

import com.fasterxml.jackson.annotation.JsonProperty

data class PriceQuarantineVerdictDTO(
    @field:JsonProperty("params")
    val params: kotlin.collections.List<PriceQuarantineVerdictParameterDTO>,

    @field:JsonProperty("type")
    val type: PriceQuarantineVerdictType? = null,

)
