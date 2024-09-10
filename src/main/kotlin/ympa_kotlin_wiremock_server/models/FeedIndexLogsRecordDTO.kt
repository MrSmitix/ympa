@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package ympa_kotlin_wiremock_server.models

import com.fasterxml.jackson.annotation.JsonProperty

data class FeedIndexLogsRecordDTO(
    @field:JsonProperty("downloadTime")
    val downloadTime: java.time.OffsetDateTime? = null,

    @field:JsonProperty("fileTime")
    val fileTime: java.time.OffsetDateTime? = null,

    @field:JsonProperty("generationId")
    val generationId: kotlin.Long? = null,

    @field:JsonProperty("indexType")
    val indexType: FeedIndexLogsIndexType? = null,

    @field:JsonProperty("publishedTime")
    val publishedTime: java.time.OffsetDateTime? = null,

    @field:JsonProperty("status")
    val status: FeedIndexLogsStatusType? = null,

    @field:JsonProperty("error")
    val error: FeedIndexLogsErrorDTO? = null,

    @field:JsonProperty("offers")
    val offers: FeedIndexLogsOffersDTO? = null,

)
