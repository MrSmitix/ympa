@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package ympa_kotlin_wiremock_server.models

import com.fasterxml.jackson.annotation.JsonProperty

enum class ParameterType {
    @JsonProperty(value = "TEXT") TEXT,
    @JsonProperty(value = "ENUM") ENUM,
    @JsonProperty(value = "BOOLEAN") BOOLEAN,
    @JsonProperty(value = "NUMERIC") NUMERIC,
}
