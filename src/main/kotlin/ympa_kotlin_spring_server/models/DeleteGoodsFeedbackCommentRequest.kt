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
 * Фильтр запроса отзывов по бизнесу. 
 * @param id Идентификатор комментария к отзыву. 
 */
data class DeleteGoodsFeedbackCommentRequest(

    @Schema(example = "null", required = true, description = "Идентификатор комментария к отзыву. ")
    @get:JsonProperty("id", required = true) val id: kotlin.Long
    ) {

}

