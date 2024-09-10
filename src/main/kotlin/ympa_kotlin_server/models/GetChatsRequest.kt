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

import ympa_kotlin_server.models.ChatStatusType
import ympa_kotlin_server.models.ChatType

/**
 * Фильтры по чатам, которые нужно вернуть. 
 * @param orderIds Фильтр по идентификаторам заказов на Маркете.
 * @param types Фильтр по типам чатов.
 * @param statuses Фильтр по статусам чатов.
 */
data class GetChatsRequest(
    /* Фильтр по идентификаторам заказов на Маркете. */
    val orderIds: kotlin.collections.List<kotlin.Long>? = null,
    /* Фильтр по типам чатов. */
    val types: kotlin.collections.List<ChatType>? = null,
    /* Фильтр по статусам чатов. */
    val statuses: kotlin.collections.List<ChatStatusType>? = null
) 

