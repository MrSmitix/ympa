package ympa_kotlin_spring_server.models

import java.util.Objects
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.annotation.JsonValue
import ympa_kotlin_spring_server.models.OrderItemModificationDTO
import ympa_kotlin_spring_server.models.OrderItemsModificationRequestReasonType
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
 * Запрос на обновление состава заказа.
 * @param items Список товаров в заказе.  Если магазин не передал информацию о товаре во входных данных, он будет удален из заказа.  Обязательный параметр. 
 * @param reason 
 */
data class UpdateOrderItemRequest(

    @field:Valid
    @get:Size(min=1)
    @Schema(example = "null", required = true, description = "Список товаров в заказе.  Если магазин не передал информацию о товаре во входных данных, он будет удален из заказа.  Обязательный параметр. ")
    @get:JsonProperty("items", required = true) val items: kotlin.collections.List<OrderItemModificationDTO>,

    @field:Valid
    @Schema(example = "null", description = "")
    @get:JsonProperty("reason") val reason: OrderItemsModificationRequestReasonType? = null
    ) {

}

