@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package ympa_kotlin_wiremock_server.models

import com.fasterxml.jackson.annotation.JsonProperty

data class UpdateOfferMappingEntryRequest(
    @field:JsonProperty("offerMappingEntries")
    val offerMappingEntries: kotlin.collections.List<UpdateOfferMappingEntryDTO>,

)
