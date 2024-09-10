@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package ympa_kotlin_wiremock_server.models

import com.fasterxml.jackson.annotation.JsonProperty

data class UpdateOrderStorageLimitRequest(
    @field:JsonProperty("newDate")
    val newDate: java.time.LocalDate,

)
