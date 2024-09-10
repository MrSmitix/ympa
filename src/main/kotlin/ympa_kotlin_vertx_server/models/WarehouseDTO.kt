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

import ympa_kotlin_vertx_server.models.WarehouseAddressDTO

        
import com.google.gson.annotations.SerializedName
import com.fasterxml.jackson.annotation.JsonIgnoreProperties
import com.fasterxml.jackson.annotation.JsonInclude
/**
 * Информация о складе.
 * @param id Идентификатор склада.
 * @param name Название склада.
 * @param campaignId Идентификатор кампании в API и идентификатор магазина.
 * @param express Возможна ли доставка по модели Экспресс.
 * @param address 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
data class WarehouseDTO (
    /* Идентификатор склада. */
    @SerializedName("id") private val _id: kotlin.Long?,
    /* Название склада. */
    @SerializedName("name") private val _name: kotlin.String?,
    /* Идентификатор кампании в API и идентификатор магазина. */
    @SerializedName("campaignId") private val _campaignId: kotlin.Long?,
    /* Возможна ли доставка по модели Экспресс. */
    @SerializedName("express") private val _express: kotlin.Boolean?,
    val address: WarehouseAddressDTO? = null
) {

        val id get() = _id ?: throw IllegalArgumentException("id is required")
                    
        val name get() = _name ?: throw IllegalArgumentException("name is required")
                    
        val campaignId get() = _campaignId ?: throw IllegalArgumentException("campaignId is required")
                    
        val express get() = _express ?: throw IllegalArgumentException("express is required")
                    
}

