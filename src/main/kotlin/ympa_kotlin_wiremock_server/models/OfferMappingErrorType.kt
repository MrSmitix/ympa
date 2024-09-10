@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package ympa_kotlin_wiremock_server.models

import com.fasterxml.jackson.annotation.JsonProperty

enum class OfferMappingErrorType {
    @JsonProperty(value = "UNKNOWN_CATEGORY") UNKNOWN_CATEGORY,
    @JsonProperty(value = "CATEGORY_MISMATCH") CATEGORY_MISMATCH,
    @JsonProperty(value = "EMPTY_MARKET_CATEGORY") EMPTY_MARKET_CATEGORY,
    @JsonProperty(value = "UNKNOWN_PARAMETER") UNKNOWN_PARAMETER,
    @JsonProperty(value = "UNEXPECTED_BOOLEAN_VALUE") UNEXPECTED_BOOLEAN_VALUE,
    @JsonProperty(value = "NUMBER_FORMAT") NUMBER_FORMAT,
    @JsonProperty(value = "VALUE_BLANK") VALUE_BLANK,
    @JsonProperty(value = "INVALID_UNIT_ID") INVALID_UNIT_ID,
    @JsonProperty(value = "INVALID_GROUP_ID_LENGTH") INVALID_GROUP_ID_LENGTH,
    @JsonProperty(value = "INVALID_GROUP_ID_CHARACTERS") INVALID_GROUP_ID_CHARACTERS,
    @JsonProperty(value = "INVALID_PICKER_URL") INVALID_PICKER_URL,
}
