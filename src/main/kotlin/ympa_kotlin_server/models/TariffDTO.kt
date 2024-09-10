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

import ympa_kotlin_server.models.TariffParameterDTO
import ympa_kotlin_server.models.TariffType

/**
 * Информация о тарифах, по которым нужно заплатить за услуги Маркета.
 * @param type 
 * @param amount Значение тарифа в рублях.
 * @param parameters Параметры расчета тарифа.
 * @param percent {% note warning \"\" %}  Этот параметр устарел. Не используйте его.  {% endnote %}  Значение тарифа в процентах. 
 */
data class TariffDTO(
    val type: TariffType,
    /* Значение тарифа в рублях. */
    val amount: java.math.BigDecimal,
    /* Параметры расчета тарифа. */
    val parameters: kotlin.collections.List<TariffParameterDTO>,
    /* {% note warning \"\" %}  Этот параметр устарел. Не используйте его.  {% endnote %}  Значение тарифа в процентах.  */
    val percent: java.math.BigDecimal? = null
) 

