@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package ympa_kotlin_wiremock_server.models

import com.fasterxml.jackson.annotation.JsonProperty

enum class SortOrderType {
    @JsonProperty(value = "ASC") ASC,
    @JsonProperty(value = "DESC") DESC,
}
