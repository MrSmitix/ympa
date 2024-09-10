package ympa_kotlin_spring_server.models

import java.util.Objects
import com.fasterxml.jackson.annotation.JsonProperty
import ympa_kotlin_spring_server.models.GoodsFeedbackDescriptionDTO
import ympa_kotlin_spring_server.models.GoodsFeedbackIdentifiersDTO
import ympa_kotlin_spring_server.models.GoodsFeedbackMediaDTO
import ympa_kotlin_spring_server.models.GoodsFeedbackStatisticsDTO
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
 * Отзыв о товаре.
 * @param feedbackId Идентификатор отзыва. 
 * @param createdAt Дата и время создания отзыва.
 * @param needReaction Нужен ли ответ на отзыв.
 * @param identifiers 
 * @param statistics 
 * @param author Имя автора отзыва.
 * @param description 
 * @param media 
 */
data class GoodsFeedbackDTO(

    @Schema(example = "null", required = true, description = "Идентификатор отзыва. ")
    @get:JsonProperty("feedbackId", required = true) val feedbackId: kotlin.Long,

    @Schema(example = "null", required = true, description = "Дата и время создания отзыва.")
    @get:JsonProperty("createdAt", required = true) val createdAt: java.time.OffsetDateTime,

    @Schema(example = "null", required = true, description = "Нужен ли ответ на отзыв.")
    @get:JsonProperty("needReaction", required = true) val needReaction: kotlin.Boolean,

    @field:Valid
    @Schema(example = "null", required = true, description = "")
    @get:JsonProperty("identifiers", required = true) val identifiers: GoodsFeedbackIdentifiersDTO,

    @field:Valid
    @Schema(example = "null", required = true, description = "")
    @get:JsonProperty("statistics", required = true) val statistics: GoodsFeedbackStatisticsDTO,

    @Schema(example = "null", description = "Имя автора отзыва.")
    @get:JsonProperty("author") val author: kotlin.String? = null,

    @field:Valid
    @Schema(example = "null", description = "")
    @get:JsonProperty("description") val description: GoodsFeedbackDescriptionDTO? = null,

    @field:Valid
    @Schema(example = "null", description = "")
    @get:JsonProperty("media") val media: GoodsFeedbackMediaDTO? = null
    ) {

}

