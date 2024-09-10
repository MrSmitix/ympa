package ympa_kotlin_spring_server.models

import java.util.Objects
import com.fasterxml.jackson.annotation.JsonProperty
import ympa_kotlin_spring_server.models.FulfillmentWarehouseDTO
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
 * Список складов Маркета (FBY).
 * @param warehouses Список складов Маркета (FBY).
 */
data class FulfillmentWarehousesDTO(

    @field:Valid
    @Schema(example = "null", required = true, description = "Список складов Маркета (FBY).")
    @get:JsonProperty("warehouses", required = true) val warehouses: kotlin.collections.List<FulfillmentWarehouseDTO>
    ) {

}

