@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package ympa_kotlin_wiremock_server.models

import com.fasterxml.jackson.annotation.JsonProperty

enum class OrderDocumentStatusType {
    @JsonProperty(value = "READY") READY,
    @JsonProperty(value = "NOT_READY") NOT_READY,
}
