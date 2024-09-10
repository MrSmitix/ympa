/**
 *
 * Please note:
 * This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * Do not edit this file manually.
 *
 */

@file:Suppress(
    "ArrayInDataClass",
    "EnumEntryName",
    "RemoveRedundantQualifierName",
    "UnusedImport"
)

package ympa_kotlin_client.models

import ympa_kotlin_client.models.OrderStatsStatusType
import ympa_kotlin_client.models.OrdersStatsCommissionDTO
import ympa_kotlin_client.models.OrdersStatsDeliveryRegionDTO
import ympa_kotlin_client.models.OrdersStatsItemDTO
import ympa_kotlin_client.models.OrdersStatsOrderPaymentType
import ympa_kotlin_client.models.OrdersStatsPaymentDTO

import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

/**
 * Информация о заказе.
 *
 * @param items Список товаров в заказе после возможных изменений.
 * @param payments Информация о денежных переводах по заказу.
 * @param commissions Информация о комиссиях за заказ.
 * @param id Идентификатор заказа.
 * @param creationDate Дата создания заказа.  Формат даты: `ГГГГ-ММ-ДД`. 
 * @param statusUpdateDate Дата и время, когда статус заказа был изменен в последний раз.  Формат даты и времени: ISO 8601. Например, `2017-11-21T00:00:00`. Часовой пояс — UTC+03:00 (Москва). 
 * @param status 
 * @param partnerOrderId Идентификатор заказа в информационной системе магазина.
 * @param paymentType 
 * @param fake Тип заказа:  * `false` — настоящий заказ покупателя.  * `true` — [тестовый](../../pushapi/concepts/sandbox.md) заказ Маркета. 
 * @param deliveryRegion 
 * @param initialItems Список товаров в заказе до изменений.
 */


data class OrdersStatsOrderDTO (

    /* Список товаров в заказе после возможных изменений. */
    @Json(name = "items")
    val items: kotlin.collections.List<OrdersStatsItemDTO>,

    /* Информация о денежных переводах по заказу. */
    @Json(name = "payments")
    val payments: kotlin.collections.List<OrdersStatsPaymentDTO>,

    /* Информация о комиссиях за заказ. */
    @Json(name = "commissions")
    val commissions: kotlin.collections.List<OrdersStatsCommissionDTO>,

    /* Идентификатор заказа. */
    @Json(name = "id")
    val id: kotlin.Long? = null,

    /* Дата создания заказа.  Формат даты: `ГГГГ-ММ-ДД`.  */
    @Json(name = "creationDate")
    val creationDate: java.time.LocalDate? = null,

    /* Дата и время, когда статус заказа был изменен в последний раз.  Формат даты и времени: ISO 8601. Например, `2017-11-21T00:00:00`. Часовой пояс — UTC+03:00 (Москва).  */
    @Json(name = "statusUpdateDate")
    val statusUpdateDate: java.time.OffsetDateTime? = null,

    @Json(name = "status")
    val status: OrderStatsStatusType? = null,

    /* Идентификатор заказа в информационной системе магазина. */
    @Json(name = "partnerOrderId")
    val partnerOrderId: kotlin.String? = null,

    @Json(name = "paymentType")
    val paymentType: OrdersStatsOrderPaymentType? = null,

    /* Тип заказа:  * `false` — настоящий заказ покупателя.  * `true` — [тестовый](../../pushapi/concepts/sandbox.md) заказ Маркета.  */
    @Json(name = "fake")
    val fake: kotlin.Boolean? = null,

    @Json(name = "deliveryRegion")
    val deliveryRegion: OrdersStatsDeliveryRegionDTO? = null,

    /* Список товаров в заказе до изменений. */
    @Json(name = "initialItems")
    val initialItems: kotlin.collections.List<OrdersStatsItemDTO>? = null

) {


}

