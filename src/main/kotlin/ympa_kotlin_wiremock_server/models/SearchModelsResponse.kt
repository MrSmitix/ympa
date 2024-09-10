@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package ympa_kotlin_wiremock_server.models

import com.fasterxml.jackson.annotation.JsonProperty

data class SearchModelsResponse(
    @field:JsonProperty("models")
    val models: kotlin.collections.List<ModelDTO>,

    @field:JsonProperty("currency")
    val currency: CurrencyType? = null,

    @field:JsonProperty("regionId")
    val regionId: kotlin.Long? = null,

    @field:JsonProperty("pager")
    val pager: FlippingPagerDTO? = null,

)
