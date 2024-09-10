@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package ympa_kotlin_wiremock_server.models

import com.fasterxml.jackson.annotation.JsonProperty

enum class PlacementType {
    @JsonProperty(value = "FBS") FBS,
    @JsonProperty(value = "FBY") FBY,
    @JsonProperty(value = "DBS") DBS,
}
