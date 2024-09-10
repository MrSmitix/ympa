@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package ympa_kotlin_wiremock_server.models

import com.fasterxml.jackson.annotation.JsonProperty

data class BriefOrderItemInstanceDTO(
    @field:JsonProperty("cis")
    val cis: kotlin.String? = null,

    @field:JsonProperty("uin")
    val uin: kotlin.String? = null,

    @field:JsonProperty("rnpt")
    val rnpt: kotlin.String? = null,

    @field:JsonProperty("gtd")
    val gtd: kotlin.String? = null,

)
