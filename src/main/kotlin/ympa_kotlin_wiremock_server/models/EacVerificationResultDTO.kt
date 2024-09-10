@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package ympa_kotlin_wiremock_server.models

import com.fasterxml.jackson.annotation.JsonProperty

data class EacVerificationResultDTO(
    @field:JsonProperty("verificationResult")
    val verificationResult: EacVerificationStatusType? = null,

    @field:JsonProperty("attemptsLeft")
    val attemptsLeft: kotlin.Int? = null,

)
