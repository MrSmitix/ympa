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
 * Статистическая информация по отзыву.
 * @param rating Оценка товара.
 * @param commentsCount Количество комментариев к отзыву.  Учитываются только ответы на отзывы, а не дочерние комментарии. 
 * @param recommended Рекомендуют ли этот товар.
 * @param paidAmount Количество баллов Плюса, которое автор получил за отзыв.
 */
data class GoodsFeedbackStatisticsDTO(

    @get:Min(1)
    @get:Max(5)
    @Schema(example = "null", required = true, description = "Оценка товара.")
    @get:JsonProperty("rating", required = true) val rating: kotlin.Int,

    @Schema(example = "null", required = true, description = "Количество комментариев к отзыву.  Учитываются только ответы на отзывы, а не дочерние комментарии. ")
    @get:JsonProperty("commentsCount", required = true) val commentsCount: kotlin.Long,

    @Schema(example = "null", description = "Рекомендуют ли этот товар.")
    @get:JsonProperty("recommended") val recommended: kotlin.Boolean? = null,

    @Schema(example = "null", description = "Количество баллов Плюса, которое автор получил за отзыв.")
    @get:JsonProperty("paidAmount") val paidAmount: kotlin.Long? = null
    ) {

}

