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

import ympa_kotlin_server.models.GetMappingDTO
import ympa_kotlin_server.models.SuggestedOfferDTO

/**
 * Товар с соответствующей карточкой на Маркете.
 * @param offer 
 * @param mapping 
 */
data class SuggestedOfferMappingDTO(
    val offer: SuggestedOfferDTO? = null,
    val mapping: GetMappingDTO? = null
) 

