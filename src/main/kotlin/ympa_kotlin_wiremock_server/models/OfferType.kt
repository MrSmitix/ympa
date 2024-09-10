@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package ympa_kotlin_wiremock_server.models

import com.fasterxml.jackson.annotation.JsonProperty

enum class OfferType {
    @JsonProperty(value = "DEFAULT") DEFAULT,
    @JsonProperty(value = "MEDICINE") MEDICINE,
    @JsonProperty(value = "BOOK") BOOK,
    @JsonProperty(value = "AUDIOBOOK") AUDIOBOOK,
    @JsonProperty(value = "ARTIST_TITLE") ARTIST_TITLE,
    @JsonProperty(value = "ON_DEMAND") ON_DEMAND,
}
