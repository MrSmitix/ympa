package ympa_kotlin_spring_server.models

import java.util.Objects
import com.fasterxml.jackson.annotation.JsonProperty
import ympa_kotlin_spring_server.models.CampaignSettingsTimePeriodDTO
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
 * Расписание работы службы доставки в своем регионе.
 * @param customHolidays Список дней, в которые служба доставки не работает. Дни магазин указал в кабинете продавца на Маркете.
 * @param customWorkingDays Список выходных и праздничных дней, в которые служба доставки работает. Дни магазин указал в кабинете продавца на Маркете.
 * @param totalHolidays Итоговый список нерабочих дней службы доставки. Список рассчитывается с учетом выходных, нерабочих дней и государственных праздников. Информацию по ним магазин указывает в кабинете продавца на Маркете.
 * @param weeklyHolidays Список выходных дней недели и государственных праздников.
 * @param availableOnHolidays Признак работы службы доставки в государственные праздники. Возможные значения. * `false` — служба доставки не работает в праздничные дни. * `true` — служба доставки работает в праздничные дни. 
 * @param period 
 */
data class CampaignSettingsScheduleDTO(

    @Schema(example = "null", required = true, description = "Список дней, в которые служба доставки не работает. Дни магазин указал в кабинете продавца на Маркете.")
    @get:JsonProperty("customHolidays", required = true) val customHolidays: kotlin.collections.List<kotlin.String>,

    @Schema(example = "null", required = true, description = "Список выходных и праздничных дней, в которые служба доставки работает. Дни магазин указал в кабинете продавца на Маркете.")
    @get:JsonProperty("customWorkingDays", required = true) val customWorkingDays: kotlin.collections.List<kotlin.String>,

    @Schema(example = "null", required = true, description = "Итоговый список нерабочих дней службы доставки. Список рассчитывается с учетом выходных, нерабочих дней и государственных праздников. Информацию по ним магазин указывает в кабинете продавца на Маркете.")
    @get:JsonProperty("totalHolidays", required = true) val totalHolidays: kotlin.collections.List<kotlin.String>,

    @Schema(example = "null", required = true, description = "Список выходных дней недели и государственных праздников.")
    @get:JsonProperty("weeklyHolidays", required = true) val weeklyHolidays: kotlin.collections.List<kotlin.Int>,

    @Schema(example = "null", description = "Признак работы службы доставки в государственные праздники. Возможные значения. * `false` — служба доставки не работает в праздничные дни. * `true` — служба доставки работает в праздничные дни. ")
    @get:JsonProperty("availableOnHolidays") val availableOnHolidays: kotlin.Boolean? = null,

    @field:Valid
    @Schema(example = "null", description = "")
    @get:JsonProperty("period") val period: CampaignSettingsTimePeriodDTO? = null
    ) {

}

