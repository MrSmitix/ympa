@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package ympa_kotlin_wiremock_server.models

import com.fasterxml.jackson.annotation.JsonProperty

data class CategoryContentParametersDTO(
    @field:JsonProperty("categoryId")
    val categoryId: kotlin.Int,

    @field:JsonProperty("parameters")
    val parameters: kotlin.collections.List<CategoryParameterDTO>? = null,

)
