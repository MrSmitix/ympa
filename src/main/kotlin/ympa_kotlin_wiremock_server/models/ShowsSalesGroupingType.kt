@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package ympa_kotlin_wiremock_server.models

import com.fasterxml.jackson.annotation.JsonProperty

enum class ShowsSalesGroupingType {
    @JsonProperty(value = "CATEGORIES") CATEGORIES,
    @JsonProperty(value = "OFFERS") OFFERS,
}
