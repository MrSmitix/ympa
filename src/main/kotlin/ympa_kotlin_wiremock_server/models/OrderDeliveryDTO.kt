@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package ympa_kotlin_wiremock_server.models

import com.fasterxml.jackson.annotation.JsonProperty

data class OrderDeliveryDTO(
    @field:JsonProperty("id")
    val id: kotlin.String? = null,

    @field:JsonProperty("type")
    val type: OrderDeliveryType? = null,

    @field:JsonProperty("serviceName")
    val serviceName: kotlin.String? = null,

    @field:JsonProperty("price")
    val price: java.math.BigDecimal? = null,

    @field:JsonProperty("deliveryPartnerType")
    val deliveryPartnerType: OrderDeliveryPartnerType? = null,

    @field:JsonProperty("courier")
    val courier: OrderCourierDTO? = null,

    @field:JsonProperty("dates")
    val dates: OrderDeliveryDatesDTO? = null,

    @field:JsonProperty("region")
    val region: RegionDTO? = null,

    @field:JsonProperty("address")
    val address: OrderDeliveryAddressDTO? = null,

    @field:JsonProperty("vat")
    val vat: OrderVatType? = null,

    @field:JsonProperty("deliveryServiceId")
    val deliveryServiceId: kotlin.Long? = null,

    @field:JsonProperty("liftType")
    val liftType: OrderLiftType? = null,

    @field:JsonProperty("liftPrice")
    val liftPrice: java.math.BigDecimal? = null,

    @field:JsonProperty("outletCode")
    val outletCode: kotlin.String? = null,

    @field:JsonProperty("outletStorageLimitDate")
    val outletStorageLimitDate: kotlin.String? = null,

    @field:JsonProperty("dispatchType")
    val dispatchType: OrderDeliveryDispatchType? = null,

    @field:JsonProperty("tracks")
    val tracks: kotlin.collections.List<OrderTrackDTO>? = null,

    @field:JsonProperty("shipments")
    val shipments: kotlin.collections.List<OrderShipmentDTO>? = null,

    @field:JsonProperty("estimated")
    val estimated: kotlin.Boolean? = null,

    @field:JsonProperty("eacType")
    val eacType: OrderDeliveryEacType? = null,

    @field:JsonProperty("eacCode")
    val eacCode: kotlin.String? = null,

)
