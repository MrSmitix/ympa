@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package ympa_kotlin_wiremock_server.models

import com.fasterxml.jackson.annotation.JsonProperty

data class OfferMappingEntriesDTO(
    @field:JsonProperty("offerMappingEntries")
    val offerMappingEntries: kotlin.collections.List<OfferMappingEntryDTO>,

    @field:JsonProperty("paging")
    val paging: ScrollingPagerDTO? = null,

)
