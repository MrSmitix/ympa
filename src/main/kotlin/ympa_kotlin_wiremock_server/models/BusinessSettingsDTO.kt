@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package ympa_kotlin_wiremock_server.models

import com.fasterxml.jackson.annotation.JsonProperty

data class BusinessSettingsDTO(
    @field:JsonProperty("onlyDefaultPrice")
    val onlyDefaultPrice: kotlin.Boolean? = null,

    @field:JsonProperty("currency")
    val currency: CurrencyType? = null,

)
