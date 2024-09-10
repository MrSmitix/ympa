@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package ympa_kotlin_wiremock_server.models

import com.fasterxml.jackson.annotation.JsonProperty

data class GenerateShipmentListDocumentReportRequest(
    @field:JsonProperty("campaignId")
    val campaignId: kotlin.Long,

    @field:JsonProperty("shipmentId")
    val shipmentId: kotlin.Long? = null,

    @field:JsonProperty("orderIds")
    val orderIds: kotlin.collections.List<kotlin.Long>? = null,

)
