@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package ympa_kotlin_wiremock_server.models

import com.fasterxml.jackson.annotation.JsonProperty

data class AddHiddenOffersRequest(
    @field:JsonProperty("hiddenOffers")
    val hiddenOffers: kotlin.collections.List<HiddenOfferDTO>,

)
