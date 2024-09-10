@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package ympa_kotlin_wiremock_server.models

import com.fasterxml.jackson.annotation.JsonProperty

data class GetMappingDTO(
    @field:JsonProperty("marketSku")
    val marketSku: kotlin.Long? = null,

    @field:JsonProperty("marketSkuName")
    val marketSkuName: kotlin.String? = null,

    @field:JsonProperty("marketModelId")
    val marketModelId: kotlin.Long? = null,

    @field:JsonProperty("marketModelName")
    val marketModelName: kotlin.String? = null,

    @field:JsonProperty("marketCategoryId")
    val marketCategoryId: kotlin.Long? = null,

    @field:JsonProperty("marketCategoryName")
    val marketCategoryName: kotlin.String? = null,

)
