@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package ympa_kotlin_wiremock_server.models

import com.fasterxml.jackson.annotation.JsonProperty

data class CampaignSettingsScheduleDTO(
    @field:JsonProperty("customHolidays")
    val customHolidays: kotlin.collections.List<kotlin.String>,

    @field:JsonProperty("customWorkingDays")
    val customWorkingDays: kotlin.collections.List<kotlin.String>,

    @field:JsonProperty("totalHolidays")
    val totalHolidays: kotlin.collections.List<kotlin.String>,

    @field:JsonProperty("weeklyHolidays")
    val weeklyHolidays: kotlin.collections.List<kotlin.Int>,

    @field:JsonProperty("availableOnHolidays")
    val availableOnHolidays: kotlin.Boolean? = null,

    @field:JsonProperty("period")
    val period: CampaignSettingsTimePeriodDTO? = null,

)
