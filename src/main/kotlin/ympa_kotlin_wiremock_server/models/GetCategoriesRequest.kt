@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package ympa_kotlin_wiremock_server.models

import com.fasterxml.jackson.annotation.JsonProperty

data class GetCategoriesRequest(
    @field:JsonProperty("language")
    val language: LanguageType? = null,

)
