@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package ympa_kotlin_wiremock_server.models

import com.fasterxml.jackson.annotation.JsonProperty

data class SuggestedOfferDTO(
    @field:JsonProperty("offerId")
    val offerId: kotlin.String? = null,

    @field:JsonProperty("name")
    val name: kotlin.String? = null,

    @field:JsonProperty("category")
    val category: kotlin.String? = null,

    @field:JsonProperty("vendor")
    val vendor: kotlin.String? = null,

    @field:JsonProperty("barcodes")
    val barcodes: kotlin.collections.List<kotlin.String>? = null,

    @field:JsonProperty("description")
    val description: kotlin.String? = null,

    @field:JsonProperty("vendorCode")
    val vendorCode: kotlin.String? = null,

    @field:JsonProperty("basicPrice")
    val basicPrice: BasePriceDTO? = null,

)
