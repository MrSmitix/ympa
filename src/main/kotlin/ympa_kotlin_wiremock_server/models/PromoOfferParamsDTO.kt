@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package ympa_kotlin_wiremock_server.models

import com.fasterxml.jackson.annotation.JsonProperty

data class PromoOfferParamsDTO(
    @field:JsonProperty("discountParams")
    val discountParams: PromoOfferDiscountParamsDTO? = null,

    @field:JsonProperty("promocodeParams")
    val promocodeParams: PromoOfferPromocodeParamsDTO? = null,

)
