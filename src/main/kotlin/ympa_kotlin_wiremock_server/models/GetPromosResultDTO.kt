@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package ympa_kotlin_wiremock_server.models

import com.fasterxml.jackson.annotation.JsonProperty

data class GetPromosResultDTO(
    @field:JsonProperty("promos")
    val promos: kotlin.collections.List<GetPromoDTO>,

)
