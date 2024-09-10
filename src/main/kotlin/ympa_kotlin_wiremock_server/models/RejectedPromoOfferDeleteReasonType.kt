@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package ympa_kotlin_wiremock_server.models

import com.fasterxml.jackson.annotation.JsonProperty

enum class RejectedPromoOfferDeleteReasonType {
    @JsonProperty(value = "OFFER_DOES_NOT_EXIST") OFFER_DOES_NOT_EXIST,
}
