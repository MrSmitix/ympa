@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package ympa_kotlin_wiremock_server.models

import com.fasterxml.jackson.annotation.JsonProperty

data class CategoryDTO(
    @field:JsonProperty("id")
    val id: kotlin.Long,

    @field:JsonProperty("name")
    val name: kotlin.String,

    @field:JsonProperty("children")
    val children: kotlin.collections.List<CategoryDTO>? = null,

)
