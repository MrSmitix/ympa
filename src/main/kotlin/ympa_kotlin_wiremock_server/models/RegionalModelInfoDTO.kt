@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package ympa_kotlin_wiremock_server.models

import com.fasterxml.jackson.annotation.JsonProperty

data class RegionalModelInfoDTO(
    @field:JsonProperty("currency")
    val currency: CurrencyType? = null,

    @field:JsonProperty("regionId")
    val regionId: kotlin.Long? = null,

)
