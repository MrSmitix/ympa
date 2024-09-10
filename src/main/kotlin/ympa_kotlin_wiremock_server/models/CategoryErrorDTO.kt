@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package ympa_kotlin_wiremock_server.models

import com.fasterxml.jackson.annotation.JsonProperty

data class CategoryErrorDTO(
    @field:JsonProperty("categoryId")
    val categoryId: kotlin.Long? = null,

    @field:JsonProperty("type")
    val type: CategoryErrorType? = null,

)
