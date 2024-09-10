@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package ympa_kotlin_wiremock_server.models

import com.fasterxml.jackson.annotation.JsonProperty

data class GetCampaignLoginsResponse(
    @field:JsonProperty("logins")
    val logins: kotlin.collections.List<kotlin.String>,

)
