@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package ympa_kotlin_wiremock_server.models

import com.fasterxml.jackson.annotation.JsonProperty

data class OrderDeliveryDatesDTO(
    @field:JsonProperty("fromDate")
    val fromDate: kotlin.String? = null,

    @field:JsonProperty("toDate")
    val toDate: kotlin.String? = null,

    @field:JsonProperty("fromTime")
    val fromTime: kotlin.String? = null,

    @field:JsonProperty("toTime")
    val toTime: kotlin.String? = null,

    @field:JsonProperty("realDeliveryDate")
    val realDeliveryDate: kotlin.String? = null,

)
