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
 * Информация о ярлыке для коробки.
 * @param url Соответствует URL, по которому выполняется запрос [GET campaigns/{campaignId}/orders/{orderId}/delivery/shipments/{shipmentId}/boxes/{boxId}/label](../../reference/orders/generateOrderLabel.md). 
 * @param supplierName Юридическое название магазина.
 * @param deliveryServiceName Юридическое название службы доставки.
 * @param orderId Идентификатор заказа в системе Маркета.
 * @param orderNum Идентификатор заказа в информационной системе магазина.  Совпадает с `orderId`, если Маркету неизвестен номер заказа в системе магазина. 
 * @param recipientName Фамилия и инициалы получателя заказа.
 * @param boxId Идентификатор коробки.
 * @param fulfilmentId Идентификатор коробки в информационной системе магазина.  Возвращается в формате: `номер заказа на Маркете-номер коробки`. Например, `7206821‑1`, `7206821‑2` и т. д. 
 * @param place Номер коробки в заказе. Возвращается в формате: `номер места/общее количество мест`. 
 * @param weight {% note warning \"\" %}  Этот параметр устарел. Не используйте его.  {% endnote %}  Общая масса всех товаров в заказе. Возвращается в формате: `weight кг`. 
 * @param deliveryServiceId Идентификатор службы доставки. Информацию о службе доставки можно получить с помощью запроса [GET delivery/services](../../reference/orders/getDeliveryServices.md).
 * @param deliveryAddress Адрес получателя.
 * @param shipmentDate Дата отгрузки в формате `dd.MM.yyyy`.
 */
data class ParcelBoxLabelDTO(

    @Schema(example = "null", required = true, description = "Соответствует URL, по которому выполняется запрос [GET campaigns/{campaignId}/orders/{orderId}/delivery/shipments/{shipmentId}/boxes/{boxId}/label](../../reference/orders/generateOrderLabel.md). ")
    @get:JsonProperty("url", required = true) val url: kotlin.String,

    @Schema(example = "null", required = true, description = "Юридическое название магазина.")
    @get:JsonProperty("supplierName", required = true) val supplierName: kotlin.String,

    @Schema(example = "null", required = true, description = "Юридическое название службы доставки.")
    @get:JsonProperty("deliveryServiceName", required = true) val deliveryServiceName: kotlin.String,

    @Schema(example = "null", required = true, description = "Идентификатор заказа в системе Маркета.")
    @get:JsonProperty("orderId", required = true) val orderId: kotlin.Long,

    @Schema(example = "null", required = true, description = "Идентификатор заказа в информационной системе магазина.  Совпадает с `orderId`, если Маркету неизвестен номер заказа в системе магазина. ")
    @get:JsonProperty("orderNum", required = true) val orderNum: kotlin.String,

    @Schema(example = "null", required = true, description = "Фамилия и инициалы получателя заказа.")
    @get:JsonProperty("recipientName", required = true) val recipientName: kotlin.String,

    @Schema(example = "null", required = true, description = "Идентификатор коробки.")
    @get:JsonProperty("boxId", required = true) val boxId: kotlin.Long,

    @Schema(example = "null", required = true, description = "Идентификатор коробки в информационной системе магазина.  Возвращается в формате: `номер заказа на Маркете-номер коробки`. Например, `7206821‑1`, `7206821‑2` и т. д. ")
    @get:JsonProperty("fulfilmentId", required = true) val fulfilmentId: kotlin.String,

    @Schema(example = "null", required = true, description = "Номер коробки в заказе. Возвращается в формате: `номер места/общее количество мест`. ")
    @get:JsonProperty("place", required = true) val place: kotlin.String,

    @Schema(example = "null", required = true, description = "{% note warning \"\" %}  Этот параметр устарел. Не используйте его.  {% endnote %}  Общая масса всех товаров в заказе. Возвращается в формате: `weight кг`. ")
    @get:JsonProperty("weight", required = true) val weight: kotlin.String,

    @Schema(example = "null", required = true, description = "Идентификатор службы доставки. Информацию о службе доставки можно получить с помощью запроса [GET delivery/services](../../reference/orders/getDeliveryServices.md).")
    @get:JsonProperty("deliveryServiceId", required = true) val deliveryServiceId: kotlin.String,

    @Schema(example = "null", description = "Адрес получателя.")
    @get:JsonProperty("deliveryAddress") val deliveryAddress: kotlin.String? = null,

    @Schema(example = "null", description = "Дата отгрузки в формате `dd.MM.yyyy`.")
    @get:JsonProperty("shipmentDate") val shipmentDate: kotlin.String? = null
    ) {

}

