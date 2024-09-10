@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package ympa_kotlin_wiremock_server.models

import com.fasterxml.jackson.annotation.JsonProperty

data class EnrichedModelsDTO(
    @field:JsonProperty("models")
    val models: kotlin.collections.List<EnrichedModelDTO>,

)
