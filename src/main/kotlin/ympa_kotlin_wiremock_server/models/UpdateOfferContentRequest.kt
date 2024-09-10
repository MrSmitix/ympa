@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package ympa_kotlin_wiremock_server.models

import com.fasterxml.jackson.annotation.JsonProperty

data class UpdateOfferContentRequest(
    @field:JsonProperty("offersContent")
    val offersContent: kotlin.collections.List<OfferContentDTO>,

)
