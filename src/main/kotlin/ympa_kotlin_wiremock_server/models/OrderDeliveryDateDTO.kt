@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package ympa_kotlin_wiremock_server.models

import com.fasterxml.jackson.annotation.JsonProperty

data class OrderDeliveryDateDTO(
    @field:JsonProperty("toDate")
    val toDate: java.time.LocalDate,

)
