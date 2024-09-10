@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package ympa_kotlin_wiremock_server.models

import com.fasterxml.jackson.annotation.JsonProperty

data class GetOutletsResponse(
    @field:JsonProperty("outlets")
    val outlets: kotlin.collections.List<FullOutletDTO>,

    @field:JsonProperty("paging")
    val paging: ScrollingPagerDTO? = null,

    @field:JsonProperty("pager")
    val pager: FlippingPagerDTO? = null,

)
