@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package ympa_kotlin_wiremock_server.models

import com.fasterxml.jackson.annotation.JsonProperty

data class DeletePromoOffersRequest(
    @field:JsonProperty("promoId")
    val promoId: kotlin.String,

    @field:JsonProperty("deleteAllOffers")
    val deleteAllOffers: kotlin.Boolean? = null,

    @field:JsonProperty("offerIds")
    val offerIds: kotlin.collections.List<kotlin.String>? = null,

)
