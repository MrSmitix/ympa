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


/**
 * Информация о предложении.
 * @param discount Скидка на предложение в процентах.
 * @param name Наименование предложения.
 * @param pos Позиция предложения в выдаче Маркета на карточке модели.
 * @param preDiscountPrice Цена предложения без скидки магазина.
 * @param price Цена предложения без скидки, которую получает покупатель при оплате через Yandex Pay.
 * @param regionId Идентификатор региона предложения (регион, откуда доставляется товар).  Сначала показываются предложения, доставляемые из региона, указанного в запросе в параметре `regionId`. Предложения, доставляемые из других регионов, показываются после них. 
 * @param shippingCost Стоимость доставки товара в регион:  * `0` — доставка осуществляется бесплатно. * `-1` — магазин не осуществляет доставку этого товара (самовывоз).  Если стоимость доставки неизвестна, параметр не выводится. 
 * @param shopName Название магазина (в том виде, в котором отображается на Маркете).
 * @param shopRating Рейтинг магазина.  Возможные значения: * `-1` — у магазинов, недавно появившихся на Маркете, рейтинг появляется не сразу. До момента появления рейтинга для таких магазинов возвращается значение `-1`. * `1`. * `2`. * `3`. * `4`. * `5`. 
 * @param inStock {% note warning \"\" %}  Этот параметр устарел. Не используйте его.  {% endnote %} 
 */
data class ModelOfferDTO(
    /* Скидка на предложение в процентах. */
    val discount: kotlin.Int? = null,
    /* Наименование предложения. */
    val name: kotlin.String? = null,
    /* Позиция предложения в выдаче Маркета на карточке модели. */
    val pos: kotlin.Int? = null,
    /* Цена предложения без скидки магазина. */
    val preDiscountPrice: java.math.BigDecimal? = null,
    /* Цена предложения без скидки, которую получает покупатель при оплате через Yandex Pay. */
    val price: java.math.BigDecimal? = null,
    /* Идентификатор региона предложения (регион, откуда доставляется товар).  Сначала показываются предложения, доставляемые из региона, указанного в запросе в параметре `regionId`. Предложения, доставляемые из других регионов, показываются после них.  */
    val regionId: kotlin.Long? = null,
    /* Стоимость доставки товара в регион:  * `0` — доставка осуществляется бесплатно. * `-1` — магазин не осуществляет доставку этого товара (самовывоз).  Если стоимость доставки неизвестна, параметр не выводится.  */
    val shippingCost: java.math.BigDecimal? = null,
    /* Название магазина (в том виде, в котором отображается на Маркете). */
    val shopName: kotlin.String? = null,
    /* Рейтинг магазина.  Возможные значения: * `-1` — у магазинов, недавно появившихся на Маркете, рейтинг появляется не сразу. До момента появления рейтинга для таких магазинов возвращается значение `-1`. * `1`. * `2`. * `3`. * `4`. * `5`.  */
    val shopRating: kotlin.Int? = null,
    /* {% note warning \"\" %}  Этот параметр устарел. Не используйте его.  {% endnote %}  */
    val inStock: kotlin.Int? = null
) 

