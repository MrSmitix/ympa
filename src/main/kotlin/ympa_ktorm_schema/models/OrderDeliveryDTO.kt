/**
* Партнерский API Маркета
* API Яндекс Маркета помогает продавцам автоматизировать и упростить работу с маркетплейсом.  В числе возможностей интеграции:  * управление каталогом товаров и витриной,  * обработка заказов,  * изменение настроек магазина,  * получение отчетов. 
*
* The version of the OpenAPI document: LATEST
* 
*
* NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
* https://openapi-generator.tech
* Do not edit the class manually.
*/
package ympa_ktorm_schema.models

import org.ktorm.dsl.*
import org.ktorm.schema.*
import org.ktorm.database.Database
import .*


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
object OrderDeliveryDTOs : BaseTable<OrderDeliveryDTO>("OrderDeliveryDTO") {
    val id = text("id") /* null */ /* Идентификатор доставки, присвоенный магазином.  Указывается, только если магазин передал данный идентификатор в ответе на запрос методом [POST cart](../../pushapi/reference/cart.md).  */
    val type = long("type") /* null */
    val serviceName = text("serviceName") /* null */ /* Наименование службы доставки. */
    @Deprecated(message = "This property is deprecated.")
    val price = decimal("price") /* null */ /* {% note warning \"\" %}  Этот параметр устарел. Стоимость доставки смотрите в параметре `deliveryTotal`.  {% endnote %}  Стоимость доставки в валюте заказа.  */
    val deliveryPartnerType = long("deliveryPartnerType") /* null */
    val courier = long("courier") /* null */
    val dates = long("dates") /* null */
    val region = long("region") /* null */
    val address = long("address") /* null */
    val vat = long("vat") /* null */
    val deliveryServiceId = long("deliveryServiceId") /* null */ /* Идентификатор службы доставки. */
    val liftType = long("liftType") /* null */
    val liftPrice = decimal("liftPrice") /* null */ /* Стоимость подъема на этаж. */
    val outletCode = text("outletCode") /* null */ /* Идентификатор пункта самовывоза, присвоенный магазином. */
    val outletStorageLimitDate = text("outletStorageLimitDate") /* null */ /* Формат даты: `ДД-ММ-ГГГГ`.  */
    val dispatchType = long("dispatchType") /* null */
    val estimated = boolean("estimated") /* null */ /* Приблизительная ли дата доставки. */
    val eacType = long("eacType") /* null */
    val eacCode = text("eacCode") /* null */ /* Код подтверждения ЭАПП (для типа `MERCHANT_TO_COURIER`).  */

    /**
     * Create an entity of type OrderDeliveryDTO from the model
     */
    override fun doCreateEntity(row: QueryRowSet, withReferences: Boolean) = OrderDeliveryDTO(
        id = row[id]  /* kotlin.String? */ /* Идентификатор доставки, присвоенный магазином.  Указывается, только если магазин передал данный идентификатор в ответе на запрос методом [POST cart](../../pushapi/reference/cart.md).  */,
        type = OrderDeliveryTypes.createEntity(row, withReferences) /* OrderDeliveryType? */,
        serviceName = row[serviceName]  /* kotlin.String? */ /* Наименование службы доставки. */,
        price = row[price]  /* java.math.BigDecimal? */ /* {% note warning \"\" %}  Этот параметр устарел. Стоимость доставки смотрите в параметре `deliveryTotal`.  {% endnote %}  Стоимость доставки в валюте заказа.  */,
        deliveryPartnerType = OrderDeliveryPartnerTypes.createEntity(row, withReferences) /* OrderDeliveryPartnerType? */,
        courier = OrderCourierDTOs.createEntity(row, withReferences) /* OrderCourierDTO? */,
        dates = OrderDeliveryDatesDTOs.createEntity(row, withReferences) /* OrderDeliveryDatesDTO? */,
        region = RegionDTOs.createEntity(row, withReferences) /* RegionDTO? */,
        address = OrderDeliveryAddressDTOs.createEntity(row, withReferences) /* OrderDeliveryAddressDTO? */,
        vat = OrderVatTypes.createEntity(row, withReferences) /* OrderVatType? */,
        deliveryServiceId = row[deliveryServiceId]  /* kotlin.Long? */ /* Идентификатор службы доставки. */,
        liftType = OrderLiftTypes.createEntity(row, withReferences) /* OrderLiftType? */,
        liftPrice = row[liftPrice]  /* java.math.BigDecimal? */ /* Стоимость подъема на этаж. */,
        outletCode = row[outletCode]  /* kotlin.String? */ /* Идентификатор пункта самовывоза, присвоенный магазином. */,
        outletStorageLimitDate = row[outletStorageLimitDate]  /* kotlin.String? */ /* Формат даты: `ДД-ММ-ГГГГ`.  */,
        dispatchType = OrderDeliveryDispatchTypes.createEntity(row, withReferences) /* OrderDeliveryDispatchType? */,
        tracks = emptyList() /* kotlin.Array<OrderTrackDTO>? */ /* Информация для отслеживания перемещений посылки. */,
        shipments = emptyList() /* kotlin.Array<OrderShipmentDTO>? */ /* Информация о посылках. */,
        estimated = row[estimated]  /* kotlin.Boolean? */ /* Приблизительная ли дата доставки. */,
        eacType = OrderDeliveryEacTypes.createEntity(row, withReferences) /* OrderDeliveryEacType? */,
        eacCode = row[eacCode]  /* kotlin.String? */ /* Код подтверждения ЭАПП (для типа `MERCHANT_TO_COURIER`).  */
    )

    /**
    * Assign all the columns from the entity of type OrderDeliveryDTO to the DML expression.
    *
    * Usage:
    *
    * ```kotlin
    * let entity = OrderDeliveryDTO()
    * database.update(OrderDeliveryDTOs, {
    *     assignFrom(entity)
    * })
    * ```
    * @return the builder with the columns for the update or insert.
    */
    fun AssignmentsBuilder.assignFrom(entity: OrderDeliveryDTO) {
        this.apply {
            set(OrderDeliveryDTOs.id, entity.id)
            set(OrderDeliveryDTOs.type, entity.type)
            set(OrderDeliveryDTOs.serviceName, entity.serviceName)
            set(OrderDeliveryDTOs.price, entity.price)
            set(OrderDeliveryDTOs.deliveryPartnerType, entity.deliveryPartnerType)
            set(OrderDeliveryDTOs.courier, entity.courier)
            set(OrderDeliveryDTOs.dates, entity.dates)
            set(OrderDeliveryDTOs.region, entity.region)
            set(OrderDeliveryDTOs.address, entity.address)
            set(OrderDeliveryDTOs.vat, entity.vat)
            set(OrderDeliveryDTOs.deliveryServiceId, entity.deliveryServiceId)
            set(OrderDeliveryDTOs.liftType, entity.liftType)
            set(OrderDeliveryDTOs.liftPrice, entity.liftPrice)
            set(OrderDeliveryDTOs.outletCode, entity.outletCode)
            set(OrderDeliveryDTOs.outletStorageLimitDate, entity.outletStorageLimitDate)
            set(OrderDeliveryDTOs.dispatchType, entity.dispatchType)
            set(OrderDeliveryDTOs.estimated, entity.estimated)
            set(OrderDeliveryDTOs.eacType, entity.eacType)
            set(OrderDeliveryDTOs.eacCode, entity.eacCode)
        }
    }

}


object OrderDeliveryDTOOrderTrackDTO : BaseTable<Pair<kotlin.Long, kotlin.Long>>("OrderDeliveryDTOOrderTrackDTO") {
    val orderDeliveryDTO = long("orderDeliveryDTO")
    val orderTrackDTO = long("orderTrackDTO")

    override fun doCreateEntity(row: QueryRowSet, withReferences: Boolean): Pair<kotlin.Long, kotlin.Long> =
        Pair(row[orderDeliveryDTO] ?: 0, row[orderTrackDTO] ?: 0)

    fun AssignmentsBuilder.assignFrom(entity: Pair<kotlin.Long, kotlin.Long>) {
        this.apply {
            set(OrderDeliveryDTOOrderTrackDTO.orderDeliveryDTO, entity.first)
            set(OrderDeliveryDTOOrderTrackDTO.orderTrackDTO, entity.second)
        }
    }

}

object OrderDeliveryDTOOrderShipmentDTO : BaseTable<Pair<kotlin.Long, kotlin.Long>>("OrderDeliveryDTOOrderShipmentDTO") {
    val orderDeliveryDTO = long("orderDeliveryDTO")
    val orderShipmentDTO = long("orderShipmentDTO")

    override fun doCreateEntity(row: QueryRowSet, withReferences: Boolean): Pair<kotlin.Long, kotlin.Long> =
        Pair(row[orderDeliveryDTO] ?: 0, row[orderShipmentDTO] ?: 0)

    fun AssignmentsBuilder.assignFrom(entity: Pair<kotlin.Long, kotlin.Long>) {
        this.apply {
            set(OrderDeliveryDTOOrderShipmentDTO.orderDeliveryDTO, entity.first)
            set(OrderDeliveryDTOOrderShipmentDTO.orderShipmentDTO, entity.second)
        }
    }

}

