@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package ympa_kotlin_wiremock_server.models

import com.fasterxml.jackson.annotation.JsonProperty

data class GetBidsInfoRequest(
    @field:JsonProperty("skus")
    val skus: kotlin.collections.List<kotlin.String>? = null,

)
