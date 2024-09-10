@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package ympa_kotlin_wiremock_server.models

import com.fasterxml.jackson.annotation.JsonProperty

data class UpdateOfferMappingsRequest(
    @field:JsonProperty("offerMappings")
    val offerMappings: kotlin.collections.List<UpdateOfferMappingDTO>,

    @field:JsonProperty("onlyPartnerMediaContent")
    val onlyPartnerMediaContent: kotlin.Boolean? = null,

)
