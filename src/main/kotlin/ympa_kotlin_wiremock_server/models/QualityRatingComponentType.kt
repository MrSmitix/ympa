@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package ympa_kotlin_wiremock_server.models

import com.fasterxml.jackson.annotation.JsonProperty

enum class QualityRatingComponentType {
    @JsonProperty(value = "DBS_CANCELLATION_RATE") DBS_CANCELLATION_RATE,
    @JsonProperty(value = "DBS_LATE_DELIVERY_RATE") DBS_LATE_DELIVERY_RATE,
    @JsonProperty(value = "FBS_CANCELLATION_RATE") FBS_CANCELLATION_RATE,
    @JsonProperty(value = "FBS_LATE_SHIP_RATE") FBS_LATE_SHIP_RATE,
    @JsonProperty(value = "FBY_LATE_DELIVERY_RATE") FBY_LATE_DELIVERY_RATE,
    @JsonProperty(value = "FBY_CANCELLATION_RATE") FBY_CANCELLATION_RATE,
    @JsonProperty(value = "FBY_DELIVERY_DIFF_RATE") FBY_DELIVERY_DIFF_RATE,
    @JsonProperty(value = "FBY_LATE_EDITING_RATE") FBY_LATE_EDITING_RATE,
}
