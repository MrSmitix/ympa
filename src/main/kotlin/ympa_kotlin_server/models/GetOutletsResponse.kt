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

import ympa_kotlin_server.models.FlippingPagerDTO
import ympa_kotlin_server.models.FullOutletDTO
import ympa_kotlin_server.models.ScrollingPagerDTO

/**
 * Ответ на запрос информации о точках продаж.
 * @param outlets Информация о точках продаж.
 * @param paging 
 * @param pager 
 */
data class GetOutletsResponse(
    /* Информация о точках продаж. */
    val outlets: kotlin.collections.List<FullOutletDTO>,
    val paging: ScrollingPagerDTO? = null,
    val pager: FlippingPagerDTO? = null
) 

