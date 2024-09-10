package ympa_kotlin_spring_server.models

import java.util.Objects
import com.fasterxml.jackson.annotation.JsonProperty
import ympa_kotlin_spring_server.models.ForwardScrollingPagerDTO
import ympa_kotlin_spring_server.models.GetChatInfoDTO
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
 * Список чатов.
 * @param chats Информация о чатах.
 * @param paging 
 */
data class GetChatsInfoDTO(

    @field:Valid
    @Schema(example = "null", required = true, description = "Информация о чатах.")
    @get:JsonProperty("chats", required = true) val chats: kotlin.collections.List<GetChatInfoDTO>,

    @field:Valid
    @Schema(example = "null", description = "")
    @get:JsonProperty("paging") val paging: ForwardScrollingPagerDTO? = null
    ) {

}

