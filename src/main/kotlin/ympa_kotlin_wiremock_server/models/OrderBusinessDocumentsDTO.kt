@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package ympa_kotlin_wiremock_server.models

import com.fasterxml.jackson.annotation.JsonProperty

data class OrderBusinessDocumentsDTO(
    @field:JsonProperty("upd")
    val upd: DocumentDTO? = null,

    @field:JsonProperty("ukd")
    val ukd: DocumentDTO? = null,

    @field:JsonProperty("torgTwelve")
    val torgTwelve: DocumentDTO? = null,

    @field:JsonProperty("sf")
    val sf: DocumentDTO? = null,

    @field:JsonProperty("ksf")
    val ksf: DocumentDTO? = null,

)
