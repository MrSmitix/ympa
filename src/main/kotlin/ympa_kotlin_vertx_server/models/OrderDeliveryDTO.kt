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
package ympa_kotlin_vertx_server.models

import ympa_kotlin_vertx_server.models.OrderCourierDTO
import ympa_kotlin_vertx_server.models.OrderDeliveryAddressDTO
import ympa_kotlin_vertx_server.models.OrderDeliveryDatesDTO
import ympa_kotlin_vertx_server.models.OrderDeliveryDispatchType
import ympa_kotlin_vertx_server.models.OrderDeliveryEacType
import ympa_kotlin_vertx_server.models.OrderDeliveryPartnerType
import ympa_kotlin_vertx_server.models.OrderDeliveryType
import ympa_kotlin_vertx_server.models.OrderLiftType
import ympa_kotlin_vertx_server.models.OrderShipmentDTO
import ympa_kotlin_vertx_server.models.OrderTrackDTO
import ympa_kotlin_vertx_server.models.OrderVatType
import ympa_kotlin_vertx_server.models.RegionDTO

        
import com.google.gson.annotations.SerializedName
import com.fasterxml.jackson.annotation.JsonIgnoreProperties
import com.fasterxml.jackson.annotation.JsonInclude
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
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
data class OrderDeliveryDTO (
    /* Идентификатор доставки, присвоенный магазином.  Указывается, только если магазин передал данный идентификатор в ответе на запрос методом [POST cart](../../pushapi/reference/cart.md).  */
    val id: kotlin.String? = null,
    val type: OrderDeliveryType? = null,
    /* Наименование службы доставки. */
    val serviceName: kotlin.String? = null,
    /* {% note warning \"\" %}  Этот параметр устарел. Стоимость доставки смотрите в параметре `deliveryTotal`.  {% endnote %}  Стоимость доставки в валюте заказа.  */
    val price: java.math.BigDecimal? = null,
    val deliveryPartnerType: OrderDeliveryPartnerType? = null,
    val courier: OrderCourierDTO? = null,
    val dates: OrderDeliveryDatesDTO? = null,
    val region: RegionDTO? = null,
    val address: OrderDeliveryAddressDTO? = null,
    val vat: OrderVatType? = null,
    /* Идентификатор службы доставки. */
    val deliveryServiceId: kotlin.Long? = null,
    val liftType: OrderLiftType? = null,
    /* Стоимость подъема на этаж. */
    val liftPrice: java.math.BigDecimal? = null,
    /* Идентификатор пункта самовывоза, присвоенный магазином. */
    val outletCode: kotlin.String? = null,
    /* Формат даты: `ДД-ММ-ГГГГ`.  */
    val outletStorageLimitDate: kotlin.String? = null,
    val dispatchType: OrderDeliveryDispatchType? = null,
    /* Информация для отслеживания перемещений посылки. */
    val tracks: kotlin.Array<OrderTrackDTO>? = null,
    /* Информация о посылках. */
    val shipments: kotlin.Array<OrderShipmentDTO>? = null,
    /* Приблизительная ли дата доставки. */
    val estimated: kotlin.Boolean? = null,
    val eacType: OrderDeliveryEacType? = null,
    /* Код подтверждения ЭАПП (для типа `MERCHANT_TO_COURIER`).  */
    val eacCode: kotlin.String? = null
) {

}

