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
 * Значение ограничивающей характеристики и список допустимых значений ограничиваемой характеристики.
 * @param limitingOptionValueId Идентификатор значения ограничивающей характеристики.
 * @param optionValueIds Идентификаторы допустимых значений ограничиваемой характеристики. 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
data class OptionValuesLimitedDTO (
    /* Идентификатор значения ограничивающей характеристики. */
    @SerializedName("limitingOptionValueId") private val _limitingOptionValueId: kotlin.Long?,
    /* Идентификаторы допустимых значений ограничиваемой характеристики.  */
    @SerializedName("optionValueIds") private val _optionValueIds: kotlin.Array<kotlin.Long>?
) {

        val limitingOptionValueId get() = _limitingOptionValueId ?: throw IllegalArgumentException("limitingOptionValueId is required")
                    
        val optionValueIds get() = _optionValueIds ?: throw IllegalArgumentException("optionValueIds is required")
                    
}

