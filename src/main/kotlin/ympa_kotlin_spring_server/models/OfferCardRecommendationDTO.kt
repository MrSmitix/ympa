package ympa_kotlin_spring_server.models

import java.util.Objects
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.annotation.JsonValue
import ympa_kotlin_spring_server.models.OfferCardRecommendationType
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
 * Рекомендация по заполнению карточки товара.
 * @param type 
 * @param percent Процент выполнения рекомендации. Указывается для рекомендаций некоторых типов.
 */
data class OfferCardRecommendationDTO(

    @field:Valid
    @Schema(example = "null", required = true, description = "")
    @get:JsonProperty("type", required = true) val type: OfferCardRecommendationType,

    @get:Min(0)
    @get:Max(100)
    @Schema(example = "null", description = "Процент выполнения рекомендации. Указывается для рекомендаций некоторых типов.")
    @get:JsonProperty("percent") val percent: kotlin.Int? = null
    ) {

}

