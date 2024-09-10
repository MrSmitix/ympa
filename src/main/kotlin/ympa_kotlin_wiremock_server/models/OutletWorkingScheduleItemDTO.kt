@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package ympa_kotlin_wiremock_server.models

import com.fasterxml.jackson.annotation.JsonProperty

data class OutletWorkingScheduleItemDTO(
    @field:JsonProperty("startDay")
    val startDay: DayOfWeekType,

    @field:JsonProperty("endDay")
    val endDay: DayOfWeekType,

    @field:JsonProperty("startTime")
    val startTime: kotlin.String,

    @field:JsonProperty("endTime")
    val endTime: kotlin.String,

)
