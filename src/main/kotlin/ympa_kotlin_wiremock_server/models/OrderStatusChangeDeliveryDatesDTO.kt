@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package ympa_kotlin_wiremock_server.models

import com.fasterxml.jackson.annotation.JsonProperty

data class OrderStatusChangeDeliveryDatesDTO(
    @field:JsonProperty("realDeliveryDate")
    val realDeliveryDate: java.time.LocalDate? = null,

)
