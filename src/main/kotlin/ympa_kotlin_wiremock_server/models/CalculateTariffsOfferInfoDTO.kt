@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package ympa_kotlin_wiremock_server.models

import com.fasterxml.jackson.annotation.JsonProperty

data class CalculateTariffsOfferInfoDTO(
    @field:JsonProperty("offer")
    val offer: CalculateTariffsOfferDTO,

    @field:JsonProperty("tariffs")
    val tariffs: kotlin.collections.List<CalculatedTariffDTO>,

)
