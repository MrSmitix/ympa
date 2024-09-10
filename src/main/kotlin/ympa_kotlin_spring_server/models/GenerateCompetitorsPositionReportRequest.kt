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
 * @param businessId Идентификатор бизнеса.
 * @param categoryId Идентификатор категории.
 * @param dateFrom Начало периода, включительно.
 * @param dateTo Конец периода, включительно.
 */
data class GenerateCompetitorsPositionReportRequest(

    @Schema(example = "null", required = true, description = "Идентификатор бизнеса.")
    @get:JsonProperty("businessId", required = true) val businessId: kotlin.Long,

    @Schema(example = "null", required = true, description = "Идентификатор категории.")
    @get:JsonProperty("categoryId", required = true) val categoryId: kotlin.Long,

    @field:Valid
    @Schema(example = "null", required = true, description = "Начало периода, включительно.")
    @get:JsonProperty("dateFrom", required = true) val dateFrom: java.time.LocalDate,

    @field:Valid
    @Schema(example = "null", required = true, description = "Конец периода, включительно.")
    @get:JsonProperty("dateTo", required = true) val dateTo: java.time.LocalDate
    ) {

}
