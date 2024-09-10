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
 * @param dateFrom Начало периода, включительно.
 * @param dateTo Конец периода, включительно. Максимальный период — 1 год.
 * @param campaignIds Список магазинов, которые нужны в отчете.
 * @param promoId Идентификатор акции, товары из которой нужны в отчете.
 */
data class GenerateUnitedOrdersRequest(

    @Schema(example = "null", required = true, description = "Идентификатор бизнеса.")
    @get:JsonProperty("businessId", required = true) val businessId: kotlin.Long,

    @field:Valid
    @Schema(example = "null", required = true, description = "Начало периода, включительно.")
    @get:JsonProperty("dateFrom", required = true) val dateFrom: java.time.LocalDate,

    @field:Valid
    @Schema(example = "null", required = true, description = "Конец периода, включительно. Максимальный период — 1 год.")
    @get:JsonProperty("dateTo", required = true) val dateTo: java.time.LocalDate,

    @Schema(example = "null", description = "Список магазинов, которые нужны в отчете.")
    @get:JsonProperty("campaignIds") val campaignIds: kotlin.collections.List<kotlin.Long>? = null,

    @Schema(example = "null", description = "Идентификатор акции, товары из которой нужны в отчете.")
    @get:JsonProperty("promoId") val promoId: kotlin.String? = null
    ) {

}

