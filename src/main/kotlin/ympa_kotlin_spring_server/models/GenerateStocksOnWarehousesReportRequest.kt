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
 * @param campaignId Идентификатор магазина.
 * @param warehouseIds Фильтр по идентификаторам складов (только модель FBY). Чтобы узнать идентификатор, воспользуйтесь запросом [GET warehouses](../../reference/warehouses/getFulfillmentWarehouses.md).
 * @param reportDate Фильтр по дате (для модели FBY). В отчет попадут данные за **предшествующий** дате день.
 * @param categoryIds Фильтр по категориям на Маркете (кроме модели FBY).
 * @param hasStocks Фильтр по наличию остатков (кроме модели FBY).
 */
data class GenerateStocksOnWarehousesReportRequest(

    @Schema(example = "null", required = true, description = "Идентификатор магазина.")
    @get:JsonProperty("campaignId", required = true) val campaignId: kotlin.Long,

    @Schema(example = "null", description = "Фильтр по идентификаторам складов (только модель FBY). Чтобы узнать идентификатор, воспользуйтесь запросом [GET warehouses](../../reference/warehouses/getFulfillmentWarehouses.md).")
    @get:JsonProperty("warehouseIds") val warehouseIds: kotlin.collections.List<kotlin.Long>? = null,

    @field:Valid
    @Schema(example = "null", description = "Фильтр по дате (для модели FBY). В отчет попадут данные за **предшествующий** дате день.")
    @get:JsonProperty("reportDate") val reportDate: java.time.LocalDate? = null,

    @Schema(example = "null", description = "Фильтр по категориям на Маркете (кроме модели FBY).")
    @get:JsonProperty("categoryIds") val categoryIds: kotlin.collections.List<kotlin.Long>? = null,

    @Schema(example = "null", description = "Фильтр по наличию остатков (кроме модели FBY).")
    @get:JsonProperty("hasStocks") val hasStocks: kotlin.Boolean? = null
    ) {

}

