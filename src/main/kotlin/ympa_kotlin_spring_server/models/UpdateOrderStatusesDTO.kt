package ympa_kotlin_spring_server.models

import java.util.Objects
import com.fasterxml.jackson.annotation.JsonProperty
import ympa_kotlin_spring_server.models.UpdateOrderStatusDTO
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
 * Список заказов, статус которых обновился.
 * @param orders Список с обновленными заказами.
 */
data class UpdateOrderStatusesDTO(

    @field:Valid
    @Schema(example = "null", required = true, description = "Список с обновленными заказами.")
    @get:JsonProperty("orders", required = true) val orders: kotlin.collections.List<UpdateOrderStatusDTO>
    ) {

}

