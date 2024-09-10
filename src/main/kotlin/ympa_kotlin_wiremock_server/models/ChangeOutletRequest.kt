@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package ympa_kotlin_wiremock_server.models

import com.fasterxml.jackson.annotation.JsonProperty

data class ChangeOutletRequest(
    @field:JsonProperty("name")
    val name: kotlin.String,

    @field:JsonProperty("type")
    val type: OutletType,

    @field:JsonProperty("address")
    val address: OutletAddressDTO,

    @field:JsonProperty("phones")
    val phones: kotlin.collections.List<kotlin.String>,

    @field:JsonProperty("workingSchedule")
    val workingSchedule: OutletWorkingScheduleDTO,

    @field:JsonProperty("coords")
    val coords: kotlin.String? = null,

    @field:JsonProperty("isMain")
    val isMain: kotlin.Boolean? = null,

    @field:JsonProperty("shopOutletCode")
    val shopOutletCode: kotlin.String? = null,

    @field:JsonProperty("visibility")
    val visibility: OutletVisibilityType? = null,

    @field:JsonProperty("deliveryRules")
    val deliveryRules: kotlin.collections.List<OutletDeliveryRuleDTO>? = null,

    @field:JsonProperty("storagePeriod")
    val storagePeriod: kotlin.Long? = null,

)
