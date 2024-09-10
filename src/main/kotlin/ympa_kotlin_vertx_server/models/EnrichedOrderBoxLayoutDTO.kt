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

import ympa_kotlin_vertx_server.models.OrderBoxLayoutItemDTO

        
import com.google.gson.annotations.SerializedName
import com.fasterxml.jackson.annotation.JsonIgnoreProperties
import com.fasterxml.jackson.annotation.JsonInclude
/**
 * Информация о коробке.
 * @param items Список товаров в коробке.  Если в коробке едет часть большого товара, в списке может быть только один пункт. 
 * @param boxId Идентификатор коробки.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
data class EnrichedOrderBoxLayoutDTO (
    /* Список товаров в коробке.  Если в коробке едет часть большого товара, в списке может быть только один пункт.  */
    @SerializedName("items") private val _items: kotlin.Array<OrderBoxLayoutItemDTO>?,
    /* Идентификатор коробки. */
    val boxId: kotlin.Long? = null
) {

        val items get() = _items ?: throw IllegalArgumentException("items is required")
                    
}

