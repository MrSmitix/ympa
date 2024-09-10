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
 * Время проведения акции.
 * @param dateTimeFrom Дата и время начала акции.
 * @param dateTimeTo Дата и время окончания акции.
 */
data class PromoPeriodDTO(

    @Schema(example = "null", required = true, description = "Дата и время начала акции.")
    @get:JsonProperty("dateTimeFrom", required = true) val dateTimeFrom: java.time.OffsetDateTime,

    @Schema(example = "null", required = true, description = "Дата и время окончания акции.")
    @get:JsonProperty("dateTimeTo", required = true) val dateTimeTo: java.time.OffsetDateTime
    ) {

}

