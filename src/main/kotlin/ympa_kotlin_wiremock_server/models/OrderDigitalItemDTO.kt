@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package ympa_kotlin_wiremock_server.models

import com.fasterxml.jackson.annotation.JsonProperty

data class OrderDigitalItemDTO(
    @field:JsonProperty("id")
    val id: kotlin.Long,

    @field:JsonProperty("code")
    val code: kotlin.String,

    @field:JsonProperty("slip")
    val slip: kotlin.String,

    @field:JsonProperty("activate_till")
    val activateTill: java.time.LocalDate,

)
