package ympa_kotlin_spring_server.models

import java.util.Objects
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.annotation.JsonValue
import ympa_kotlin_spring_server.models.OrderCourierDTO
import ympa_kotlin_spring_server.models.OrderDeliveryAddressDTO
import ympa_kotlin_spring_server.models.OrderDeliveryDatesDTO
import ympa_kotlin_spring_server.models.OrderDeliveryDispatchType
import ympa_kotlin_spring_server.models.OrderDeliveryEacType
import ympa_kotlin_spring_server.models.OrderDeliveryPartnerType
import ympa_kotlin_spring_server.models.OrderDeliveryType
import ympa_kotlin_spring_server.models.OrderLiftType
import ympa_kotlin_spring_server.models.OrderShipmentDTO
import ympa_kotlin_spring_server.models.OrderTrackDTO
import ympa_kotlin_spring_server.models.OrderVatType
import ympa_kotlin_spring_server.models.RegionDTO
import javax.validation.constraints.DecimalMax
import javax.validation.constraints.DecimalMin
import javax.validation.constraints.Email
import javax.validation.constraints.Max
import javax.validation.constraints.Min
import javax.validation.constraints.NotNull
import javax.validation.constraints.Pattern
import javax.validation.constraints.Size
import javax.validation.Valid
import io.swagger.v3.oas.annotations.media.Schema

/**
 * Информация о доставке.
 * @param id Идентификатор доставки, присвоенный магазином.  Указывается, только если магазин передал данный идентификатор в ответе на запрос методом [POST cart](../../pushapi/reference/cart.md). 
 * @param type 
 * @param serviceName Наименование службы доставки.
 * @param price {% note warning \"\" %}  Этот параметр устарел. Стоимость доставки смотрите в параметре `deliveryTotal`.  {% endnote %}  Стоимость доставки в валюте заказа. 
 * @param deliveryPartnerType 
 * @param courier 
 * @param dates 
 * @param region 
 * @param address 
 * @param vat 
 * @param deliveryServiceId Идентификатор службы доставки.
 * @param liftType 
 * @param liftPrice Стоимость подъема на этаж.
 * @param outletCode Идентификатор пункта самовывоза, присвоенный магазином.
 * @param outletStorageLimitDate Формат даты: `ДД-ММ-ГГГГ`. 
 * @param dispatchType 
 * @param tracks Информация для отслеживания перемещений посылки.
 * @param shipments Информация о посылках.
 * @param estimated Приблизительная ли дата доставки.
 * @param eacType 
 * @param eacCode Код подтверждения ЭАПП (для типа `MERCHANT_TO_COURIER`). 
 */
data class OrderDeliveryDTO(

    @Schema(example = "null", description = "Идентификатор доставки, присвоенный магазином.  Указывается, только если магазин передал данный идентификатор в ответе на запрос методом [POST cart](../../pushapi/reference/cart.md). ")
    @get:JsonProperty("id") val id: kotlin.String? = null,

    @field:Valid
    @Schema(example = "null", description = "")
    @get:JsonProperty("type") val type: OrderDeliveryType? = null,

    @Schema(example = "null", description = "Наименование службы доставки.")
    @get:JsonProperty("serviceName") val serviceName: kotlin.String? = null,

    @Schema(example = "null", description = "{% note warning \"\" %}  Этот параметр устарел. Стоимость доставки смотрите в параметре `deliveryTotal`.  {% endnote %}  Стоимость доставки в валюте заказа. ")
    @Deprecated(message = "")
    @get:JsonProperty("price") val price: java.math.BigDecimal? = null,

    @field:Valid
    @Schema(example = "null", description = "")
    @get:JsonProperty("deliveryPartnerType") val deliveryPartnerType: OrderDeliveryPartnerType? = null,

    @field:Valid
    @Schema(example = "null", description = "")
    @get:JsonProperty("courier") val courier: OrderCourierDTO? = null,

    @field:Valid
    @Schema(example = "null", description = "")
    @get:JsonProperty("dates") val dates: OrderDeliveryDatesDTO? = null,

    @field:Valid
    @Schema(example = "null", description = "")
    @get:JsonProperty("region") val region: RegionDTO? = null,

    @field:Valid
    @Schema(example = "null", description = "")
    @get:JsonProperty("address") val address: OrderDeliveryAddressDTO? = null,

    @field:Valid
    @Schema(example = "null", description = "")
    @get:JsonProperty("vat") val vat: OrderVatType? = null,

    @Schema(example = "null", description = "Идентификатор службы доставки.")
    @get:JsonProperty("deliveryServiceId") val deliveryServiceId: kotlin.Long? = null,

    @field:Valid
    @Schema(example = "null", description = "")
    @get:JsonProperty("liftType") val liftType: OrderLiftType? = null,

    @Schema(example = "null", description = "Стоимость подъема на этаж.")
    @get:JsonProperty("liftPrice") val liftPrice: java.math.BigDecimal? = null,

    @Schema(example = "null", description = "Идентификатор пункта самовывоза, присвоенный магазином.")
    @get:JsonProperty("outletCode") val outletCode: kotlin.String? = null,

    @Schema(example = "23-09-2022", description = "Формат даты: `ДД-ММ-ГГГГ`. ")
    @get:JsonProperty("outletStorageLimitDate") val outletStorageLimitDate: kotlin.String? = null,

    @field:Valid
    @Schema(example = "null", description = "")
    @get:JsonProperty("dispatchType") val dispatchType: OrderDeliveryDispatchType? = null,

    @field:Valid
    @Schema(example = "null", description = "Информация для отслеживания перемещений посылки.")
    @get:JsonProperty("tracks") val tracks: kotlin.collections.List<OrderTrackDTO>? = null,

    @field:Valid
    @Schema(example = "null", description = "Информация о посылках.")
    @get:JsonProperty("shipments") val shipments: kotlin.collections.List<OrderShipmentDTO>? = null,

    @Schema(example = "null", description = "Приблизительная ли дата доставки.")
    @get:JsonProperty("estimated") val estimated: kotlin.Boolean? = null,

    @field:Valid
    @Schema(example = "null", description = "")
    @get:JsonProperty("eacType") val eacType: OrderDeliveryEacType? = null,

    @Schema(example = "null", description = "Код подтверждения ЭАПП (для типа `MERCHANT_TO_COURIER`). ")
    @get:JsonProperty("eacCode") val eacCode: kotlin.String? = null
    ) {

}

