@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package ympa_kotlin_wiremock_server.models

import com.fasterxml.jackson.annotation.JsonProperty

data class GetQuarantineOffersResultDTO(
    @field:JsonProperty("offers")
    val offers: kotlin.collections.List<QuarantineOfferDTO>,

    @field:JsonProperty("paging")
    val paging: ScrollingPagerDTO? = null,

)
