@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package ympa_kotlin_wiremock_server.models

import com.fasterxml.jackson.annotation.JsonProperty

data class PromoOfferUpdateWarningDTO(
    @field:JsonProperty("code")
    val code: PromoOfferUpdateWarningCodeType,

    @field:JsonProperty("campaignIds")
    val campaignIds: kotlin.collections.List<kotlin.Long>? = null,

)
