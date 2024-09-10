@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package ympa_kotlin_wiremock_server.models

import com.fasterxml.jackson.annotation.JsonProperty

data class QualityRatingDTO(
    @field:JsonProperty("rating")
    val rating: kotlin.Long,

    @field:JsonProperty("calculationDate")
    val calculationDate: java.time.LocalDate,

    @field:JsonProperty("components")
    val components: kotlin.collections.List<QualityRatingComponentDTO>,

)
