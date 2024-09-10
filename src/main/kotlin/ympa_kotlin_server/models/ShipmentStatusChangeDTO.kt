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

import ympa_kotlin_server.models.ShipmentStatusType

/**
 * Статус отгрузки.
 * @param status 
 * @param description Описание статуса отгрузки.
 * @param updateTime Время последнего изменения статуса отгрузки.
 */
data class ShipmentStatusChangeDTO(
    val status: ShipmentStatusType? = null,
    /* Описание статуса отгрузки. */
    val description: kotlin.String? = null,
    /* Время последнего изменения статуса отгрузки. */
    val updateTime: java.time.OffsetDateTime? = null
) 

