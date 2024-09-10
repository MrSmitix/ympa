@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package ympa_kotlin_wiremock_server.models

import com.fasterxml.jackson.annotation.JsonProperty

data class OfferContentDTO(
    @field:JsonProperty("offerId")
    val offerId: kotlin.String,

    @field:JsonProperty("categoryId")
    val categoryId: kotlin.Int,

    @field:JsonProperty("parameterValues")
    val parameterValues: kotlin.collections.List<ParameterValueDTO>,

)
