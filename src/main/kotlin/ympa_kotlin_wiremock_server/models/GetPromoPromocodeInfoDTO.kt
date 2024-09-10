@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package ympa_kotlin_wiremock_server.models

import com.fasterxml.jackson.annotation.JsonProperty

data class GetPromoPromocodeInfoDTO(
    @field:JsonProperty("promocode")
    val promocode: kotlin.String,

    @field:JsonProperty("discount")
    val discount: kotlin.Int,

)
