@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package ympa_kotlin_wiremock_server.models

import com.fasterxml.jackson.annotation.JsonProperty

data class OfferSellingProgramDTO(
    @field:JsonProperty("sellingProgram")
    val sellingProgram: SellingProgramType,

    @field:JsonProperty("status")
    val status: OfferSellingProgramStatusType,

)
