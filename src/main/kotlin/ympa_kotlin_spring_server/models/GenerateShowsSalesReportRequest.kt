package ympa_kotlin_spring_server.models

import java.util.Objects
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.annotation.JsonValue
import ympa_kotlin_spring_server.models.ShowsSalesGroupingType
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
 * @param dateFrom Начало периода, включительно.
 * @param dateTo Конец периода, включительно.
 * @param grouping 
 * @param businessId Идентификатор бизнеса.  Указывается, если нужно составить отчет по всем магазинам бизнеса. В запросе обязательно должен быть либо `businessID`, либо `campaignId`, но не оба сразу. 
 * @param campaignId Идентификатор кампании.  Указывается, если нужно составить отчет по конкретному магазину. В запросе обязательно должен быть либо `businessID`, либо `campaignId`, но не оба сразу. 
 */
data class GenerateShowsSalesReportRequest(

    @field:Valid
    @Schema(example = "null", required = true, description = "Начало периода, включительно.")
    @get:JsonProperty("dateFrom", required = true) val dateFrom: java.time.LocalDate,

    @field:Valid
    @Schema(example = "null", required = true, description = "Конец периода, включительно.")
    @get:JsonProperty("dateTo", required = true) val dateTo: java.time.LocalDate,

    @field:Valid
    @Schema(example = "null", required = true, description = "")
    @get:JsonProperty("grouping", required = true) val grouping: ShowsSalesGroupingType,

    @Schema(example = "null", description = "Идентификатор бизнеса.  Указывается, если нужно составить отчет по всем магазинам бизнеса. В запросе обязательно должен быть либо `businessID`, либо `campaignId`, но не оба сразу. ")
    @get:JsonProperty("businessId") val businessId: kotlin.Long? = null,

    @Schema(example = "null", description = "Идентификатор кампании.  Указывается, если нужно составить отчет по конкретному магазину. В запросе обязательно должен быть либо `businessID`, либо `campaignId`, но не оба сразу. ")
    @get:JsonProperty("campaignId") val campaignId: kotlin.Long? = null
    ) {

}

