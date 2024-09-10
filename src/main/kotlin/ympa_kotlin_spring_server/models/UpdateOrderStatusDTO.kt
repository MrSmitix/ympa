package ympa_kotlin_spring_server.models

import java.util.Objects
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.annotation.JsonValue
import ympa_kotlin_spring_server.models.OrderStatusType
import ympa_kotlin_spring_server.models.OrderSubstatusType
import ympa_kotlin_spring_server.models.OrderUpdateStatusType
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
 * Список заказов.
 * @param id Идентификатор заказа.
 * @param status 
 * @param substatus 
 * @param updateStatus 
 * @param errorDetails Ошибка при изменении статуса заказа. Содержит описание ошибки и идентификатор заказа.  Возвращается, если параметр `updateStatus` принимает значение `ERROR`. 
 */
data class UpdateOrderStatusDTO(

    @Schema(example = "null", description = "Идентификатор заказа.")
    @get:JsonProperty("id") val id: kotlin.Long? = null,

    @field:Valid
    @Schema(example = "null", description = "")
    @get:JsonProperty("status") val status: OrderStatusType? = null,

    @field:Valid
    @Schema(example = "null", description = "")
    @get:JsonProperty("substatus") val substatus: OrderSubstatusType? = null,

    @field:Valid
    @Schema(example = "null", description = "")
    @get:JsonProperty("updateStatus") val updateStatus: OrderUpdateStatusType? = null,

    @Schema(example = "null", description = "Ошибка при изменении статуса заказа. Содержит описание ошибки и идентификатор заказа.  Возвращается, если параметр `updateStatus` принимает значение `ERROR`. ")
    @get:JsonProperty("errorDetails") val errorDetails: kotlin.String? = null
    ) {

}

