@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package ympa_kotlin_wiremock_server.models

import com.fasterxml.jackson.annotation.JsonProperty

data class GetCategoriesMaxSaleQuantumRequest(
    @field:JsonProperty("marketCategoryIds")
    val marketCategoryIds: kotlin.collections.Set<kotlin.Long>,

)
