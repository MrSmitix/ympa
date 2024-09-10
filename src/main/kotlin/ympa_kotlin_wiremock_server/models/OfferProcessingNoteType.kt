@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package ympa_kotlin_wiremock_server.models

import com.fasterxml.jackson.annotation.JsonProperty

enum class OfferProcessingNoteType {
    @JsonProperty(value = "ASSORTMENT") ASSORTMENT,
    @JsonProperty(value = "CANCELLED") CANCELLED,
    @JsonProperty(value = "CONFLICTING_INFORMATION") CONFLICTING_INFORMATION,
    @JsonProperty(value = "OTHER") OTHER,
    @JsonProperty(value = "DEPARTMENT_FROZEN") DEPARTMENT_FROZEN,
    @JsonProperty(value = "INCORRECT_INFORMATION") INCORRECT_INFORMATION,
    @JsonProperty(value = "LEGAL_CONFLICT") LEGAL_CONFLICT,
    @JsonProperty(value = "NEED_CLASSIFICATION_INFORMATION") NEED_CLASSIFICATION_INFORMATION,
    @JsonProperty(value = "NEED_INFORMATION") NEED_INFORMATION,
    @JsonProperty(value = "NEED_PICTURES") NEED_PICTURES,
    @JsonProperty(value = "NEED_VENDOR") NEED_VENDOR,
    @JsonProperty(value = "NO_CATEGORY") NO_CATEGORY,
    @JsonProperty(value = "NO_KNOWLEDGE") NO_KNOWLEDGE,
    @JsonProperty(value = "NO_PARAMETERS_IN_SHOP_TITLE") NO_PARAMETERS_IN_SHOP_TITLE,
    @JsonProperty(value = "NO_SIZE_MEASURE") NO_SIZE_MEASURE,
    @JsonProperty(value = "SAMPLE_LINE") SAMPLE_LINE,
}
