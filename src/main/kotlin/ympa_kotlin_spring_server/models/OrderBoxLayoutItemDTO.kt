package ympa_kotlin_spring_server.models

import java.util.Objects
import com.fasterxml.jackson.annotation.JsonProperty
import ympa_kotlin_spring_server.models.BriefOrderItemInstanceDTO
import ympa_kotlin_spring_server.models.OrderBoxLayoutPartialCountDTO
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
 * Информация о товаре в коробке.
 * @param id Идентификатор товара в заказе.  {% cut \"Где его взять\" %}  Идентификатор приходит в ответе на запрос [GET campaigns/{campaignId}/orders/{orderId}](../../reference/orders/getOrder.md) и в запросе Маркета [POST order/accept](../../pushapi/reference/orderAccept.md) — параметр `id` в `items`.  {% endcut %}   
 * @param fullCount Количество единиц товара в коробке.  Используйте это поле, если в коробке поедут целые товары, не разделенные на части. Не используйте это поле одновременно с `partialCount`. 
 * @param partialCount 
 * @param instances Переданные вами коды маркировки.
 */
data class OrderBoxLayoutItemDTO(

    @Schema(example = "null", required = true, description = "Идентификатор товара в заказе.  {% cut \"Где его взять\" %}  Идентификатор приходит в ответе на запрос [GET campaigns/{campaignId}/orders/{orderId}](../../reference/orders/getOrder.md) и в запросе Маркета [POST order/accept](../../pushapi/reference/orderAccept.md) — параметр `id` в `items`.  {% endcut %}   ")
    @get:JsonProperty("id", required = true) val id: kotlin.Long,

    @get:Min(1)
    @Schema(example = "null", description = "Количество единиц товара в коробке.  Используйте это поле, если в коробке поедут целые товары, не разделенные на части. Не используйте это поле одновременно с `partialCount`. ")
    @get:JsonProperty("fullCount") val fullCount: kotlin.Int? = null,

    @field:Valid
    @Schema(example = "null", description = "")
    @get:JsonProperty("partialCount") val partialCount: OrderBoxLayoutPartialCountDTO? = null,

    @field:Valid
    @Schema(example = "null", description = "Переданные вами коды маркировки.")
    @get:JsonProperty("instances") val instances: kotlin.collections.List<BriefOrderItemInstanceDTO>? = null
    ) {

}

