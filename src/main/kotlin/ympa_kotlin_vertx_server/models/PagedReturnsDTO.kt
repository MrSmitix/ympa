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

import ympa_kotlin_vertx_server.models.ForwardScrollingPagerDTO
import ympa_kotlin_vertx_server.models.ReturnDTO

        
import com.google.gson.annotations.SerializedName
import com.fasterxml.jackson.annotation.JsonIgnoreProperties
import com.fasterxml.jackson.annotation.JsonInclude
/**
 * Возвраты.
 * @param returns Список возвратов.
 * @param paging 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
data class PagedReturnsDTO (
    /* Список возвратов. */
    @SerializedName("returns") private val _returns: kotlin.Array<ReturnDTO>?,
    val paging: ForwardScrollingPagerDTO? = null
) {

        val returns get() = _returns ?: throw IllegalArgumentException("returns is required")
                    
}

