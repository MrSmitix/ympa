@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package ympa_kotlin_wiremock_server.models

import com.fasterxml.jackson.annotation.JsonProperty

data class GetPromoBestsellerInfoDTO(
    @field:JsonProperty("bestseller")
    val bestseller: kotlin.Boolean,

    @field:JsonProperty("entryDeadline")
    val entryDeadline: java.time.OffsetDateTime? = null,

)
