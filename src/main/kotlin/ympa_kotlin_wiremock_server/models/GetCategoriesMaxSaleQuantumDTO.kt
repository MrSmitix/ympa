@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package ympa_kotlin_wiremock_server.models

import com.fasterxml.jackson.annotation.JsonProperty

data class GetCategoriesMaxSaleQuantumDTO(
    @field:JsonProperty("results")
    val results: kotlin.collections.List<MaxSaleQuantumDTO>,

    @field:JsonProperty("errors")
    val errors: kotlin.collections.List<CategoryErrorDTO>? = null,

)
