@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package ympa_kotlin_wiremock_server.models

import com.fasterxml.jackson.annotation.JsonProperty

data class UpdatePriceWithDiscountDTO(
    @field:JsonProperty("value")
    val `value`: java.math.BigDecimal,

    @field:JsonProperty("currencyId")
    val currencyId: CurrencyType,

    @field:JsonProperty("discountBase")
    val discountBase: java.math.BigDecimal? = null,

)
