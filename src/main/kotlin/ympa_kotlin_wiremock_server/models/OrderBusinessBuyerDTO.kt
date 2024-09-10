@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package ympa_kotlin_wiremock_server.models

import com.fasterxml.jackson.annotation.JsonProperty

data class OrderBusinessBuyerDTO(
    @field:JsonProperty("inn")
    val inn: kotlin.String? = null,

    @field:JsonProperty("kpp")
    val kpp: kotlin.String? = null,

    @field:JsonProperty("organizationName")
    val organizationName: kotlin.String? = null,

    @field:JsonProperty("organizationJurAddress")
    val organizationJurAddress: kotlin.String? = null,

)
