@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package ympa_kotlin_wiremock_server.models

import com.fasterxml.jackson.annotation.JsonProperty

enum class CampaignSettingsScheduleSourceType {
    @JsonProperty(value = "WEB") WEB,
    @JsonProperty(value = "YML") YML,
}
