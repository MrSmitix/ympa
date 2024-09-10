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
 * Текстовая часть отзыва.
 * @param advantages Описание плюсов товара в отзыве.
 * @param disadvantages Описание минусов товара в отзыве.
 * @param comment Комментарий в отзыве.
 */
data class GoodsFeedbackDescriptionDTO(

    @Schema(example = "null", description = "Описание плюсов товара в отзыве.")
    @get:JsonProperty("advantages") val advantages: kotlin.String? = null,

    @Schema(example = "null", description = "Описание минусов товара в отзыве.")
    @get:JsonProperty("disadvantages") val disadvantages: kotlin.String? = null,

    @Schema(example = "null", description = "Комментарий в отзыве.")
    @get:JsonProperty("comment") val comment: kotlin.String? = null
    ) {

}

