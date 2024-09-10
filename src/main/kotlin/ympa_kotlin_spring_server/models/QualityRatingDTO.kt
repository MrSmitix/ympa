package ympa_kotlin_spring_server.models

import java.util.Objects
import com.fasterxml.jackson.annotation.JsonProperty
import ympa_kotlin_spring_server.models.QualityRatingComponentDTO
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
 * Информация об индексе качества.
 * @param rating Значение индекса качества.
 * @param calculationDate Дата вычисления.  Формат даты: `ГГГГ‑ММ‑ДД`. 
 * @param components Составляющие индекса качества.
 */
data class QualityRatingDTO(

    @get:Min(0L)
    @get:Max(100L)
    @Schema(example = "null", required = true, description = "Значение индекса качества.")
    @get:JsonProperty("rating", required = true) val rating: kotlin.Long,

    @field:Valid
    @Schema(example = "null", required = true, description = "Дата вычисления.  Формат даты: `ГГГГ‑ММ‑ДД`. ")
    @get:JsonProperty("calculationDate", required = true) val calculationDate: java.time.LocalDate,

    @field:Valid
    @Schema(example = "null", required = true, description = "Составляющие индекса качества.")
    @get:JsonProperty("components", required = true) val components: kotlin.collections.List<QualityRatingComponentDTO>
    ) {

}

