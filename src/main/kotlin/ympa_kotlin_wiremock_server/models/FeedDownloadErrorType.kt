@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package ympa_kotlin_wiremock_server.models

import com.fasterxml.jackson.annotation.JsonProperty

enum class FeedDownloadErrorType {
    @JsonProperty(value = "DOWNLOAD_ERROR") ERROR,
    @JsonProperty(value = "DOWNLOAD_HTTP_ERROR") HTTP_ERROR,
}
