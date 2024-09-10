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
 * Ограничения на значения характеристик.
 * @param minValue Минимальное число.
 * @param maxValue Максимальное число.
 * @param maxLength Максимальная длина текста.
 */
data class ParameterValueConstraintsDTO(
    /* Минимальное число. */
    val minValue: kotlin.Double? = null,
    /* Максимальное число. */
    val maxValue: kotlin.Double? = null,
    /* Максимальная длина текста. */
    val maxLength: kotlin.Int? = null
) 

