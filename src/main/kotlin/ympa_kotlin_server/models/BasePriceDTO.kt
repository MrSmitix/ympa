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

import ympa_kotlin_server.models.CurrencyType

/**
 * Цена на товар.
 * @param `value` Значение.
 * @param currencyId 
 */
data class BasePriceDTO(
    /* Значение. */
    val `value`: java.math.BigDecimal,
    val currencyId: CurrencyType
) 

