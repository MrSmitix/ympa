@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package ympa_kotlin_wiremock_server.models

import com.fasterxml.jackson.annotation.JsonProperty

data class OfferManualDTO(
    @field:JsonProperty("url")
    val url: kotlin.String,

    @field:JsonProperty("title")
    val title: kotlin.String? = null,

)
