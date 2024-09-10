@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package ympa_kotlin_wiremock_server.models

import com.fasterxml.jackson.annotation.JsonProperty

data class GenerateUnitedOrdersRequest(
    @field:JsonProperty("businessId")
    val businessId: kotlin.Long,

    @field:JsonProperty("dateFrom")
    val dateFrom: java.time.LocalDate,

    @field:JsonProperty("dateTo")
    val dateTo: java.time.LocalDate,

    @field:JsonProperty("campaignIds")
    val campaignIds: kotlin.collections.List<kotlin.Long>? = null,

    @field:JsonProperty("promoId")
    val promoId: kotlin.String? = null,

)
