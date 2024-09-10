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
 * Данные, необходимые для генерации отчета: идентификатор магазина и период, за который нужен отчет. 
 * @param campaignId Идентификатор кампании.
 * @param year Год.
 * @param month Номер месяца.
 */
data class GenerateGoodsRealizationReportRequest(

    @Schema(example = "null", required = true, description = "Идентификатор кампании.")
    @get:JsonProperty("campaignId", required = true) val campaignId: kotlin.Long,

    @Schema(example = "null", required = true, description = "Год.")
    @get:JsonProperty("year", required = true) val year: kotlin.Int,

    @get:Min(1)
    @get:Max(12)
    @Schema(example = "null", required = true, description = "Номер месяца.")
    @get:JsonProperty("month", required = true) val month: kotlin.Int
    ) {

}

