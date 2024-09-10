@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package ympa_kotlin_wiremock_server.models

import com.fasterxml.jackson.annotation.JsonProperty

data class PalletsCountDTO(
    @field:JsonProperty("planned")
    val planned: kotlin.Int? = null,

    @field:JsonProperty("fact")
    val fact: kotlin.Int? = null,

)
