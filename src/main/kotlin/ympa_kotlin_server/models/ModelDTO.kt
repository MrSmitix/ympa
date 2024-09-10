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

import ympa_kotlin_server.models.ModelPriceDTO

/**
 * Модель товара.
 * @param id Идентификатор модели товара.
 * @param name Название модели товара.
 * @param prices 
 */
data class ModelDTO(
    /* Идентификатор модели товара. */
    val id: kotlin.Long? = null,
    /* Название модели товара. */
    val name: kotlin.String? = null,
    val prices: ModelPriceDTO? = null
) 

