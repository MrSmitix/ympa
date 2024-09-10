package ympa_kotlin_spring_server.models

import java.util.Objects
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.annotation.JsonValue
import ympa_kotlin_spring_server.models.GoodsFeedbackCommentAuthorDTO
import ympa_kotlin_spring_server.models.GoodsFeedbackCommentStatusType
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
 * Комментарий к отзыву.
 * @param id Идентификатор комментария к отзыву. 
 * @param text Текст комментария.
 * @param author 
 * @param status 
 * @param canModify Может ли продавец изменять комментарий или удалять его.
 * @param parentId Идентификатор комментария к отзыву. 
 */
data class GoodsFeedbackCommentDTO(

    @Schema(example = "null", required = true, description = "Идентификатор комментария к отзыву. ")
    @get:JsonProperty("id", required = true) val id: kotlin.Long,

    @get:Size(min=1,max=4096)
    @Schema(example = "null", required = true, description = "Текст комментария.")
    @get:JsonProperty("text", required = true) val text: kotlin.String,

    @field:Valid
    @Schema(example = "null", required = true, description = "")
    @get:JsonProperty("author", required = true) val author: GoodsFeedbackCommentAuthorDTO,

    @field:Valid
    @Schema(example = "null", required = true, description = "")
    @get:JsonProperty("status", required = true) val status: GoodsFeedbackCommentStatusType,

    @Schema(example = "null", description = "Может ли продавец изменять комментарий или удалять его.")
    @get:JsonProperty("canModify") val canModify: kotlin.Boolean? = null,

    @Schema(example = "null", description = "Идентификатор комментария к отзыву. ")
    @get:JsonProperty("parentId") val parentId: kotlin.Long? = null
    ) {

}

