package ympa_kotlin_spring_server.models

import java.util.Objects
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.annotation.JsonValue
import ympa_kotlin_spring_server.models.OrderItemStatusType
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
 * Детали по товару в заказе.
 * @param itemCount Количество единиц товара.
 * @param itemStatus 
 * @param updateDate Формат даты: `ДД-ММ-ГГГГ`. 
 */
data class OrderItemDetailDTO(

    @Schema(example = "null", description = "Количество единиц товара.")
    @get:JsonProperty("itemCount") val itemCount: kotlin.Long? = null,

    @field:Valid
    @Schema(example = "null", description = "")
    @get:JsonProperty("itemStatus") val itemStatus: OrderItemStatusType? = null,

    @Schema(example = "23-09-2022", description = "Формат даты: `ДД-ММ-ГГГГ`. ")
    @get:JsonProperty("updateDate") val updateDate: kotlin.String? = null
    ) {

}

