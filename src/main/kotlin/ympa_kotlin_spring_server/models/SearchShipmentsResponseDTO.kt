package ympa_kotlin_spring_server.models

import java.util.Objects
import com.fasterxml.jackson.annotation.JsonProperty
import ympa_kotlin_spring_server.models.ForwardScrollingPagerDTO
import ympa_kotlin_spring_server.models.ShipmentInfoDTO
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
 * Информация об отгрузках.
 * @param shipments Список с информацией об отгрузках.
 * @param paging 
 */
data class SearchShipmentsResponseDTO(

    @field:Valid
    @Schema(example = "null", required = true, description = "Список с информацией об отгрузках.")
    @get:JsonProperty("shipments", required = true) val shipments: kotlin.collections.List<ShipmentInfoDTO>,

    @field:Valid
    @Schema(example = "null", description = "")
    @get:JsonProperty("paging") val paging: ForwardScrollingPagerDTO? = null
    ) {

}

