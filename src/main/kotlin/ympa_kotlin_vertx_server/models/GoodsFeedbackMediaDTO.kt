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
 * Фото и видео.
 * @param photos Ссылки на фото.
 * @param videos Ссылки на видео.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
data class GoodsFeedbackMediaDTO (
    /* Ссылки на фото. */
    val photos: kotlin.Array<kotlin.String>? = null,
    /* Ссылки на видео. */
    val videos: kotlin.Array<kotlin.String>? = null
) {

}

