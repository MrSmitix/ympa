@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package ympa_kotlin_wiremock_server.models

import com.fasterxml.jackson.annotation.JsonProperty

data class OrderBoxesLayoutDTO(
    @field:JsonProperty("boxes")
    val boxes: kotlin.collections.List<EnrichedOrderBoxLayoutDTO>,

)
