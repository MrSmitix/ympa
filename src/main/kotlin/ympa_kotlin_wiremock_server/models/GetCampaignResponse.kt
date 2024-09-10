@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package ympa_kotlin_wiremock_server.models

import com.fasterxml.jackson.annotation.JsonProperty

data class GetCampaignResponse(
    @field:JsonProperty("campaign")
    val campaign: CampaignDTO? = null,

)
