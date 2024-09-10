@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package ympa_kotlin_wiremock_server.models

import com.fasterxml.jackson.annotation.JsonProperty

data class CalculatedTariffDTO(
    @field:JsonProperty("type")
    val type: CalculatedTariffType,

    @field:JsonProperty("parameters")
    val parameters: kotlin.collections.List<TariffParameterDTO>,

    @field:JsonProperty("amount")
    val amount: java.math.BigDecimal? = null,

)
