@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package ympa_kotlin_wiremock_server.models

import com.fasterxml.jackson.annotation.JsonProperty

data class OrderCourierDTO(
    @field:JsonProperty("fullName")
    val fullName: kotlin.String? = null,

    @field:JsonProperty("phone")
    val phone: kotlin.String? = null,

    @field:JsonProperty("phoneExtension")
    val phoneExtension: kotlin.String? = null,

    @field:JsonProperty("vehicleNumber")
    val vehicleNumber: kotlin.String? = null,

    @field:JsonProperty("vehicleDescription")
    val vehicleDescription: kotlin.String? = null,

)
