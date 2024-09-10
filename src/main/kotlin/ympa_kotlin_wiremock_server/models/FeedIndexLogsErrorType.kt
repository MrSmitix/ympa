@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package ympa_kotlin_wiremock_server.models

import com.fasterxml.jackson.annotation.JsonProperty

enum class FeedIndexLogsErrorType {
    @JsonProperty(value = "DOWNLOAD_ERROR") DOWNLOAD_ERROR,
    @JsonProperty(value = "DOWNLOAD_HTTP_ERROR") DOWNLOAD_HTTP_ERROR,
    @JsonProperty(value = "PARSE_ERROR") PARSE_ERROR,
    @JsonProperty(value = "PARSE_XML_ERROR") PARSE_XML_ERROR,
    @JsonProperty(value = "TOO_MANY_REJECTED_OFFERS") TOO_MANY_REJECTED_OFFERS,
    @JsonProperty(value = "NOT_INDEXED") NOT_INDEXED,
}
