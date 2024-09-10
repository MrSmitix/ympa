@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package ympa_kotlin_wiremock_server.models

import com.fasterxml.jackson.annotation.JsonProperty

data class FeedbackAuthorDTO(
    @field:JsonProperty("name")
    val name: kotlin.String? = null,

    @field:JsonProperty("region")
    val region: RegionDTO? = null,

)
