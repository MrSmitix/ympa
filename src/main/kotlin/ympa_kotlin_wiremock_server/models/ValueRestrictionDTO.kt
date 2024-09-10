@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package ympa_kotlin_wiremock_server.models

import com.fasterxml.jackson.annotation.JsonProperty

data class ValueRestrictionDTO(
    @field:JsonProperty("limitingParameterId")
    val limitingParameterId: kotlin.Long,

    @field:JsonProperty("limitedValues")
    val limitedValues: kotlin.collections.List<OptionValuesLimitedDTO>,

)
