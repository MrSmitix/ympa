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

import ympa_kotlin_vertx_server.models.ChatStatusType
import ympa_kotlin_vertx_server.models.ChatType

        
import com.google.gson.annotations.SerializedName
import com.fasterxml.jackson.annotation.JsonIgnoreProperties
import com.fasterxml.jackson.annotation.JsonInclude
/**
 * Информация о чатах.
 * @param chatId Идентификатор чата.
 * @param orderId Идентификатор заказа.
 * @param type 
 * @param status 
 * @param createdAt Дата и время создания чата.  Формат даты: ISO 8601 со смещением относительно UTC. Например, `2017-11-21T00:00:00+03:00`. 
 * @param updatedAt Дата и время последнего сообщения в чате.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
data class GetChatInfoDTO (
    /* Идентификатор чата. */
    @SerializedName("chatId") private val _chatId: kotlin.Long?,
    /* Идентификатор заказа. */
    @SerializedName("orderId") private val _orderId: kotlin.Long?,
    @SerializedName("type") private val _type: ChatType?,
    @SerializedName("status") private val _status: ChatStatusType?,
    /* Дата и время создания чата.  Формат даты: ISO 8601 со смещением относительно UTC. Например, `2017-11-21T00:00:00+03:00`.  */
    @SerializedName("createdAt") private val _createdAt: java.time.OffsetDateTime?,
    /* Дата и время последнего сообщения в чате. */
    @SerializedName("updatedAt") private val _updatedAt: java.time.OffsetDateTime?
) {

        val chatId get() = _chatId ?: throw IllegalArgumentException("chatId is required")
                    
        val orderId get() = _orderId ?: throw IllegalArgumentException("orderId is required")
                    
        val type get() = _type ?: throw IllegalArgumentException("type is required")
                    
        val status get() = _status ?: throw IllegalArgumentException("status is required")
                    
        val createdAt get() = _createdAt ?: throw IllegalArgumentException("createdAt is required")
                    
        val updatedAt get() = _updatedAt ?: throw IllegalArgumentException("updatedAt is required")
                    
}

