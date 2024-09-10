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

import ympa_kotlin_vertx_server.models.GoodsFeedbackCommentAuthorDTO
import ympa_kotlin_vertx_server.models.GoodsFeedbackCommentStatusType

        
import com.google.gson.annotations.SerializedName
import com.fasterxml.jackson.annotation.JsonIgnoreProperties
import com.fasterxml.jackson.annotation.JsonInclude
/**
 * Комментарий к отзыву.
 * @param id Идентификатор комментария к отзыву. 
 * @param text Текст комментария.
 * @param author 
 * @param status 
 * @param canModify Может ли продавец изменять комментарий или удалять его.
 * @param parentId Идентификатор комментария к отзыву. 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
data class GoodsFeedbackCommentDTO (
    /* Идентификатор комментария к отзыву.  */
    @SerializedName("id") private val _id: kotlin.Long?,
    /* Текст комментария. */
    @SerializedName("text") private val _text: kotlin.String?,
    @SerializedName("author") private val _author: GoodsFeedbackCommentAuthorDTO?,
    @SerializedName("status") private val _status: GoodsFeedbackCommentStatusType?,
    /* Может ли продавец изменять комментарий или удалять его. */
    val canModify: kotlin.Boolean? = null,
    /* Идентификатор комментария к отзыву.  */
    val parentId: kotlin.Long? = null
) {

        val id get() = _id ?: throw IllegalArgumentException("id is required")
                    
        val text get() = _text ?: throw IllegalArgumentException("text is required")
                    
        val author get() = _author ?: throw IllegalArgumentException("author is required")
                    
        val status get() = _status ?: throw IllegalArgumentException("status is required")
                    
}

