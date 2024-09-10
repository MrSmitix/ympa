@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package ympa_kotlin_wiremock_server.models

import com.fasterxml.jackson.annotation.JsonProperty

enum class OfferCardRecommendationType {
    @JsonProperty(value = "HAS_VIDEO") HAS_VIDEO,
    @JsonProperty(value = "RECOGNIZED_VENDOR") RECOGNIZED_VENDOR,
    @JsonProperty(value = "MAIN") MAIN,
    @JsonProperty(value = "ADDITIONAL") ADDITIONAL,
    @JsonProperty(value = "DISTINCTIVE") DISTINCTIVE,
    @JsonProperty(value = "FILTERABLE") FILTERABLE,
    @JsonProperty(value = "PICTURE_COUNT") PICTURE_COUNT,
    @JsonProperty(value = "HAS_DESCRIPTION") HAS_DESCRIPTION,
    @JsonProperty(value = "HAS_BARCODE") HAS_BARCODE,
    @JsonProperty(value = "FIRST_PICTURE_SIZE") FIRST_PICTURE_SIZE,
    @JsonProperty(value = "TITLE_LENGTH") TITLE_LENGTH,
    @JsonProperty(value = "DESCRIPTION_LENGTH") DESCRIPTION_LENGTH,
    @JsonProperty(value = "AVERAGE_PICTURE_SIZE") AVERAGE_PICTURE_SIZE,
    @JsonProperty(value = "FIRST_VIDEO_SIZE") FIRST_VIDEO_SIZE,
    @JsonProperty(value = "FIRST_VIDEO_LENGTH") FIRST_VIDEO_LENGTH,
    @JsonProperty(value = "AVERAGE_VIDEO_SIZE") AVERAGE_VIDEO_SIZE,
    @JsonProperty(value = "VIDEO_COUNT") VIDEO_COUNT,
}
