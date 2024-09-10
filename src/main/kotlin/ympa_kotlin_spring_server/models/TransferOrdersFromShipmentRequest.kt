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
 * Запрос переноса заказов из отгрузки.
 * @param orderIds Список заказов, которые вы не успеваете подготовить.
 */
data class TransferOrdersFromShipmentRequest(

    @get:Size(min=1,max=500) 
    @Schema(example = "null", required = true, description = "Список заказов, которые вы не успеваете подготовить.")
    @get:JsonProperty("orderIds", required = true) val orderIds: kotlin.collections.List<kotlin.Long>
    ) {

}

