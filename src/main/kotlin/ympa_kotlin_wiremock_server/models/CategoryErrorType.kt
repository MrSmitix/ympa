@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package ympa_kotlin_wiremock_server.models

import com.fasterxml.jackson.annotation.JsonProperty

enum class CategoryErrorType {
    @JsonProperty(value = "UNKNOWN_CATEGORY") UNKNOWN_CATEGORY,
    @JsonProperty(value = "CATEGORY_IS_NOT_LEAF") CATEGORY_IS_NOT_LEAF,
}
