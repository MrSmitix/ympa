package ympa_kotlin_spring_server.models

import java.util.Objects
import com.fasterxml.jackson.annotation.JsonProperty
import ympa_kotlin_spring_server.models.OutletWorkingScheduleItemDTO
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
 * Список режимов работы точки продаж. 
 * @param scheduleItems Список расписаний работы точки продаж. 
 * @param workInHoliday Признак, работает ли точка продаж в дни государственных праздников.  Возможные значения:  * `false` — точка продаж не работает в дни государственных праздников. * `true` — точка продаж работает в дни государственных праздников. 
 */
data class OutletWorkingScheduleDTO(

    @field:Valid
    @get:Size(min=1)
    @Schema(example = "null", required = true, description = "Список расписаний работы точки продаж. ")
    @get:JsonProperty("scheduleItems", required = true) val scheduleItems: kotlin.collections.List<OutletWorkingScheduleItemDTO>,

    @Schema(example = "null", description = "Признак, работает ли точка продаж в дни государственных праздников.  Возможные значения:  * `false` — точка продаж не работает в дни государственных праздников. * `true` — точка продаж работает в дни государственных праздников. ")
    @get:JsonProperty("workInHoliday") val workInHoliday: kotlin.Boolean? = null
    ) {

}

