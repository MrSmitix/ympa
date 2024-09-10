@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package ympa_kotlin_wiremock_server.models

import com.fasterxml.jackson.annotation.JsonProperty

data class OrderBuyerInfoDTO(
    @field:JsonProperty("id")
    val id: kotlin.String? = null,

    @field:JsonProperty("lastName")
    val lastName: kotlin.String? = null,

    @field:JsonProperty("firstName")
    val firstName: kotlin.String? = null,

    @field:JsonProperty("middleName")
    val middleName: kotlin.String? = null,

    @field:JsonProperty("type")
    val type: OrderBuyerType? = null,

    @field:JsonProperty("phone")
    val phone: kotlin.String? = null,

)
