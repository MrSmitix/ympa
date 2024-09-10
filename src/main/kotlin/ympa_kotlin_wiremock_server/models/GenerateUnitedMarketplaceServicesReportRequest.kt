@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package ympa_kotlin_wiremock_server.models

import com.fasterxml.jackson.annotation.JsonProperty

data class GenerateUnitedMarketplaceServicesReportRequest(
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

    @field:JsonProperty("yearFrom")
    val yearFrom: kotlin.Int? = null,

    @field:JsonProperty("monthFrom")
    val monthFrom: kotlin.Int? = null,

    @field:JsonProperty("yearTo")
    val yearTo: kotlin.Int? = null,

    @field:JsonProperty("monthTo")
    val monthTo: kotlin.Int? = null,

    @field:JsonProperty("placementPrograms")
    val placementPrograms: kotlin.collections.List<PlacementType>? = null,

    @field:JsonProperty("inns")
    val inns: kotlin.collections.List<kotlin.String>? = null,

    @field:JsonProperty("campaignIds")
    val campaignIds: kotlin.collections.List<kotlin.Long>? = null,

)
