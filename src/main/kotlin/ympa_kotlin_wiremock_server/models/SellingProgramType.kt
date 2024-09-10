@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package ympa_kotlin_wiremock_server.models

import com.fasterxml.jackson.annotation.JsonProperty

enum class SellingProgramType {
    @JsonProperty(value = "FBY") FBY,
    @JsonProperty(value = "FBS") FBS,
    @JsonProperty(value = "DBS") DBS,
    @JsonProperty(value = "EXPRESS") EXPRESS,
}
