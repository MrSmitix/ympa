@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package ympa_kotlin_wiremock_server.models

import com.fasterxml.jackson.annotation.JsonProperty

data class OrderLabelDTO(
    @field:JsonProperty("orderId")
    val orderId: kotlin.Long,

    @field:JsonProperty("placesNumber")
    val placesNumber: kotlin.Int,

    @field:JsonProperty("url")
    val url: kotlin.String,

    @field:JsonProperty("parcelBoxLabels")
    val parcelBoxLabels: kotlin.collections.List<ParcelBoxLabelDTO>,

)
