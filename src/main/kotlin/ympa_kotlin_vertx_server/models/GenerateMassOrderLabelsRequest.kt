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


        
import com.google.gson.annotations.SerializedName
import com.fasterxml.jackson.annotation.JsonIgnoreProperties
import com.fasterxml.jackson.annotation.JsonInclude
/**
 * Данные, необходимые для генерации файла. 
 * @param businessId Идентификатор кабинета.
 * @param orderIds Список идентификаторов заказов.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
data class GenerateMassOrderLabelsRequest (
    /* Идентификатор кабинета. */
    @SerializedName("businessId") private val _businessId: kotlin.Long?,
    /* Список идентификаторов заказов. */
    @SerializedName("orderIds") private val _orderIds: kotlin.collections.Set<kotlin.Long>?
) {

        val businessId get() = _businessId ?: throw IllegalArgumentException("businessId is required")
                    
        val orderIds get() = _orderIds ?: throw IllegalArgumentException("orderIds is required")
                    
}

