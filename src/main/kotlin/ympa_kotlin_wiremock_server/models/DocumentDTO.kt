@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package ympa_kotlin_wiremock_server.models

import com.fasterxml.jackson.annotation.JsonProperty

data class DocumentDTO(
    @field:JsonProperty("status")
    val status: OrderDocumentStatusType? = null,

    @field:JsonProperty("number")
    val number: kotlin.String? = null,

    @field:JsonProperty("date")
    val date: java.time.LocalDate? = null,

)
