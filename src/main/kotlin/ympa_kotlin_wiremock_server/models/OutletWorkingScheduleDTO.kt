@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package ympa_kotlin_wiremock_server.models

import com.fasterxml.jackson.annotation.JsonProperty

data class OutletWorkingScheduleDTO(
    @field:JsonProperty("scheduleItems")
    val scheduleItems: kotlin.collections.List<OutletWorkingScheduleItemDTO>,

    @field:JsonProperty("workInHoliday")
    val workInHoliday: kotlin.Boolean? = null,

)
