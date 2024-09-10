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

import ympa_kotlin_server.models.ForwardScrollingPagerDTO
import ympa_kotlin_server.models.SkuBidItemDTO

/**
 * Список товаров с указанными ставками.
 * @param bids Страница списка товаров.
 * @param paging 
 */
data class GetBidsInfoResponseDTO(
    /* Страница списка товаров. */
    val bids: kotlin.collections.List<SkuBidItemDTO>,
    val paging: ForwardScrollingPagerDTO? = null
) 

