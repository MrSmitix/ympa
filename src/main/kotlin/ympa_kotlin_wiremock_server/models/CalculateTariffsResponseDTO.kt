@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package ympa_kotlin_wiremock_server.models

import com.fasterxml.jackson.annotation.JsonProperty

data class CalculateTariffsResponseDTO(
    @field:JsonProperty("offers")
    val offers: kotlin.collections.List<CalculateTariffsOfferInfoDTO>,

)
