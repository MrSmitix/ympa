@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package ympa_kotlin_wiremock_server.models

import com.fasterxml.jackson.annotation.JsonProperty

data class FeedIndexLogsResultDTO(
    @field:JsonProperty("indexLogRecords")
    val indexLogRecords: kotlin.collections.List<FeedIndexLogsRecordDTO>,

    @field:JsonProperty("feed")
    val feed: FeedIndexLogsFeedDTO? = null,

    @field:JsonProperty("total")
    val total: kotlin.Long? = null,

)
