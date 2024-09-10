package ympa_kotlin_spring_server.models

import java.util.Objects
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.annotation.JsonValue
import ympa_kotlin_spring_server.models.OrderStatsStatusType
import ympa_kotlin_spring_server.models.OrdersStatsCommissionDTO
import ympa_kotlin_spring_server.models.OrdersStatsDeliveryRegionDTO
import ympa_kotlin_spring_server.models.OrdersStatsItemDTO
import ympa_kotlin_spring_server.models.OrdersStatsOrderPaymentType
import ympa_kotlin_spring_server.models.OrdersStatsPaymentDTO
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
 * Информация о заказе.
 * @param items Список товаров в заказе после возможных изменений.
 * @param payments Информация о денежных переводах по заказу.
 * @param commissions Информация о комиссиях за заказ.
 * @param id Идентификатор заказа.
 * @param creationDate Дата создания заказа.  Формат даты: `ГГГГ-ММ-ДД`. 
 * @param statusUpdateDate Дата и время, когда статус заказа был изменен в последний раз.  Формат даты и времени: ISO 8601. Например, `2017-11-21T00:00:00`. Часовой пояс — UTC+03:00 (Москва). 
 * @param status 
 * @param partnerOrderId Идентификатор заказа в информационной системе магазина.
 * @param paymentType 
 * @param fake Тип заказа:  * `false` — настоящий заказ покупателя.  * `true` — [тестовый](../../pushapi/concepts/sandbox.md) заказ Маркета. 
 * @param deliveryRegion 
 * @param initialItems Список товаров в заказе до изменений.
 */
data class OrdersStatsOrderDTO(

    @field:Valid
    @Schema(example = "null", required = true, description = "Список товаров в заказе после возможных изменений.")
    @get:JsonProperty("items", required = true) val items: kotlin.collections.List<OrdersStatsItemDTO>,

    @field:Valid
    @Schema(example = "null", required = true, description = "Информация о денежных переводах по заказу.")
    @get:JsonProperty("payments", required = true) val payments: kotlin.collections.List<OrdersStatsPaymentDTO>,

    @field:Valid
    @Schema(example = "null", required = true, description = "Информация о комиссиях за заказ.")
    @get:JsonProperty("commissions", required = true) val commissions: kotlin.collections.List<OrdersStatsCommissionDTO>,

    @Schema(example = "null", description = "Идентификатор заказа.")
    @get:JsonProperty("id") val id: kotlin.Long? = null,

    @field:Valid
    @Schema(example = "null", description = "Дата создания заказа.  Формат даты: `ГГГГ-ММ-ДД`. ")
    @get:JsonProperty("creationDate") val creationDate: java.time.LocalDate? = null,

    @Schema(example = "null", description = "Дата и время, когда статус заказа был изменен в последний раз.  Формат даты и времени: ISO 8601. Например, `2017-11-21T00:00:00`. Часовой пояс — UTC+03:00 (Москва). ")
    @get:JsonProperty("statusUpdateDate") val statusUpdateDate: java.time.OffsetDateTime? = null,

    @field:Valid
    @Schema(example = "null", description = "")
    @get:JsonProperty("status") val status: OrderStatsStatusType? = null,

    @Schema(example = "null", description = "Идентификатор заказа в информационной системе магазина.")
    @get:JsonProperty("partnerOrderId") val partnerOrderId: kotlin.String? = null,

    @field:Valid
    @Schema(example = "null", description = "")
    @get:JsonProperty("paymentType") val paymentType: OrdersStatsOrderPaymentType? = null,

    @Schema(example = "null", description = "Тип заказа:  * `false` — настоящий заказ покупателя.  * `true` — [тестовый](../../pushapi/concepts/sandbox.md) заказ Маркета. ")
    @get:JsonProperty("fake") val fake: kotlin.Boolean? = null,

    @field:Valid
    @Schema(example = "null", description = "")
    @get:JsonProperty("deliveryRegion") val deliveryRegion: OrdersStatsDeliveryRegionDTO? = null,

    @field:Valid
    @Schema(example = "null", description = "Список товаров в заказе до изменений.")
    @get:JsonProperty("initialItems") val initialItems: kotlin.collections.List<OrdersStatsItemDTO>? = null
    ) {

}

