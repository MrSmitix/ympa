@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package ympa_kotlin_wiremock_server.models

import com.fasterxml.jackson.annotation.JsonProperty

data class FeedbackGradesDTO(
    @field:JsonProperty("factors")
    val factors: kotlin.collections.List<FeedbackFactorDTO>,

    @field:JsonProperty("average")
    val average: java.math.BigDecimal? = null,

    @field:JsonProperty("agreeCount")
    val agreeCount: kotlin.Long? = null,

    @field:JsonProperty("rejectCount")
    val rejectCount: kotlin.Long? = null,

)
