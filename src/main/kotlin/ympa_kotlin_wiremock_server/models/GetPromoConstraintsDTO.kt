@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package ympa_kotlin_wiremock_server.models

import com.fasterxml.jackson.annotation.JsonProperty

data class GetPromoConstraintsDTO(
    @field:JsonProperty("warehouseIds")
    val warehouseIds: kotlin.collections.List<kotlin.Long>? = null,

)
