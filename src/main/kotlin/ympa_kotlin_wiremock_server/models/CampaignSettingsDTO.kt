@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package ympa_kotlin_wiremock_server.models

import com.fasterxml.jackson.annotation.JsonProperty

data class CampaignSettingsDTO(
    @field:JsonProperty("countryRegion")
    val countryRegion: kotlin.Long? = null,

    @field:JsonProperty("shopName")
    val shopName: kotlin.String? = null,

    @field:JsonProperty("showInContext")
    val showInContext: kotlin.Boolean? = null,

    @field:JsonProperty("showInPremium")
    val showInPremium: kotlin.Boolean? = null,

    @field:JsonProperty("useOpenStat")
    val useOpenStat: kotlin.Boolean? = null,

    @field:JsonProperty("localRegion")
    val localRegion: CampaignSettingsLocalRegionDTO? = null,

)
