@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package ympa_kotlin_wiremock_server.models

import com.fasterxml.jackson.annotation.JsonProperty

data class DeleteOffersRequest(
    @field:JsonProperty("offerIds")
    val offerIds: kotlin.collections.List<kotlin.String>,

)
