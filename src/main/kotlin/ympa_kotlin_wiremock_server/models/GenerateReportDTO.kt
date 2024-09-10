@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package ympa_kotlin_wiremock_server.models

import com.fasterxml.jackson.annotation.JsonProperty

data class GenerateReportDTO(
    @field:JsonProperty("reportId")
    val reportId: kotlin.String,

    @field:JsonProperty("estimatedGenerationTime")
    val estimatedGenerationTime: kotlin.Long,

)
