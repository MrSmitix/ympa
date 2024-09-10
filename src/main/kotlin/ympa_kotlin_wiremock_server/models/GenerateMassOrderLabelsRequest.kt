@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package ympa_kotlin_wiremock_server.models

import com.fasterxml.jackson.annotation.JsonProperty

data class GenerateMassOrderLabelsRequest(
    @field:JsonProperty("businessId")
    val businessId: kotlin.Long,

    @field:JsonProperty("orderIds")
    val orderIds: kotlin.collections.Set<kotlin.Long>,

)
