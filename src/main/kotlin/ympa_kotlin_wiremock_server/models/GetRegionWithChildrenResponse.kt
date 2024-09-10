@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package ympa_kotlin_wiremock_server.models

import com.fasterxml.jackson.annotation.JsonProperty

data class GetRegionWithChildrenResponse(
    @field:JsonProperty("pager")
    val pager: FlippingPagerDTO? = null,

    @field:JsonProperty("regions")
    val regions: RegionDTO? = null,

)
