package ympa_kotlin_spring_server.models

import java.util.Objects
import com.fasterxml.jackson.annotation.JsonProperty
import ympa_kotlin_spring_server.models.ScrollingPagerDTO
import ympa_kotlin_spring_server.models.WarehouseOffersDTO
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
 * Список складов с информацией об остатках на каждом из них.
 * @param warehouses Страница списка складов.
 * @param paging 
 */
data class GetWarehouseStocksDTO(

    @field:Valid
    @Schema(example = "null", required = true, description = "Страница списка складов.")
    @get:JsonProperty("warehouses", required = true) val warehouses: kotlin.collections.List<WarehouseOffersDTO>,

    @field:Valid
    @Schema(example = "null", description = "")
    @get:JsonProperty("paging") val paging: ScrollingPagerDTO? = null
    ) {

}

