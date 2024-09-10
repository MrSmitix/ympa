package ympa_kotlin_spring_server.models

import java.util.Objects
import com.fasterxml.jackson.annotation.JsonProperty
import ympa_kotlin_spring_server.models.FeedbackCommentAuthorDTO
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
 * Комментарий к отзыву на магазин.
 * @param id Идентификатор ответа.
 * @param parentId Идентификатор родительского ответа.
 * @param body Текст ответа.
 * @param createdAt Дата и время создания ответа.  Формат даты: ISO 8601 со смещением относительно UTC. Например, `2017-11-21T00:00:00+03:00`. 
 * @param updatedAt Дата и время изменения ответа.  Формат даты: ISO 8601 со смещением относительно UTC. Например, `2017-11-21T00:00:00+03:00`. 
 * @param author 
 * @param children Дочерние ответы.
 */
data class FeedbackCommentDTO(

    @Schema(example = "null", description = "Идентификатор ответа.")
    @get:JsonProperty("id") val id: kotlin.Long? = null,

    @Schema(example = "null", description = "Идентификатор родительского ответа.")
    @get:JsonProperty("parentId") val parentId: kotlin.Long? = null,

    @Schema(example = "null", description = "Текст ответа.")
    @get:JsonProperty("body") val body: kotlin.String? = null,

    @Schema(example = "null", description = "Дата и время создания ответа.  Формат даты: ISO 8601 со смещением относительно UTC. Например, `2017-11-21T00:00:00+03:00`. ")
    @get:JsonProperty("createdAt") val createdAt: java.time.OffsetDateTime? = null,

    @Schema(example = "null", description = "Дата и время изменения ответа.  Формат даты: ISO 8601 со смещением относительно UTC. Например, `2017-11-21T00:00:00+03:00`. ")
    @get:JsonProperty("updatedAt") val updatedAt: java.time.OffsetDateTime? = null,

    @field:Valid
    @Schema(example = "null", description = "")
    @get:JsonProperty("author") val author: FeedbackCommentAuthorDTO? = null,

    @field:Valid
    @Schema(example = "null", description = "Дочерние ответы.")
    @get:JsonProperty("children") val children: kotlin.collections.List<FeedbackCommentDTO>? = null
    ) {

}

