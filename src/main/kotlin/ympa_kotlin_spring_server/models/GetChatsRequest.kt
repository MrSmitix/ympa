package ympa_kotlin_spring_server.models

import java.util.Objects
import com.fasterxml.jackson.annotation.JsonProperty
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
 * Фильтры по чатам, которые нужно вернуть. 
 * @param orderIds Фильтр по идентификаторам заказов на Маркете.
 * @param types Фильтр по типам чатов.
 * @param statuses Фильтр по статусам чатов.
 */
data class GetChatsRequest(

    @get:Size(min=1)
    @Schema(example = "null", description = "Фильтр по идентификаторам заказов на Маркете.")
    @get:JsonProperty("orderIds") val orderIds: kotlin.collections.List<kotlin.Long>? = null,

    @field:Valid
    @get:Size(min=1)
    @Schema(example = "null", description = "Фильтр по типам чатов.")
    @get:JsonProperty("types") val types: kotlin.collections.List<ChatType>? = null,

    @field:Valid
    @get:Size(min=1)
    @Schema(example = "null", description = "Фильтр по статусам чатов.")
    @get:JsonProperty("statuses") val statuses: kotlin.collections.List<ChatStatusType>? = null
    ) {

}

