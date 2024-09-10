@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package ympa_kotlin_wiremock_server.models

import com.fasterxml.jackson.annotation.JsonProperty

data class ShipmentInfoDTO(
    @field:JsonProperty("orderIds")
    val orderIds: kotlin.collections.Set<kotlin.Long>,

    @field:JsonProperty("id")
    val id: kotlin.Long? = null,

    @field:JsonProperty("planIntervalFrom")
    val planIntervalFrom: java.time.OffsetDateTime? = null,

    @field:JsonProperty("planIntervalTo")
    val planIntervalTo: java.time.OffsetDateTime? = null,

    @field:JsonProperty("shipmentType")
    val shipmentType: ShipmentType? = null,

    @field:JsonProperty("warehouse")
    val warehouse: PartnerShipmentWarehouseDTO? = null,

    @field:JsonProperty("warehouseTo")
    val warehouseTo: PartnerShipmentWarehouseDTO? = null,

    @field:JsonProperty("externalId")
    val externalId: kotlin.String? = null,

    @field:JsonProperty("deliveryService")
    val deliveryService: DeliveryServiceDTO? = null,

    @field:JsonProperty("palletsCount")
    val palletsCount: PalletsCountDTO? = null,

    @field:JsonProperty("draftCount")
    val draftCount: kotlin.Int? = null,

    @field:JsonProperty("plannedCount")
    val plannedCount: kotlin.Int? = null,

    @field:JsonProperty("factCount")
    val factCount: kotlin.Int? = null,

    @field:JsonProperty("status")
    val status: ShipmentStatusType? = null,

    @field:JsonProperty("statusDescription")
    val statusDescription: kotlin.String? = null,

    @field:JsonProperty("statusUpdateTime")
    val statusUpdateTime: java.time.OffsetDateTime? = null,

)
