@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package ympa_kotlin_wiremock_server.models

import com.fasterxml.jackson.annotation.JsonProperty

data class GetHiddenOffersResultDTO(
    @field:JsonProperty("hiddenOffers")
    val hiddenOffers: kotlin.collections.List<HiddenOfferDTO>,

    @field:JsonProperty("paging")
    val paging: ScrollingPagerDTO? = null,

)
