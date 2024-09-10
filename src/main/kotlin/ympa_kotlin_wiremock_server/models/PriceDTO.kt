@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package ympa_kotlin_wiremock_server.models

import com.fasterxml.jackson.annotation.JsonProperty

data class PriceDTO(
    @field:JsonProperty("value")
    val `value`: java.math.BigDecimal? = null,

    @field:JsonProperty("discountBase")
    val discountBase: java.math.BigDecimal? = null,

    @field:JsonProperty("currencyId")
    val currencyId: CurrencyType? = null,

    @field:JsonProperty("vat")
    val vat: kotlin.Int? = null,

)
