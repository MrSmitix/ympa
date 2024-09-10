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
 * Информация о текущей карточке товара на Маркете.
 * @param marketSku SKU на Маркете.
 * @param modelId Идентификатор модели для текущей карточки товара на Маркете.  Например, две лопатки разных цветов имеют разные SKU на Маркете (параметр `marketSku`), но одинаковый идентификатор модели товара. 
 * @param categoryId Идентификатор категории для текущей карточки товара на Маркете.
 */
data class OfferMappingDTO(
    /* SKU на Маркете. */
    val marketSku: kotlin.Long? = null,
    /* Идентификатор модели для текущей карточки товара на Маркете.  Например, две лопатки разных цветов имеют разные SKU на Маркете (параметр `marketSku`), но одинаковый идентификатор модели товара.  */
    val modelId: kotlin.Long? = null,
    /* Идентификатор категории для текущей карточки товара на Маркете. */
    val categoryId: kotlin.Long? = null
) 

