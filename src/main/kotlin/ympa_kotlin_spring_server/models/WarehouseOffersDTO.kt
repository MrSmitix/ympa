package ympa_kotlin_spring_server.models

import java.util.Objects
import com.fasterxml.jackson.annotation.JsonProperty
import ympa_kotlin_spring_server.models.WarehouseOfferDTO
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
 * Информация об остатках товаров на складе.
 * @param warehouseId Идентификатор склада.
 * @param offers Информация об остатках.
 */
data class WarehouseOffersDTO(

    @Schema(example = "null", required = true, description = "Идентификатор склада.")
    @get:JsonProperty("warehouseId", required = true) val warehouseId: kotlin.Long,

    @field:Valid
    @Schema(example = "null", required = true, description = "Информация об остатках.")
    @get:JsonProperty("offers", required = true) val offers: kotlin.collections.List<WarehouseOfferDTO>
    ) {

}

