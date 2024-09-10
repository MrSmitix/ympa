package ympa_kotlin_spring_server.models

import java.util.Objects
import com.fasterxml.jackson.annotation.JsonProperty
import ympa_kotlin_spring_server.models.ChatMessageDTO
import ympa_kotlin_spring_server.models.ForwardScrollingPagerDTO
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
 * @param orderId Идентификатор заказа.
 * @param messages Информация о сообщениях.
 * @param paging 
 */
data class ChatMessagesResultDTO(

    @Schema(example = "null", required = true, description = "Идентификатор заказа.")
    @get:JsonProperty("orderId", required = true) val orderId: kotlin.Long,

    @field:Valid
    @Schema(example = "null", required = true, description = "Информация о сообщениях.")
    @get:JsonProperty("messages", required = true) val messages: kotlin.collections.List<ChatMessageDTO>,

    @field:Valid
    @Schema(example = "null", description = "")
    @get:JsonProperty("paging") val paging: ForwardScrollingPagerDTO? = null
    ) {

}

