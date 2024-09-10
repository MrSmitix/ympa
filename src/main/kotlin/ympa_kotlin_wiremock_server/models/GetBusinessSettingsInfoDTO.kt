@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package ympa_kotlin_wiremock_server.models

import com.fasterxml.jackson.annotation.JsonProperty

data class GetBusinessSettingsInfoDTO(
    @field:JsonProperty("info")
    val info: BusinessDTO? = null,

    @field:JsonProperty("settings")
    val settings: BusinessSettingsDTO? = null,

)
