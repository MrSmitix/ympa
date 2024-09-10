@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package ympa_kotlin_wiremock_server.models

import com.fasterxml.jackson.annotation.JsonProperty

data class GetRegionsResponse(
    @field:JsonProperty("regions")
    val regions: kotlin.collections.List<RegionDTO>,

    @field:JsonProperty("paging")
    val paging: ForwardScrollingPagerDTO? = null,

)
