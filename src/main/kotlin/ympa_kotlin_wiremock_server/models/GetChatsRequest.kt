@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package ympa_kotlin_wiremock_server.models

import com.fasterxml.jackson.annotation.JsonProperty

data class GetChatsRequest(
    @field:JsonProperty("orderIds")
    val orderIds: kotlin.collections.List<kotlin.Long>? = null,

    @field:JsonProperty("types")
    val types: kotlin.collections.List<ChatType>? = null,

    @field:JsonProperty("statuses")
    val statuses: kotlin.collections.List<ChatStatusType>? = null,

)
