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
 * Комментарий к отзыву или другому комментарию.
 * @param text Текст комментария.
 * @param id Идентификатор комментария к отзыву. 
 * @param parentId Идентификатор комментария к отзыву. 
 */
data class UpdateGoodsFeedbackCommentDTO(

    @get:Size(min=1,max=4096)
    @Schema(example = "null", required = true, description = "Текст комментария.")
    @get:JsonProperty("text", required = true) val text: kotlin.String,

    @Schema(example = "null", description = "Идентификатор комментария к отзыву. ")
    @get:JsonProperty("id") val id: kotlin.Long? = null,

    @Schema(example = "null", description = "Идентификатор комментария к отзыву. ")
    @get:JsonProperty("parentId") val parentId: kotlin.Long? = null
    ) {

}

