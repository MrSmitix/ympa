@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package ympa_kotlin_wiremock_server.models

import com.fasterxml.jackson.annotation.JsonProperty

data class TariffDTO(
    @field:JsonProperty("type")
    val type: TariffType,

    @field:JsonProperty("amount")
    val amount: java.math.BigDecimal,

    @field:JsonProperty("parameters")
    val parameters: kotlin.collections.List<TariffParameterDTO>,

    @field:JsonProperty("percent")
    val percent: java.math.BigDecimal? = null,

)
