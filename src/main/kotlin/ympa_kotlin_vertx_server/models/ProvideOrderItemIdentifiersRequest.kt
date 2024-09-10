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

import ympa_kotlin_vertx_server.models.OrderItemInstanceModificationDTO

        
import com.google.gson.annotations.SerializedName
import com.fasterxml.jackson.annotation.JsonIgnoreProperties
import com.fasterxml.jackson.annotation.JsonInclude
/**
 * 
 * @param items Список позиций, требующих маркировки. 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
data class ProvideOrderItemIdentifiersRequest (
    /* Список позиций, требующих маркировки.  */
    @SerializedName("items") private val _items: kotlin.Array<OrderItemInstanceModificationDTO>?
) {

        val items get() = _items ?: throw IllegalArgumentException("items is required")
                    
}

