@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package ympa_kotlin_wiremock_server.models

import com.fasterxml.jackson.annotation.JsonProperty

data class ModelsDTO(
    @field:JsonProperty("models")
    val models: kotlin.collections.List<ModelDTO>,

)
