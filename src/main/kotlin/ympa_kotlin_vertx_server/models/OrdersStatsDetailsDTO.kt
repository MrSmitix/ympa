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
package ympa_kotlin_vertx_server.models

import ympa_kotlin_vertx_server.models.OrdersStatsItemStatusType
import ympa_kotlin_vertx_server.models.OrdersStatsStockType

        
import com.google.gson.annotations.SerializedName
import com.fasterxml.jackson.annotation.JsonIgnoreProperties
import com.fasterxml.jackson.annotation.JsonInclude
/**
 * Информация об удалении товара из заказа.
 * @param itemStatus 
 * @param itemCount Количество товара со статусом, указанном в параметре `itemStatus`.
 * @param updateDate Дата, когда товар получил статус, указанный в параметре `itemStatus`.  Формат даты: `ГГГГ-ММ-ДД`. 
 * @param stockType 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
data class OrdersStatsDetailsDTO (
    val itemStatus: OrdersStatsItemStatusType? = null,
    /* Количество товара со статусом, указанном в параметре `itemStatus`. */
    val itemCount: kotlin.Long? = null,
    /* Дата, когда товар получил статус, указанный в параметре `itemStatus`.  Формат даты: `ГГГГ-ММ-ДД`.  */
    val updateDate: java.time.LocalDate? = null,
    val stockType: OrdersStatsStockType? = null
) {

}

