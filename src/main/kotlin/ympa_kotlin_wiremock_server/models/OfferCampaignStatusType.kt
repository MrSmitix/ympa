@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package ympa_kotlin_wiremock_server.models

import com.fasterxml.jackson.annotation.JsonProperty

enum class OfferCampaignStatusType {
    @JsonProperty(value = "PUBLISHED") PUBLISHED,
    @JsonProperty(value = "CHECKING") CHECKING,
    @JsonProperty(value = "DISABLED_BY_PARTNER") DISABLED_BY_PARTNER,
    @JsonProperty(value = "DISABLED_AUTOMATICALLY") DISABLED_AUTOMATICALLY,
    @JsonProperty(value = "REJECTED_BY_MARKET") REJECTED_BY_MARKET,
    @JsonProperty(value = "CREATING_CARD") CREATING_CARD,
    @JsonProperty(value = "NO_CARD") NO_CARD,
    @JsonProperty(value = "NO_STOCKS") NO_STOCKS,
    @JsonProperty(value = "ARCHIVED") ARCHIVED,
}
