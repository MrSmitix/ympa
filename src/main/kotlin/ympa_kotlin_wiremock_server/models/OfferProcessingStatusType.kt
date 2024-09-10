@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package ympa_kotlin_wiremock_server.models

import com.fasterxml.jackson.annotation.JsonProperty

enum class OfferProcessingStatusType {
    @JsonProperty(value = "UNKNOWN") UNKNOWN,
    @JsonProperty(value = "READY") READY,
    @JsonProperty(value = "IN_WORK") IN_WORK,
    @JsonProperty(value = "NEED_INFO") NEED_INFO,
    @JsonProperty(value = "NEED_MAPPING") NEED_MAPPING,
    @JsonProperty(value = "NEED_CONTENT") NEED_CONTENT,
    @JsonProperty(value = "CONTENT_PROCESSING") CONTENT_PROCESSING,
    @JsonProperty(value = "SUSPENDED") SUSPENDED,
    @JsonProperty(value = "REJECTED") REJECTED,
    @JsonProperty(value = "REVIEW") REVIEW,
    @JsonProperty(value = "CREATE_ERROR") CREATE_ERROR,
    @JsonProperty(value = "UPDATE_ERROR") UPDATE_ERROR,
}
