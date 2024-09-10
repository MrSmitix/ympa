package ympa_kotlin_spring_server.models

import java.util.Objects
import com.fasterxml.jackson.annotation.JsonProperty
import ympa_kotlin_spring_server.models.PlacementType
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
 * Данные, необходимые для генерации отчета: идентификатор магазина, период, за который нужен отчет, а также фильтры. 
 * @param businessId Идентификатор бизнеса.
 * @param dateTimeFrom {% note warning \"\" %}  Этот параметр устарел. Не используйте его.  {% endnote %}  Начало периода, включительно. 
 * @param dateTimeTo {% note warning \"\" %}  Этот параметр устарел. Не используйте его.  {% endnote %}  Конец периода, включительно. Максимальный период — 1 год. 
 * @param dateFrom Начало периода, включительно.
 * @param dateTo Конец периода, включительно. Максимальный период — 1 год.
 * @param bankOrderId Номер платежного поручения.
 * @param bankOrderDateTime Дата платежного поручения.
 * @param placementPrograms Список моделей, которые нужны в отчете. 
 * @param inns Список ИНН, которые нужны в отчете.
 * @param campaignIds Список магазинов, которые нужны в отчете.
 */
data class GenerateUnitedNettingReportRequest(

    @Schema(example = "null", required = true, description = "Идентификатор бизнеса.")
    @get:JsonProperty("businessId", required = true) val businessId: kotlin.Long,

    @Schema(example = "null", description = "{% note warning \"\" %}  Этот параметр устарел. Не используйте его.  {% endnote %}  Начало периода, включительно. ")
    @get:JsonProperty("dateTimeFrom") val dateTimeFrom: java.time.OffsetDateTime? = null,

    @Schema(example = "null", description = "{% note warning \"\" %}  Этот параметр устарел. Не используйте его.  {% endnote %}  Конец периода, включительно. Максимальный период — 1 год. ")
    @get:JsonProperty("dateTimeTo") val dateTimeTo: java.time.OffsetDateTime? = null,

    @field:Valid
    @Schema(example = "null", description = "Начало периода, включительно.")
    @get:JsonProperty("dateFrom") val dateFrom: java.time.LocalDate? = null,

    @field:Valid
    @Schema(example = "null", description = "Конец периода, включительно. Максимальный период — 1 год.")
    @get:JsonProperty("dateTo") val dateTo: java.time.LocalDate? = null,

    @Schema(example = "null", description = "Номер платежного поручения.")
    @get:JsonProperty("bankOrderId") val bankOrderId: kotlin.Long? = null,

    @Schema(example = "null", description = "Дата платежного поручения.")
    @get:JsonProperty("bankOrderDateTime") val bankOrderDateTime: java.time.OffsetDateTime? = null,

    @field:Valid
    @Schema(example = "null", description = "Список моделей, которые нужны в отчете. ")
    @get:JsonProperty("placementPrograms") val placementPrograms: kotlin.collections.List<PlacementType>? = null,

    @Schema(example = "null", description = "Список ИНН, которые нужны в отчете.")
    @get:JsonProperty("inns") val inns: kotlin.collections.List<kotlin.String>? = null,

    @Schema(example = "null", description = "Список магазинов, которые нужны в отчете.")
    @get:JsonProperty("campaignIds") val campaignIds: kotlin.collections.List<kotlin.Long>? = null
    ) {

}

