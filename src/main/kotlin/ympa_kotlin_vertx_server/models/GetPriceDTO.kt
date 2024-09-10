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

import ympa_kotlin_vertx_server.models.CurrencyType

        
import com.google.gson.annotations.SerializedName
import com.fasterxml.jackson.annotation.JsonIgnoreProperties
import com.fasterxml.jackson.annotation.JsonInclude
/**
 * Цена с указанием времени последнего обновления.
 * @param &#x60;value&#x60; Значение.
 * @param currencyId 
 * @param updatedAt Время последнего обновления.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
data class GetPriceDTO (
    /* Значение. */
    @SerializedName("`value`") private val _`value`: java.math.BigDecimal?,
    @SerializedName("currencyId") private val _currencyId: CurrencyType?,
    /* Время последнего обновления. */
    @SerializedName("updatedAt") private val _updatedAt: java.time.OffsetDateTime?
) {

        val `value` get() = _`value` ?: throw IllegalArgumentException("`value` is required")
                    
        val currencyId get() = _currencyId ?: throw IllegalArgumentException("currencyId is required")
                    
        val updatedAt get() = _updatedAt ?: throw IllegalArgumentException("updatedAt is required")
                    
}

