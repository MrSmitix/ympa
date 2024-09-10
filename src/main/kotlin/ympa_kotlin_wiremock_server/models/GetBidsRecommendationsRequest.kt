@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package ympa_kotlin_wiremock_server.models

import com.fasterxml.jackson.annotation.JsonProperty

data class GetBidsRecommendationsRequest(
    @field:JsonProperty("skus")
    val skus: kotlin.collections.List<kotlin.String>,

)
