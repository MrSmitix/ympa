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
 * Настройки кабинета.
 * @param onlyDefaultPrice Можно ли установить только [базовую цену](*rule): * `false` — можно задать и базовую цену, и цены в конкретных магазинах. * `true` — можно задать только базовую цену. 
 * @param currency 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
data class BusinessSettingsDTO (
    /* Можно ли установить только [базовую цену](*rule): * `false` — можно задать и базовую цену, и цены в конкретных магазинах. * `true` — можно задать только базовую цену.  */
    val onlyDefaultPrice: kotlin.Boolean? = null,
    val currency: CurrencyType? = null
) {

}

