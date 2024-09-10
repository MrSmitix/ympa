package ympa_kotlin_spring_server.models

import java.util.Objects
import com.fasterxml.jackson.annotation.JsonProperty
import ympa_kotlin_spring_server.models.ShipmentActionType
import ympa_kotlin_spring_server.models.ShipmentStatusChangeDTO
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
 * Информация об отгрузке.
 * @param availableActions Доступные действия над отгрузкой.
 * @param currentStatus 
 */
data class ExtensionShipmentDTO(

    @field:Valid
    @Schema(example = "null", required = true, description = "Доступные действия над отгрузкой.")
    @get:JsonProperty("availableActions", required = true) val availableActions: kotlin.collections.Set<ShipmentActionType>,

    @field:Valid
    @Schema(example = "null", description = "")
    @get:JsonProperty("currentStatus") val currentStatus: ShipmentStatusChangeDTO? = null
    ) {

}

