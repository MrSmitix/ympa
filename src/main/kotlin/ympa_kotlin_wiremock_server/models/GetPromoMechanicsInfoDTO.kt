@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package ympa_kotlin_wiremock_server.models

import com.fasterxml.jackson.annotation.JsonProperty

data class GetPromoMechanicsInfoDTO(
    @field:JsonProperty("type")
    val type: MechanicsType,

    @field:JsonProperty("promocodeInfo")
    val promocodeInfo: GetPromoPromocodeInfoDTO? = null,

)
