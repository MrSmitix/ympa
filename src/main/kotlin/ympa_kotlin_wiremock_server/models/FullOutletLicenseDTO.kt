@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package ympa_kotlin_wiremock_server.models

import com.fasterxml.jackson.annotation.JsonProperty

data class FullOutletLicenseDTO(
    @field:JsonProperty("id")
    val id: kotlin.Long? = null,

    @field:JsonProperty("outletId")
    val outletId: kotlin.Long? = null,

    @field:JsonProperty("licenseType")
    val licenseType: LicenseType? = null,

    @field:JsonProperty("number")
    val number: kotlin.String? = null,

    @field:JsonProperty("dateOfIssue")
    val dateOfIssue: java.time.OffsetDateTime? = null,

    @field:JsonProperty("dateOfExpiry")
    val dateOfExpiry: java.time.OffsetDateTime? = null,

    @field:JsonProperty("checkStatus")
    val checkStatus: LicenseCheckStatusType? = null,

    @field:JsonProperty("checkComment")
    val checkComment: kotlin.String? = null,

)
