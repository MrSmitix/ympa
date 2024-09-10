@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package ympa_kotlin_wiremock_server.models

import com.fasterxml.jackson.annotation.JsonProperty

data class PromoPeriodDTO(
    @field:JsonProperty("dateTimeFrom")
    val dateTimeFrom: java.time.OffsetDateTime,

    @field:JsonProperty("dateTimeTo")
    val dateTimeTo: java.time.OffsetDateTime,

)
