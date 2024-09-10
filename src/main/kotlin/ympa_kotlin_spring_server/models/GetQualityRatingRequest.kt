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
 * Запрос информации по индексу качества.
 * @param campaignIds Список идентификаторов магазинов.
 * @param dateFrom Начало периода.  Формат даты: `ГГГГ‑ММ‑ДД`.  Не может быть раньше 30 дней от текущей даты. 
 * @param dateTo Конец периода.  Формат даты: `ГГГГ‑ММ‑ДД`.  Не может быть позже текущей даты. 
 */
data class GetQualityRatingRequest(

    @get:Size(min=1,max=50) 
    @Schema(example = "null", required = true, description = "Список идентификаторов магазинов.")
    @get:JsonProperty("campaignIds", required = true) val campaignIds: kotlin.collections.Set<kotlin.Long>,

    @field:Valid
    @Schema(example = "null", description = "Начало периода.  Формат даты: `ГГГГ‑ММ‑ДД`.  Не может быть раньше 30 дней от текущей даты. ")
    @get:JsonProperty("dateFrom") val dateFrom: java.time.LocalDate? = null,

    @field:Valid
    @Schema(example = "null", description = "Конец периода.  Формат даты: `ГГГГ‑ММ‑ДД`.  Не может быть позже текущей даты. ")
    @get:JsonProperty("dateTo") val dateTo: java.time.LocalDate? = null
    ) {

}

