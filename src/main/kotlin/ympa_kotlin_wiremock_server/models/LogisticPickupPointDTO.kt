@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package ympa_kotlin_wiremock_server.models

import com.fasterxml.jackson.annotation.JsonProperty

data class LogisticPickupPointDTO(
    @field:JsonProperty("id")
    val id: kotlin.Long? = null,

    @field:JsonProperty("name")
    val name: kotlin.String? = null,

    @field:JsonProperty("address")
    val address: PickupAddressDTO? = null,

    @field:JsonProperty("instruction")
    val instruction: kotlin.String? = null,

    @field:JsonProperty("type")
    val type: LogisticPointType? = null,

    @field:JsonProperty("logisticPartnerId")
    val logisticPartnerId: kotlin.Long? = null,

)
