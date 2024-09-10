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
 * Информация о платежном получении.
 * @param id Номер платежного поручения.
 * @param date Дата платежного поручения.  Формат даты: `ГГГГ‑ММ‑ДД`. 
 */
data class OrdersStatsPaymentOrderDTO(

    @Schema(example = "null", description = "Номер платежного поручения.")
    @get:JsonProperty("id") val id: kotlin.String? = null,

    @field:Valid
    @Schema(example = "null", description = "Дата платежного поручения.  Формат даты: `ГГГГ‑ММ‑ДД`. ")
    @get:JsonProperty("date") val date: java.time.LocalDate? = null
    ) {

}

