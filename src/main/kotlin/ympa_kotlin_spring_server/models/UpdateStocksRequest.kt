package ympa_kotlin_spring_server.models

import java.util.Objects
import com.fasterxml.jackson.annotation.JsonProperty
import ympa_kotlin_spring_server.models.UpdateStockDTO
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
 * Запрос на изменение информации по остаткам товаров.
 * @param skus Данные об остатках товаров. 
 */
data class UpdateStocksRequest(

    @field:Valid
    @get:Size(min=1,max=2000) 
    @Schema(example = "null", required = true, description = "Данные об остатках товаров. ")
    @get:JsonProperty("skus", required = true) val skus: kotlin.collections.Set<UpdateStockDTO>
    ) {

}

