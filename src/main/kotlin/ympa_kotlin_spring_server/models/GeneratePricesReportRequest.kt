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
 * @param businessId Идентификатор бизнеса.  В большинстве случаев обязателен. Не указывается, если задан `campaignId`. 
 * @param campaignId Идентификатор кампании.  Как правило, не используется. Передавайте только если в кабинете есть магазины с уникальными ценами и вы хотите получить отчет для них. В этом случае передавать `businessId` не нужно. 
 * @param categoryIds Фильтр по категориям на Маркете.
 * @param creationDateFrom Фильтр по времени появления предложения — начало периода.  Формат даты: `ДД-ММ-ГГГГ`. 
 * @param creationDateTo Фильтр по времени появления предложения — окончание периода.  Формат даты: `ДД-ММ-ГГГГ`. 
 */
data class GeneratePricesReportRequest(

    @Schema(example = "null", description = "Идентификатор бизнеса.  В большинстве случаев обязателен. Не указывается, если задан `campaignId`. ")
    @get:JsonProperty("businessId") val businessId: kotlin.Long? = null,

    @Schema(example = "null", description = "Идентификатор кампании.  Как правило, не используется. Передавайте только если в кабинете есть магазины с уникальными ценами и вы хотите получить отчет для них. В этом случае передавать `businessId` не нужно. ")
    @get:JsonProperty("campaignId") val campaignId: kotlin.Long? = null,

    @Schema(example = "null", description = "Фильтр по категориям на Маркете.")
    @get:JsonProperty("categoryIds") val categoryIds: kotlin.collections.List<kotlin.Long>? = null,

    @field:Valid
    @Schema(example = "null", description = "Фильтр по времени появления предложения — начало периода.  Формат даты: `ДД-ММ-ГГГГ`. ")
    @get:JsonProperty("creationDateFrom") val creationDateFrom: java.time.LocalDate? = null,

    @field:Valid
    @Schema(example = "null", description = "Фильтр по времени появления предложения — окончание периода.  Формат даты: `ДД-ММ-ГГГГ`. ")
    @get:JsonProperty("creationDateTo") val creationDateTo: java.time.LocalDate? = null
    ) {

}

