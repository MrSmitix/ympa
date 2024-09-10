@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package ympa_kotlin_wiremock_server.models

import com.fasterxml.jackson.annotation.JsonProperty

data class CategoryParameterUnitDTO(
    @field:JsonProperty("defaultUnitId")
    val defaultUnitId: kotlin.Long,

    @field:JsonProperty("units")
    val units: kotlin.collections.List<UnitDTO>,

)
