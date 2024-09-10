@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package ympa_kotlin_wiremock_server.models

import com.fasterxml.jackson.annotation.JsonProperty

data class FlippingPagerDTO(
    @field:JsonProperty("total")
    val total: kotlin.Int? = null,

    @field:JsonProperty("from")
    val from: kotlin.Int? = null,

    @field:JsonProperty("to")
    val to: kotlin.Int? = null,

    @field:JsonProperty("currentPage")
    val currentPage: kotlin.Int? = null,

    @field:JsonProperty("pagesCount")
    val pagesCount: kotlin.Int? = null,

    @field:JsonProperty("pageSize")
    val pageSize: kotlin.Int? = null,

)
