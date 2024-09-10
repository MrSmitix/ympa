package ympa_kotlin_spring_server.models

import java.util.Objects
import com.fasterxml.jackson.annotation.JsonProperty
import ympa_kotlin_spring_server.models.ForwardScrollingPagerDTO
import ympa_kotlin_spring_server.models.GoodsFeedbackCommentDTO
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
 * Комментарии к отзыву.
 * @param comments Список комментариев.
 * @param paging 
 */
data class GoodsFeedbackCommentListDTO(

    @field:Valid
    @Schema(example = "null", required = true, description = "Список комментариев.")
    @get:JsonProperty("comments", required = true) val comments: kotlin.collections.List<GoodsFeedbackCommentDTO>,

    @field:Valid
    @Schema(example = "null", description = "")
    @get:JsonProperty("paging") val paging: ForwardScrollingPagerDTO? = null
    ) {

}

