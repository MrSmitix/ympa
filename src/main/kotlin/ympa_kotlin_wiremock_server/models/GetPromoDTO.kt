@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package ympa_kotlin_wiremock_server.models

import com.fasterxml.jackson.annotation.JsonProperty

data class GetPromoDTO(
    @field:JsonProperty("id")
    val id: kotlin.String,

    @field:JsonProperty("name")
    val name: kotlin.String,

    @field:JsonProperty("period")
    val period: PromoPeriodDTO,

    @field:JsonProperty("participating")
    val participating: kotlin.Boolean,

    @field:JsonProperty("assortmentInfo")
    val assortmentInfo: GetPromoAssortmentInfoDTO,

    @field:JsonProperty("mechanicsInfo")
    val mechanicsInfo: GetPromoMechanicsInfoDTO,

    @field:JsonProperty("bestsellerInfo")
    val bestsellerInfo: GetPromoBestsellerInfoDTO,

    @field:JsonProperty("channels")
    val channels: kotlin.collections.List<ChannelType>? = null,

    @field:JsonProperty("constraints")
    val constraints: GetPromoConstraintsDTO? = null,

)
