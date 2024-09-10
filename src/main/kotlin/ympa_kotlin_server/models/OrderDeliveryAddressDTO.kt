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
package ympa_kotlin_server.models

import ympa_kotlin_server.models.GpsDTO

/**
 * Адрес доставки.  Указывается, если `type=DELIVERY`, `type=POST` или `type=PICKUP` (адрес пункта выдачи). 
 * @param country Страна.  Обязательный параметр. 
 * @param postcode Почтовый индекс.  Указывается, если выбрана доставка почтой (`delivery type=POST`). 
 * @param city Город или населенный пункт.  Обязательный параметр. 
 * @param district Район.
 * @param subway Станция метро.
 * @param street Улица.  Обязательный параметр. 
 * @param house Дом или владение.  Обязательный параметр. 
 * @param block Корпус или строение.
 * @param entrance Подъезд.
 * @param entryphone Код домофона.
 * @param floor Этаж.
 * @param apartment Квартира или офис.
 * @param phone Телефон получателя заказа.  Обязательный параметр. 
 * @param recipient Фамилия, имя и отчество получателя заказа.  Обязательный параметр. 
 * @param gps 
 */
data class OrderDeliveryAddressDTO(
    /* Страна.  Обязательный параметр.  */
    val country: kotlin.String? = null,
    /* Почтовый индекс.  Указывается, если выбрана доставка почтой (`delivery type=POST`).  */
    val postcode: kotlin.String? = null,
    /* Город или населенный пункт.  Обязательный параметр.  */
    val city: kotlin.String? = null,
    /* Район. */
    val district: kotlin.String? = null,
    /* Станция метро. */
    val subway: kotlin.String? = null,
    /* Улица.  Обязательный параметр.  */
    val street: kotlin.String? = null,
    /* Дом или владение.  Обязательный параметр.  */
    val house: kotlin.String? = null,
    /* Корпус или строение. */
    val block: kotlin.String? = null,
    /* Подъезд. */
    val entrance: kotlin.String? = null,
    /* Код домофона. */
    val entryphone: kotlin.String? = null,
    /* Этаж. */
    val floor: kotlin.String? = null,
    /* Квартира или офис. */
    val apartment: kotlin.String? = null,
    /* Телефон получателя заказа.  Обязательный параметр.  */
    val phone: kotlin.String? = null,
    /* Фамилия, имя и отчество получателя заказа.  Обязательный параметр.  */
    val recipient: kotlin.String? = null,
    val gps: GpsDTO? = null
) 

