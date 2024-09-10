@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package ympa_kotlin_wiremock_server.models

import com.fasterxml.jackson.annotation.JsonProperty

data class ReturnInstanceDTO(
    @field:JsonProperty("stockType")
    val stockType: ReturnInstanceStockType? = null,

    @field:JsonProperty("status")
    val status: ReturnInstanceStatusType? = null,

    @field:JsonProperty("cis")
    val cis: kotlin.String? = null,

    @field:JsonProperty("imei")
    val imei: kotlin.String? = null,

)
