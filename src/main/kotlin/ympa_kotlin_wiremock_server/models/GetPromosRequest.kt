@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package ympa_kotlin_wiremock_server.models

import com.fasterxml.jackson.annotation.JsonProperty

data class GetPromosRequest(
    @field:JsonProperty("participation")
    val participation: PromoParticipationType? = null,

    @field:JsonProperty("mechanics")
    val mechanics: MechanicsType? = null,

)
