@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package ympa_kotlin_wiremock_server.models

import com.fasterxml.jackson.annotation.JsonProperty

data class UpdateStockItemDTO(
    @field:JsonProperty("count")
    val count: kotlin.Long,

    @field:JsonProperty("updatedAt")
    val updatedAt: java.time.OffsetDateTime? = null,

)
