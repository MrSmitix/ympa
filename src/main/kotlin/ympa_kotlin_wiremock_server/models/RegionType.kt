@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package ympa_kotlin_wiremock_server.models

import com.fasterxml.jackson.annotation.JsonProperty

enum class RegionType {
    @JsonProperty(value = "OTHER") OTHER,
    @JsonProperty(value = "CONTINENT") CONTINENT,
    @JsonProperty(value = "REGION") REGION,
    @JsonProperty(value = "COUNTRY") COUNTRY,
    @JsonProperty(value = "COUNTRY_DISTRICT") COUNTRY_DISTRICT,
    @JsonProperty(value = "REPUBLIC") REPUBLIC,
    @JsonProperty(value = "CITY") CITY,
    @JsonProperty(value = "VILLAGE") VILLAGE,
    @JsonProperty(value = "CITY_DISTRICT") CITY_DISTRICT,
    @JsonProperty(value = "SUBWAY_STATION") SUBWAY_STATION,
    @JsonProperty(value = "REPUBLIC_AREA") REPUBLIC_AREA,
}
