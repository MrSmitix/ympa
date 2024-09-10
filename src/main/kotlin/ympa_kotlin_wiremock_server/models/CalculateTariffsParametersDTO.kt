@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package ympa_kotlin_wiremock_server.models

import com.fasterxml.jackson.annotation.JsonProperty

data class CalculateTariffsParametersDTO(
    @field:JsonProperty("campaignId")
    val campaignId: kotlin.Long? = null,

    @field:JsonProperty("sellingProgram")
    val sellingProgram: SellingProgramType? = null,

    @field:JsonProperty("frequency")
    val frequency: PaymentFrequencyType? = null,

)
