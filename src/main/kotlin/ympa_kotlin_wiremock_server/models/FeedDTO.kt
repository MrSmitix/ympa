@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package ympa_kotlin_wiremock_server.models

import com.fasterxml.jackson.annotation.JsonProperty

data class FeedDTO(
    @field:JsonProperty("id")
    val id: kotlin.Long? = null,

    @field:JsonProperty("login")
    val login: kotlin.String? = null,

    @field:JsonProperty("name")
    val name: kotlin.String? = null,

    @field:JsonProperty("password")
    val password: kotlin.String? = null,

    @field:JsonProperty("uploadDate")
    val uploadDate: java.time.OffsetDateTime? = null,

    @field:JsonProperty("url")
    val url: kotlin.String? = null,

    @field:JsonProperty("content")
    val content: FeedContentDTO? = null,

    @field:JsonProperty("download")
    val download: FeedDownloadDTO? = null,

    @field:JsonProperty("placement")
    val placement: FeedPlacementDTO? = null,

    @field:JsonProperty("publication")
    val publication: FeedPublicationDTO? = null,

)
