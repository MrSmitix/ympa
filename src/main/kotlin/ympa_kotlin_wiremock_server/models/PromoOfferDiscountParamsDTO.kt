@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package ympa_kotlin_wiremock_server.models

import com.fasterxml.jackson.annotation.JsonProperty

data class PromoOfferDiscountParamsDTO(
    @field:JsonProperty("maxPromoPrice")
    val maxPromoPrice: kotlin.Long,

    @field:JsonProperty("price")
    val price: kotlin.Long? = null,

    @field:JsonProperty("promoPrice")
    val promoPrice: kotlin.Long? = null,

)
