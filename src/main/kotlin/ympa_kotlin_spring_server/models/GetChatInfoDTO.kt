package ympa_kotlin_spring_server.models

import java.util.Objects
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.annotation.JsonValue
import ympa_kotlin_spring_server.models.ChatStatusType
import ympa_kotlin_spring_server.models.ChatType
import javax.validation.constraints.DecimalMax
import javax.validation.constraints.DecimalMin
import javax.validation.constraints.Email
import javax.validation.constraints.Max
import javax.validation.constraints.Min
import javax.validation.constraints.NotNull
import javax.validation.constraints.Pattern
import javax.validation.constraints.Size
import javax.validation.Valid
import io.swagger.v3.oas.annotations.media.Schema

/**
 * Информация о чатах.
 * @param chatId Идентификатор чата.
 * @param orderId Идентификатор заказа.
 * @param type 
 * @param status 
 * @param createdAt Дата и время создания чата.  Формат даты: ISO 8601 со смещением относительно UTC. Например, `2017-11-21T00:00:00+03:00`. 
 * @param updatedAt Дата и время последнего сообщения в чате.
 */
data class GetChatInfoDTO(

    @Schema(example = "null", required = true, description = "Идентификатор чата.")
    @get:JsonProperty("chatId", required = true) val chatId: kotlin.Long,

    @Schema(example = "null", required = true, description = "Идентификатор заказа.")
    @get:JsonProperty("orderId", required = true) val orderId: kotlin.Long,

    @field:Valid
    @Schema(example = "null", required = true, description = "")
    @get:JsonProperty("type", required = true) val type: ChatType,

    @field:Valid
    @Schema(example = "null", required = true, description = "")
    @get:JsonProperty("status", required = true) val status: ChatStatusType,

    @Schema(example = "null", required = true, description = "Дата и время создания чата.  Формат даты: ISO 8601 со смещением относительно UTC. Например, `2017-11-21T00:00:00+03:00`. ")
    @get:JsonProperty("createdAt", required = true) val createdAt: java.time.OffsetDateTime,

    @Schema(example = "null", required = true, description = "Дата и время последнего сообщения в чате.")
    @get:JsonProperty("updatedAt", required = true) val updatedAt: java.time.OffsetDateTime
    ) {

}

