@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package ympa_kotlin_wiremock_server.models

import com.fasterxml.jackson.annotation.JsonProperty

data class PriceCompetitivenessThresholdsDTO(
    @field:JsonProperty("optimalPrice")
    val optimalPrice: BasePriceDTO? = null,

    @field:JsonProperty("averagePrice")
    val averagePrice: BasePriceDTO? = null,

)
