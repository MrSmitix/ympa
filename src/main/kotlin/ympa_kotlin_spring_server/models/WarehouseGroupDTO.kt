package ympa_kotlin_spring_server.models

import java.util.Objects
import com.fasterxml.jackson.annotation.JsonProperty
import ympa_kotlin_spring_server.models.WarehouseDTO
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
 * Информация о группе складов.
 * @param name Название группы складов.
 * @param mainWarehouse 
 * @param warehouses Список складов, входящих в группу.
 */
data class WarehouseGroupDTO(

    @Schema(example = "null", required = true, description = "Название группы складов.")
    @get:JsonProperty("name", required = true) val name: kotlin.String,

    @field:Valid
    @Schema(example = "null", required = true, description = "")
    @get:JsonProperty("mainWarehouse", required = true) val mainWarehouse: WarehouseDTO,

    @field:Valid
    @Schema(example = "null", required = true, description = "Список складов, входящих в группу.")
    @get:JsonProperty("warehouses", required = true) val warehouses: kotlin.collections.List<WarehouseDTO>
    ) {

}

