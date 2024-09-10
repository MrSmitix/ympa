@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package ympa_kotlin_wiremock_server.models

import com.fasterxml.jackson.annotation.JsonProperty

data class ReturnItemDTO(
    @field:JsonProperty("shopSku")
    val shopSku: kotlin.String,

    @field:JsonProperty("count")
    val count: kotlin.Long,

    @field:JsonProperty("marketSku")
    val marketSku: kotlin.Long? = null,

    @field:JsonProperty("decisions")
    val decisions: kotlin.collections.List<ReturnDecisionDTO>? = null,

    @field:JsonProperty("instances")
    val instances: kotlin.collections.List<ReturnInstanceDTO>? = null,

    @field:JsonProperty("tracks")
    val tracks: kotlin.collections.List<TrackDTO>? = null,

)
