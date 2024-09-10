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
 * Историю какого чата нужно получить — и начиная с какого сообщения. 
 * @param messageIdFrom Идентификатор сообщения, начиная с которого нужно получить все последующие сообщения.
 */
data class GetChatHistoryRequest(

    @Schema(example = "null", description = "Идентификатор сообщения, начиная с которого нужно получить все последующие сообщения.")
    @get:JsonProperty("messageIdFrom") val messageIdFrom: kotlin.Long? = null
    ) {

}

