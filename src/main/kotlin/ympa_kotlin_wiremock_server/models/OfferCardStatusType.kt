@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package ympa_kotlin_wiremock_server.models

import com.fasterxml.jackson.annotation.JsonProperty

enum class OfferCardStatusType {
    @JsonProperty(value = "HAS_CARD_CAN_NOT_UPDATE") HAS_CARD_CAN_NOT_UPDATE,
    @JsonProperty(value = "HAS_CARD_CAN_UPDATE") HAS_CARD_CAN_UPDATE,
    @JsonProperty(value = "HAS_CARD_CAN_UPDATE_ERRORS") HAS_CARD_CAN_UPDATE_ERRORS,
    @JsonProperty(value = "HAS_CARD_CAN_UPDATE_PROCESSING") HAS_CARD_CAN_UPDATE_PROCESSING,
    @JsonProperty(value = "NO_CARD_NEED_CONTENT") NO_CARD_NEED_CONTENT,
    @JsonProperty(value = "NO_CARD_MARKET_WILL_CREATE") NO_CARD_MARKET_WILL_CREATE,
    @JsonProperty(value = "NO_CARD_ERRORS") NO_CARD_ERRORS,
    @JsonProperty(value = "NO_CARD_PROCESSING") NO_CARD_PROCESSING,
    @JsonProperty(value = "NO_CARD_ADD_TO_CAMPAIGN") NO_CARD_ADD_TO_CAMPAIGN,
}
