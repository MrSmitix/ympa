package ympa_kotlin_spring_server.models

import java.util.Objects
import com.fasterxml.jackson.annotation.JsonProperty
import ympa_kotlin_spring_server.models.BriefOrderItemInstanceDTO
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
 * Позиция в корзине, требующая маркировки.
 * @param id Идентификатор товара в заказе.  Он приходит в ответе на запрос [GET campaigns/{campaignId}/orders/{orderId}](../../reference/orders/getOrder.md) и в запросе Маркета [POST order/accept](../../pushapi/reference/orderAccept.md) — параметр `id` в `items`. 
 * @param instances Список кодов маркировки единиц товара. 
 */
data class OrderItemInstanceModificationDTO(

    @Schema(example = "null", required = true, description = "Идентификатор товара в заказе.  Он приходит в ответе на запрос [GET campaigns/{campaignId}/orders/{orderId}](../../reference/orders/getOrder.md) и в запросе Маркета [POST order/accept](../../pushapi/reference/orderAccept.md) — параметр `id` в `items`. ")
    @get:JsonProperty("id", required = true) val id: kotlin.Long,

    @field:Valid
    @Schema(example = "null", required = true, description = "Список кодов маркировки единиц товара. ")
    @get:JsonProperty("instances", required = true) val instances: kotlin.collections.List<BriefOrderItemInstanceDTO>
    ) {

}

