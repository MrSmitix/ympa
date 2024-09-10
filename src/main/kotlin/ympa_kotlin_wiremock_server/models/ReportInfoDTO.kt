@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package ympa_kotlin_wiremock_server.models

import com.fasterxml.jackson.annotation.JsonProperty

data class ReportInfoDTO(
    @field:JsonProperty("status")
    val status: ReportStatusType,

    @field:JsonProperty("generationRequestedAt")
    val generationRequestedAt: java.time.OffsetDateTime,

    @field:JsonProperty("subStatus")
    val subStatus: ReportSubStatusType? = null,

    @field:JsonProperty("generationFinishedAt")
    val generationFinishedAt: java.time.OffsetDateTime? = null,

    @field:JsonProperty("file")
    val file: kotlin.String? = null,

    @field:JsonProperty("estimatedGenerationTime")
    val estimatedGenerationTime: kotlin.Long? = null,

)
