package ympa_kotlin_spring_server.models

import java.util.Objects
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.annotation.JsonValue
import ympa_kotlin_spring_server.models.TimeUnitType
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
 * Временной отрезок с комментарием. Требования к содержанию комментария зависят от контекста использования параметра и указаны в описании поля, которое его содержит.
 * @param timePeriod Продолжительность в указанных единицах.
 * @param timeUnit 
 * @param comment Комментарий.
 */
data class TimePeriodDTO(

    @Schema(example = "null", required = true, description = "Продолжительность в указанных единицах.")
    @get:JsonProperty("timePeriod", required = true) val timePeriod: kotlin.Int,

    @field:Valid
    @Schema(example = "null", required = true, description = "")
    @get:JsonProperty("timeUnit", required = true) val timeUnit: TimeUnitType,

    @Schema(example = "null", description = "Комментарий.")
    @get:JsonProperty("comment") val comment: kotlin.String? = null
    ) {

}

