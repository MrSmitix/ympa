@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package ympa_kotlin_wiremock_server.models

import com.fasterxml.jackson.annotation.JsonProperty

data class UpdateOutletLicenseRequest(
    @field:JsonProperty("licenses")
    val licenses: kotlin.collections.List<OutletLicenseDTO>,

)
