@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package ympa_kotlin_wiremock_server.models

import com.fasterxml.jackson.annotation.JsonProperty

enum class AddOffersToArchiveErrorType {
    @JsonProperty(value = "OFFER_HAS_STOCKS") OFFER_HAS_STOCKS,
    @JsonProperty(value = "UNKNOWN") UNKNOWN,
}
