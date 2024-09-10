@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package ympa_kotlin_wiremock_server.models

import com.fasterxml.jackson.annotation.JsonProperty

data class FeedPublicationFullDTO(
    @field:JsonProperty("fileTime")
    val fileTime: java.time.OffsetDateTime? = null,

    @field:JsonProperty("publishedTime")
    val publishedTime: java.time.OffsetDateTime? = null,

)
