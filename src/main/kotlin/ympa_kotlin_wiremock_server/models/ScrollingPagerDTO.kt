@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package ympa_kotlin_wiremock_server.models

import com.fasterxml.jackson.annotation.JsonProperty

data class ScrollingPagerDTO(
    @field:JsonProperty("nextPageToken")
    val nextPageToken: kotlin.String? = null,

    @field:JsonProperty("prevPageToken")
    val prevPageToken: kotlin.String? = null,

)
