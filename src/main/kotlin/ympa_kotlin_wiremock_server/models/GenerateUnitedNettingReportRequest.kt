@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package ympa_kotlin_wiremock_server.models

import com.fasterxml.jackson.annotation.JsonProperty

data class GenerateUnitedNettingReportRequest(
    @field:JsonProperty("businessId")
    val businessId: kotlin.Long,

    @field:JsonProperty("dateTimeFrom")
    val dateTimeFrom: java.time.OffsetDateTime? = null,

    @field:JsonProperty("dateTimeTo")
    val dateTimeTo: java.time.OffsetDateTime? = null,

    @field:JsonProperty("dateFrom")
    val dateFrom: java.time.LocalDate? = null,

    @field:JsonProperty("dateTo")
    val dateTo: java.time.LocalDate? = null,

    @field:JsonProperty("bankOrderId")
    val bankOrderId: kotlin.Long? = null,

    @field:JsonProperty("bankOrderDateTime")
    val bankOrderDateTime: java.time.OffsetDateTime? = null,

    @field:JsonProperty("placementPrograms")
    val placementPrograms: kotlin.collections.List<PlacementType>? = null,

    @field:JsonProperty("inns")
    val inns: kotlin.collections.List<kotlin.String>? = null,

    @field:JsonProperty("campaignIds")
    val campaignIds: kotlin.collections.List<kotlin.Long>? = null,

)
