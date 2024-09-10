package ympa_kotlin_spring_server.models

import java.util.Objects
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.annotation.JsonValue
import ympa_kotlin_spring_server.models.ChatMessagePayloadDTO
import ympa_kotlin_spring_server.models.ChatMessageSenderType
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
 * Информация о сообщениях.
 * @param messageId Идентификатор сообщения.
 * @param createdAt Дата и время создания сообщения.  Формат даты: ISO 8601 со смещением относительно UTC. Например, `2017-11-21T00:00:00+03:00`. 
 * @param sender 
 * @param message Текст сообщения.  Необязательный параметр, если возвращается параметр `payload`. 
 * @param payload Информация о приложенных к сообщению файлах.  Необязательный параметр, если возвращается параметр `message`. 
 */
data class ChatMessageDTO(

    @Schema(example = "null", required = true, description = "Идентификатор сообщения.")
    @get:JsonProperty("messageId", required = true) val messageId: kotlin.Long,

    @Schema(example = "null", required = true, description = "Дата и время создания сообщения.  Формат даты: ISO 8601 со смещением относительно UTC. Например, `2017-11-21T00:00:00+03:00`. ")
    @get:JsonProperty("createdAt", required = true) val createdAt: java.time.OffsetDateTime,

    @field:Valid
    @Schema(example = "null", required = true, description = "")
    @get:JsonProperty("sender", required = true) val sender: ChatMessageSenderType,

    @Schema(example = "null", description = "Текст сообщения.  Необязательный параметр, если возвращается параметр `payload`. ")
    @get:JsonProperty("message") val message: kotlin.String? = null,

    @field:Valid
    @Schema(example = "null", description = "Информация о приложенных к сообщению файлах.  Необязательный параметр, если возвращается параметр `message`. ")
    @get:JsonProperty("payload") val payload: kotlin.collections.List<ChatMessagePayloadDTO>? = null
    ) {

}

