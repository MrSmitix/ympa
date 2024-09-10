@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package ympa_kotlin_wiremock_server.models

import com.fasterxml.jackson.annotation.JsonProperty

data class TimePeriodDTO(
    @field:JsonProperty("timePeriod")
    val timePeriod: kotlin.Int,

    @field:JsonProperty("timeUnit")
    val timeUnit: TimeUnitType,

    @field:JsonProperty("comment")
    val comment: kotlin.String? = null,

)
