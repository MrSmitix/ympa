package ympa_kotlin_spring_server.models

import java.util.Objects
import com.fasterxml.jackson.annotation.JsonProperty
import ympa_kotlin_spring_server.models.WarehouseDTO
import ympa_kotlin_spring_server.models.WarehouseGroupDTO
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
 * Информация о складах и группах складов.
 * @param warehouses Список складов, не входящих в группы.
 * @param warehouseGroups Список групп складов.
 */
data class WarehousesDTO(

    @field:Valid
    @Schema(example = "null", required = true, description = "Список складов, не входящих в группы.")
    @get:JsonProperty("warehouses", required = true) val warehouses: kotlin.collections.List<WarehouseDTO>,

    @field:Valid
    @Schema(example = "null", required = true, description = "Список групп складов.")
    @get:JsonProperty("warehouseGroups", required = true) val warehouseGroups: kotlin.collections.List<WarehouseGroupDTO>
    ) {

}

