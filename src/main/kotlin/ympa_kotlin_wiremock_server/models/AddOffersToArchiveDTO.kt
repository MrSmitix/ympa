@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package ympa_kotlin_wiremock_server.models

import com.fasterxml.jackson.annotation.JsonProperty

data class AddOffersToArchiveDTO(
    @field:JsonProperty("notArchivedOffers")
    val notArchivedOffers: kotlin.collections.List<AddOffersToArchiveErrorDTO>? = null,

)
