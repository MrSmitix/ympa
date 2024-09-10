package ympa_kotlin_spring_server.models

import java.util.Objects
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.annotation.JsonValue
import ympa_kotlin_spring_server.models.DayOfWeekType
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
 * Расписание работы точки продаж.
 * @param startDay 
 * @param endDay 
 * @param startTime Точка продаж работает c указанного часа.  Формат: `ЧЧ:ММ`. 
 * @param endTime Точка продаж работает до указанного часа.  Формат: `ЧЧ:ММ`. 
 */
data class OutletWorkingScheduleItemDTO(

    @field:Valid
    @Schema(example = "null", required = true, description = "")
    @get:JsonProperty("startDay", required = true) val startDay: DayOfWeekType,

    @field:Valid
    @Schema(example = "null", required = true, description = "")
    @get:JsonProperty("endDay", required = true) val endDay: DayOfWeekType,

    @get:Size(min=1)
    @Schema(example = "null", required = true, description = "Точка продаж работает c указанного часа.  Формат: `ЧЧ:ММ`. ")
    @get:JsonProperty("startTime", required = true) val startTime: kotlin.String,

    @get:Size(min=1)
    @Schema(example = "null", required = true, description = "Точка продаж работает до указанного часа.  Формат: `ЧЧ:ММ`. ")
    @get:JsonProperty("endTime", required = true) val endTime: kotlin.String
    ) {

}

