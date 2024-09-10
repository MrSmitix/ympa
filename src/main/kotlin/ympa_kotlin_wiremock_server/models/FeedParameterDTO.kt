@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package ympa_kotlin_wiremock_server.models

import com.fasterxml.jackson.annotation.JsonProperty

data class FeedParameterDTO(
    @field:JsonProperty("name")
    val name: kotlin.String,

    @field:JsonProperty("deleted")
    val deleted: kotlin.Boolean? = null,

    @field:JsonProperty("values")
    val propertyValues: kotlin.collections.List<kotlin.Int>? = null,

)
