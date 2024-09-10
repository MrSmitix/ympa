@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package ympa_kotlin_wiremock_server.models

import com.fasterxml.jackson.annotation.JsonProperty

data class RegionDTO(
    @field:JsonProperty("name")
    val name: kotlin.String,

    @field:JsonProperty("type")
    val type: RegionType,

    @field:JsonProperty("id")
    val id: kotlin.Long? = null,

    @field:JsonProperty("parent")
    val parent: RegionDTO? = null,

    @field:JsonProperty("children")
    val children: kotlin.collections.List<RegionDTO>? = null,

)
