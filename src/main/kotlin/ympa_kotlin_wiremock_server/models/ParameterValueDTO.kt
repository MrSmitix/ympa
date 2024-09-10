@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package ympa_kotlin_wiremock_server.models

import com.fasterxml.jackson.annotation.JsonProperty

data class ParameterValueDTO(
    @field:JsonProperty("parameterId")
    val parameterId: kotlin.Long,

    @field:JsonProperty("unitId")
    val unitId: kotlin.Long? = null,

    @field:JsonProperty("valueId")
    val valueId: kotlin.Long? = null,

    @field:JsonProperty("value")
    val `value`: kotlin.String? = null,

)
