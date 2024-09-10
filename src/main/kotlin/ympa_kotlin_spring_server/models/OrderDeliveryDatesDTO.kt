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
 * Диапазон дат доставки.
 * @param fromDate Формат даты: `ДД-ММ-ГГГГ`. 
 * @param toDate Формат даты: `ДД-ММ-ГГГГ`. 
 * @param fromTime Начало интервала времени доставки.  Передается только совместно с параметром `type=DELIVERY`.  Формат времени: 24-часовой, `ЧЧ:ММ`. В качестве минут всегда должно быть указано `00` (исключение — `23:59`).  Минимальное значение: `00:00`. 
 * @param toTime Конец интервала времени доставки.  Передается только совместно с параметром `type=DELIVERY`.  Формат времени: 24-часовой, `ЧЧ:ММ`. В качестве минут всегда должно быть указано `00` (исключение — `23:59`).  Максимальное значение: `23:59`. 
 * @param realDeliveryDate Формат даты: `ДД-ММ-ГГГГ`. 
 */
data class OrderDeliveryDatesDTO(

    @Schema(example = "23-09-2022", description = "Формат даты: `ДД-ММ-ГГГГ`. ")
    @get:JsonProperty("fromDate") val fromDate: kotlin.String? = null,

    @Schema(example = "23-09-2022", description = "Формат даты: `ДД-ММ-ГГГГ`. ")
    @get:JsonProperty("toDate") val toDate: kotlin.String? = null,

    @Schema(example = "null", description = "Начало интервала времени доставки.  Передается только совместно с параметром `type=DELIVERY`.  Формат времени: 24-часовой, `ЧЧ:ММ`. В качестве минут всегда должно быть указано `00` (исключение — `23:59`).  Минимальное значение: `00:00`. ")
    @get:JsonProperty("fromTime") val fromTime: kotlin.String? = null,

    @Schema(example = "null", description = "Конец интервала времени доставки.  Передается только совместно с параметром `type=DELIVERY`.  Формат времени: 24-часовой, `ЧЧ:ММ`. В качестве минут всегда должно быть указано `00` (исключение — `23:59`).  Максимальное значение: `23:59`. ")
    @get:JsonProperty("toTime") val toTime: kotlin.String? = null,

    @Schema(example = "23-09-2022", description = "Формат даты: `ДД-ММ-ГГГГ`. ")
    @get:JsonProperty("realDeliveryDate") val realDeliveryDate: kotlin.String? = null
    ) {

}

