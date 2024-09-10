@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package ympa_kotlin_wiremock_server.models

import com.fasterxml.jackson.annotation.JsonProperty

enum class ReturnInstanceStockType {
    @JsonProperty(value = "FIT") FIT,
    @JsonProperty(value = "DEFECT") DEFECT,
    @JsonProperty(value = "ANOMALY") ANOMALY,
    @JsonProperty(value = "SURPLUS") SURPLUS,
    @JsonProperty(value = "EXPIRED") EXPIRED,
    @JsonProperty(value = "MISGRADING") MISGRADING,
    @JsonProperty(value = "UNDEFINED") UNDEFINED,
    @JsonProperty(value = "INCORRECT_IMEI") INCORRECT_IMEI,
    @JsonProperty(value = "INCORRECT_SERIAL_NUMBER") INCORRECT_SERIAL_NUMBER,
    @JsonProperty(value = "INCORRECT_CIS") INCORRECT_CIS,
    @JsonProperty(value = "PART_MISSING") PART_MISSING,
    @JsonProperty(value = "NON_COMPLIENT") NON_COMPLIENT,
    @JsonProperty(value = "NOT_ACCEPTABLE") NOT_ACCEPTABLE,
    @JsonProperty(value = "SERVICE") SERVICE,
    @JsonProperty(value = "MARKDOWN") MARKDOWN,
    @JsonProperty(value = "DEMO") DEMO,
    @JsonProperty(value = "REPAIR") REPAIR,
    @JsonProperty(value = "FIRMWARE") FIRMWARE,
    @JsonProperty(value = "UNKNOWN") UNKNOWN,
}
