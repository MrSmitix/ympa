@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package ympa_kotlin_wiremock_server.models

import com.fasterxml.jackson.annotation.JsonProperty

data class OptionValuesLimitedDTO(
    @field:JsonProperty("limitingOptionValueId")
    val limitingOptionValueId: kotlin.Long,

    @field:JsonProperty("optionValueIds")
    val optionValueIds: kotlin.collections.List<kotlin.Long>,

)
