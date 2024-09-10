package ympa_kotlin_spring_server.models

import java.util.Objects
import com.fasterxml.jackson.annotation.JsonProperty
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
 * В какой чат нужно отправить сообщение и текст сообщения.
 * @param message Текст сообщения. Максимальная длина — 4096 символа.
 */
data class SendMessageToChatRequest(

    @get:Size(min=1,max=4096)
    @Schema(example = "null", required = true, description = "Текст сообщения. Максимальная длина — 4096 символа.")
    @get:JsonProperty("message", required = true) val message: kotlin.String
    ) {

}

