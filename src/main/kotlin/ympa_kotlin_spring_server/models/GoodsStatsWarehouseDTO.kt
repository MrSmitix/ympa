package ympa_kotlin_spring_server.models

import java.util.Objects
import com.fasterxml.jackson.annotation.JsonProperty
import ympa_kotlin_spring_server.models.WarehouseStockDTO
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
 * Информация о складе.
 * @param stocks Информация об остатках товаров на складе.
 * @param id Идентификатор склада.
 * @param name Название склада.
 */
data class GoodsStatsWarehouseDTO(

    @field:Valid
    @Schema(example = "null", required = true, description = "Информация об остатках товаров на складе.")
    @get:JsonProperty("stocks", required = true) val stocks: kotlin.collections.List<WarehouseStockDTO>,

    @Schema(example = "null", description = "Идентификатор склада.")
    @get:JsonProperty("id") val id: kotlin.Long? = null,

    @Schema(example = "null", description = "Название склада.")
    @get:JsonProperty("name") val name: kotlin.String? = null
    ) {

}

