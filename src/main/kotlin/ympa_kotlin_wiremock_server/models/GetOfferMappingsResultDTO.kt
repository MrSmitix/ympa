@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package ympa_kotlin_wiremock_server.models

import com.fasterxml.jackson.annotation.JsonProperty

data class GetOfferMappingsResultDTO(
    @field:JsonProperty("offerMappings")
    val offerMappings: kotlin.collections.List<GetOfferMappingDTO>,

    @field:JsonProperty("paging")
    val paging: ScrollingPagerDTO? = null,

)
