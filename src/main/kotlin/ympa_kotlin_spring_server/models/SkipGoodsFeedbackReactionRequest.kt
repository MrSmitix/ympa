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
 * Идентификаторы отзывов.
 * @param feedbackIds Список идентификаторов отзывов, на которые магазин не будет отвечать.
 */
data class SkipGoodsFeedbackReactionRequest(

    @get:Size(min=1,max=50) 
    @Schema(example = "null", required = true, description = "Список идентификаторов отзывов, на которые магазин не будет отвечать.")
    @get:JsonProperty("feedbackIds", required = true) val feedbackIds: kotlin.collections.Set<kotlin.Long>
    ) {

}
