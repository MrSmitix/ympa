@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package ympa_kotlin_wiremock_server.models

import com.fasterxml.jackson.annotation.JsonProperty

data class DeleteOffersFromArchiveDTO(
    @field:JsonProperty("notUnarchivedOfferIds")
    val notUnarchivedOfferIds: kotlin.collections.List<kotlin.String>? = null,

)
