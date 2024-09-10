package ympa_kotlin_spring_server.models

import java.util.Objects
import com.fasterxml.jackson.annotation.JsonProperty
import ympa_kotlin_spring_server.models.FeedbackDTO
import ympa_kotlin_spring_server.models.ScrollingPagerDTO
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
 * Отзывы пользователей Яндекс Маркета об указанном магазине.
 * @param feedbackList Список отзывов.  Содержит не более 20 отзывов. 
 * @param paging 
 */
data class FeedbackListDTO(

    @field:Valid
    @Schema(example = "null", required = true, description = "Список отзывов.  Содержит не более 20 отзывов. ")
    @get:JsonProperty("feedbackList", required = true) val feedbackList: kotlin.collections.List<FeedbackDTO>,

    @field:Valid
    @Schema(example = "null", description = "")
    @get:JsonProperty("paging") val paging: ScrollingPagerDTO? = null
    ) {

}

