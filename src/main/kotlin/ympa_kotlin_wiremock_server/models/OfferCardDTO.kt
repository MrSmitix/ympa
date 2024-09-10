@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package ympa_kotlin_wiremock_server.models

import com.fasterxml.jackson.annotation.JsonProperty

data class OfferCardDTO(
    @field:JsonProperty("offerId")
    val offerId: kotlin.String,

    @field:JsonProperty("mapping")
    val mapping: GetMappingDTO? = null,

    @field:JsonProperty("parameterValues")
    val parameterValues: kotlin.collections.List<ParameterValueDTO>? = null,

    @field:JsonProperty("cardStatus")
    val cardStatus: OfferCardStatusType? = null,

    @field:JsonProperty("contentRating")
    val contentRating: kotlin.Int? = null,

    @field:JsonProperty("recommendations")
    val recommendations: kotlin.collections.List<OfferCardRecommendationDTO>? = null,

    @field:JsonProperty("errors")
    val errors: kotlin.collections.List<OfferErrorDTO>? = null,

    @field:JsonProperty("warnings")
    val warnings: kotlin.collections.List<OfferErrorDTO>? = null,

)
