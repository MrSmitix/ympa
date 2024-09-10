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
 * Данные, необходимые для генерации отчета. 
 * @param campaignId Идентификатор кампании.
 * @param date Дата, за которую нужно рассчитать оборачиваемость. Если параметр не указан, используется текущая дата.
 */
data class GenerateGoodsTurnoverRequest(

    @Schema(example = "null", required = true, description = "Идентификатор кампании.")
    @get:JsonProperty("campaignId", required = true) val campaignId: kotlin.Long,

    @field:Valid
    @Schema(example = "null", description = "Дата, за которую нужно рассчитать оборачиваемость. Если параметр не указан, используется текущая дата.")
    @get:JsonProperty("date") val date: java.time.LocalDate? = null
    ) {

}

