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


import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

/**
 * Информация о ярлыке для коробки.
 *
 * @param url Соответствует URL, по которому выполняется запрос [GET campaigns/{campaignId}/orders/{orderId}/delivery/shipments/{shipmentId}/boxes/{boxId}/label](../../reference/orders/generateOrderLabel.md). 
 * @param supplierName Юридическое название магазина.
 * @param deliveryServiceName Юридическое название службы доставки.
 * @param orderId Идентификатор заказа в системе Маркета.
 * @param orderNum Идентификатор заказа в информационной системе магазина.  Совпадает с `orderId`, если Маркету неизвестен номер заказа в системе магазина. 
 * @param recipientName Фамилия и инициалы получателя заказа.
 * @param boxId Идентификатор коробки.
 * @param fulfilmentId Идентификатор коробки в информационной системе магазина.  Возвращается в формате: `номер заказа на Маркете-номер коробки`. Например, `7206821‑1`, `7206821‑2` и т. д. 
 * @param place Номер коробки в заказе. Возвращается в формате: `номер места/общее количество мест`. 
 * @param weight {% note warning \"\" %}  Этот параметр устарел. Не используйте его.  {% endnote %}  Общая масса всех товаров в заказе. Возвращается в формате: `weight кг`. 
 * @param deliveryServiceId Идентификатор службы доставки. Информацию о службе доставки можно получить с помощью запроса [GET delivery/services](../../reference/orders/getDeliveryServices.md).
 * @param deliveryAddress Адрес получателя.
 * @param shipmentDate Дата отгрузки в формате `dd.MM.yyyy`.
 */


data class ParcelBoxLabelDTO (

    /* Соответствует URL, по которому выполняется запрос [GET campaigns/{campaignId}/orders/{orderId}/delivery/shipments/{shipmentId}/boxes/{boxId}/label](../../reference/orders/generateOrderLabel.md).  */
    @Json(name = "url")
    val url: kotlin.String,

    /* Юридическое название магазина. */
    @Json(name = "supplierName")
    val supplierName: kotlin.String,

    /* Юридическое название службы доставки. */
    @Json(name = "deliveryServiceName")
    val deliveryServiceName: kotlin.String,

    /* Идентификатор заказа в системе Маркета. */
    @Json(name = "orderId")
    val orderId: kotlin.Long,

    /* Идентификатор заказа в информационной системе магазина.  Совпадает с `orderId`, если Маркету неизвестен номер заказа в системе магазина.  */
    @Json(name = "orderNum")
    val orderNum: kotlin.String,

    /* Фамилия и инициалы получателя заказа. */
    @Json(name = "recipientName")
    val recipientName: kotlin.String,

    /* Идентификатор коробки. */
    @Json(name = "boxId")
    val boxId: kotlin.Long,

    /* Идентификатор коробки в информационной системе магазина.  Возвращается в формате: `номер заказа на Маркете-номер коробки`. Например, `7206821‑1`, `7206821‑2` и т. д.  */
    @Json(name = "fulfilmentId")
    val fulfilmentId: kotlin.String,

    /* Номер коробки в заказе. Возвращается в формате: `номер места/общее количество мест`.  */
    @Json(name = "place")
    val place: kotlin.String,

    /* {% note warning \"\" %}  Этот параметр устарел. Не используйте его.  {% endnote %}  Общая масса всех товаров в заказе. Возвращается в формате: `weight кг`.  */
    @Json(name = "weight")
    val weight: kotlin.String,

    /* Идентификатор службы доставки. Информацию о службе доставки можно получить с помощью запроса [GET delivery/services](../../reference/orders/getDeliveryServices.md). */
    @Json(name = "deliveryServiceId")
    val deliveryServiceId: kotlin.String,

    /* Адрес получателя. */
    @Json(name = "deliveryAddress")
    val deliveryAddress: kotlin.String? = null,

    /* Дата отгрузки в формате `dd.MM.yyyy`. */
    @Json(name = "shipmentDate")
    val shipmentDate: kotlin.String? = null

) {


}

