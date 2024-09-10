@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package ympa_kotlin_wiremock_server.models

import com.fasterxml.jackson.annotation.JsonProperty

data class GetCampaignOfferDTO(
    @field:JsonProperty("offerId")
    val offerId: kotlin.String,

    @field:JsonProperty("quantum")
    val quantum: QuantumDTO? = null,

    @field:JsonProperty("available")
    val available: kotlin.Boolean? = null,

    @field:JsonProperty("basicPrice")
    val basicPrice: GetPriceWithDiscountDTO? = null,

    @field:JsonProperty("campaignPrice")
    val campaignPrice: GetPriceWithVatDTO? = null,

    @field:JsonProperty("status")
    val status: OfferCampaignStatusType? = null,

    @field:JsonProperty("errors")
    val errors: kotlin.collections.List<OfferErrorDTO>? = null,

    @field:JsonProperty("warnings")
    val warnings: kotlin.collections.List<OfferErrorDTO>? = null,

)
