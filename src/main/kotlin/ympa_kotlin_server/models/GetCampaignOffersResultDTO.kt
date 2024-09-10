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

import ympa_kotlin_server.models.GetCampaignOfferDTO
import ympa_kotlin_server.models.ScrollingPagerDTO

/**
 * Список товаров в заданном магазине.
 * @param offers Страница списка товаров.
 * @param paging 
 */
data class GetCampaignOffersResultDTO(
    /* Страница списка товаров. */
    val offers: kotlin.collections.List<GetCampaignOfferDTO>,
    val paging: ScrollingPagerDTO? = null
) 

