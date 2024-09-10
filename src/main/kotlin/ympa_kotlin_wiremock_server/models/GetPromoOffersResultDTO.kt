@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package ympa_kotlin_wiremock_server.models

import com.fasterxml.jackson.annotation.JsonProperty

data class GetPromoOffersResultDTO(
    @field:JsonProperty("offers")
    val offers: kotlin.collections.List<GetPromoOfferDTO>,

    @field:JsonProperty("paging")
    val paging: ForwardScrollingPagerDTO? = null,

)
