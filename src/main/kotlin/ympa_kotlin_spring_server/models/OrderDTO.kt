package ympa_kotlin_spring_server.models

import java.util.Objects
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.annotation.JsonValue
import ympa_kotlin_spring_server.models.CurrencyType
import ympa_kotlin_spring_server.models.OrderBuyerDTO
import ympa_kotlin_spring_server.models.OrderDeliveryDTO
import ympa_kotlin_spring_server.models.OrderItemDTO
import ympa_kotlin_spring_server.models.OrderPaymentMethodType
import ympa_kotlin_spring_server.models.OrderPaymentType
import ympa_kotlin_spring_server.models.OrderStatusType
import ympa_kotlin_spring_server.models.OrderSubsidyDTO
import ympa_kotlin_spring_server.models.OrderSubstatusType
import ympa_kotlin_spring_server.models.OrderTaxSystemType
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
 * Заказ.
 * @param items Список товаров в заказе.
 * @param id Идентификатор заказа.
 * @param status 
 * @param substatus 
 * @param creationDate 
 * @param updatedAt 
 * @param currency 
 * @param itemsTotal Платеж покупателя. 
 * @param deliveryTotal Стоимость доставки. 
 * @param buyerItemsTotal {% note warning \"\" %}  Этот параметр устарел.  {% endnote %}  Стоимость всех товаров в заказе в валюте покупателя после применения скидок и без учета стоимости доставки. 
 * @param buyerTotal {% note warning \"\" %}  Этот параметр устарел.  {% endnote %}  Стоимость всех товаров в заказе в валюте покупателя после применения скидок и с учетом стоимости доставки. 
 * @param buyerItemsTotalBeforeDiscount Стоимость всех товаров в заказе в валюте покупателя без учета стоимости доставки и до применения скидок по:  * акциям; * купонам; * промокодам. 
 * @param buyerTotalBeforeDiscount {% note warning \"\" %}  Этот параметр устарел.  {% endnote %}  Стоимость всех товаров в заказе в валюте покупателя до применения скидок и с учетом стоимости доставки (`buyerItemsTotalBeforeDiscount` + стоимость доставки). 
 * @param paymentType 
 * @param paymentMethod 
 * @param fake Тип заказа:  * `false` — настоящий заказ покупателя.  * `true` — [тестовый](../../pushapi/concepts/sandbox.md) заказ Маркета. 
 * @param subsidies Список субсидий по типам.
 * @param delivery 
 * @param buyer 
 * @param notes Комментарий к заказу.
 * @param taxSystem 
 * @param cancelRequested **Только для модели DBS**  Запрошена ли отмена. 
 * @param expiryDate 
 */
data class OrderDTO(

    @field:Valid
    @Schema(example = "null", required = true, description = "Список товаров в заказе.")
    @get:JsonProperty("items", required = true) val items: kotlin.collections.List<OrderItemDTO>,

    @Schema(example = "null", description = "Идентификатор заказа.")
    @get:JsonProperty("id") val id: kotlin.Long? = null,

    @field:Valid
    @Schema(example = "null", description = "")
    @get:JsonProperty("status") val status: OrderStatusType? = null,

    @field:Valid
    @Schema(example = "null", description = "")
    @get:JsonProperty("substatus") val substatus: OrderSubstatusType? = null,

    @Schema(example = "23-09-2022 09:12:41", description = "")
    @get:JsonProperty("creationDate") val creationDate: kotlin.String? = null,

    @Schema(example = "23-09-2022 09:12:41", description = "")
    @get:JsonProperty("updatedAt") val updatedAt: kotlin.String? = null,

    @field:Valid
    @Schema(example = "null", description = "")
    @get:JsonProperty("currency") val currency: CurrencyType? = null,

    @Schema(example = "null", description = "Платеж покупателя. ")
    @get:JsonProperty("itemsTotal") val itemsTotal: java.math.BigDecimal? = null,

    @Schema(example = "null", description = "Стоимость доставки. ")
    @get:JsonProperty("deliveryTotal") val deliveryTotal: java.math.BigDecimal? = null,

    @Schema(example = "null", description = "{% note warning \"\" %}  Этот параметр устарел.  {% endnote %}  Стоимость всех товаров в заказе в валюте покупателя после применения скидок и без учета стоимости доставки. ")
    @Deprecated(message = "")
    @get:JsonProperty("buyerItemsTotal") val buyerItemsTotal: java.math.BigDecimal? = null,

    @Schema(example = "null", description = "{% note warning \"\" %}  Этот параметр устарел.  {% endnote %}  Стоимость всех товаров в заказе в валюте покупателя после применения скидок и с учетом стоимости доставки. ")
    @Deprecated(message = "")
    @get:JsonProperty("buyerTotal") val buyerTotal: java.math.BigDecimal? = null,

    @Schema(example = "null", description = "Стоимость всех товаров в заказе в валюте покупателя без учета стоимости доставки и до применения скидок по:  * акциям; * купонам; * промокодам. ")
    @get:JsonProperty("buyerItemsTotalBeforeDiscount") val buyerItemsTotalBeforeDiscount: java.math.BigDecimal? = null,

    @Schema(example = "null", description = "{% note warning \"\" %}  Этот параметр устарел.  {% endnote %}  Стоимость всех товаров в заказе в валюте покупателя до применения скидок и с учетом стоимости доставки (`buyerItemsTotalBeforeDiscount` + стоимость доставки). ")
    @Deprecated(message = "")
    @get:JsonProperty("buyerTotalBeforeDiscount") val buyerTotalBeforeDiscount: java.math.BigDecimal? = null,

    @field:Valid
    @Schema(example = "null", description = "")
    @get:JsonProperty("paymentType") val paymentType: OrderPaymentType? = null,

    @field:Valid
    @Schema(example = "null", description = "")
    @get:JsonProperty("paymentMethod") val paymentMethod: OrderPaymentMethodType? = null,

    @Schema(example = "null", description = "Тип заказа:  * `false` — настоящий заказ покупателя.  * `true` — [тестовый](../../pushapi/concepts/sandbox.md) заказ Маркета. ")
    @get:JsonProperty("fake") val fake: kotlin.Boolean? = null,

    @field:Valid
    @Schema(example = "null", description = "Список субсидий по типам.")
    @get:JsonProperty("subsidies") val subsidies: kotlin.collections.List<OrderSubsidyDTO>? = null,

    @field:Valid
    @Schema(example = "null", description = "")
    @get:JsonProperty("delivery") val delivery: OrderDeliveryDTO? = null,

    @field:Valid
    @Schema(example = "null", description = "")
    @get:JsonProperty("buyer") val buyer: OrderBuyerDTO? = null,

    @Schema(example = "null", description = "Комментарий к заказу.")
    @get:JsonProperty("notes") val notes: kotlin.String? = null,

    @field:Valid
    @Schema(example = "null", description = "")
    @get:JsonProperty("taxSystem") val taxSystem: OrderTaxSystemType? = null,

    @Schema(example = "null", description = "**Только для модели DBS**  Запрошена ли отмена. ")
    @get:JsonProperty("cancelRequested") val cancelRequested: kotlin.Boolean? = null,

    @Schema(example = "23-09-2022 09:12:41", description = "")
    @get:JsonProperty("expiryDate") val expiryDate: kotlin.String? = null
    ) {

}

