package ympa_kotlin_spring_server.models

import java.util.Objects
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.annotation.JsonValue
import ympa_kotlin_spring_server.models.OrderStatusType
import ympa_kotlin_spring_server.models.OrderSubstatusType
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
 * Информация по заказу.
 * @param id Идентификатор заказа.
 * @param status 
 * @param substatus 
 */
data class OrderStateDTO(

    @Schema(example = "null", required = true, description = "Идентификатор заказа.")
    @get:JsonProperty("id", required = true) val id: kotlin.Long,

    @field:Valid
    @Schema(example = "null", required = true, description = "")
    @get:JsonProperty("status", required = true) val status: OrderStatusType,

    @field:Valid
    @Schema(example = "null", description = "")
    @get:JsonProperty("substatus") val substatus: OrderSubstatusType? = null
    ) {

}

