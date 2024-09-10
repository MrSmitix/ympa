@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package ympa_kotlin_wiremock_server.models

import com.fasterxml.jackson.annotation.JsonProperty

data class UpdatePromoOfferDiscountParamsDTO(
    @field:JsonProperty("price")
    val price: kotlin.Long? = null,

    @field:JsonProperty("promoPrice")
    val promoPrice: kotlin.Long? = null,

)
