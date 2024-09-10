@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package ympa_kotlin_wiremock_server.models

import com.fasterxml.jackson.annotation.JsonProperty

data class CampaignSettingsTimePeriodDTO(
    @field:JsonProperty("fromDate")
    val fromDate: kotlin.String? = null,

    @field:JsonProperty("toDate")
    val toDate: kotlin.String? = null,

)
