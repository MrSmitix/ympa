package ympa_kotlin_spring_server.models

import java.util.Objects
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.annotation.JsonValue
import ympa_kotlin_spring_server.models.OrderItemDetailDTO
import ympa_kotlin_spring_server.models.OrderItemInstanceDTO
import ympa_kotlin_spring_server.models.OrderItemInstanceType
import ympa_kotlin_spring_server.models.OrderItemPromoDTO
import ympa_kotlin_spring_server.models.OrderItemSubsidyDTO
import ympa_kotlin_spring_server.models.OrderVatType
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
 * Список товаров в заказе.
 * @param id Идентификатор товара в заказе.  Позволяет идентифицировать товар в рамках данного заказа. 
 * @param offerId Ваш SKU — идентификатор товара в вашей системе.  Разрешена любая последовательность длиной до 255 знаков.  Правила использования SKU:  * У каждого товара SKU должен быть свой.  * SKU товара нельзя менять — можно только удалить товар и добавить заново с новым SKU.  * Уже заданный SKU нельзя освободить и использовать заново для другого товара. Каждый товар должен получать новый идентификатор, до того никогда не использовавшийся в вашем каталоге.  [Что такое SKU и как его назначать](https://yandex.ru/support/marketplace/assortment/add/index.html#fields) 
 * @param offerName Название товара.
 * @param price Цена на товар в валюте заказа без учета вознаграждения партнеру за скидки по промокодам, купонам и акциям (параметр `subsidies`). 
 * @param buyerPrice Цена на товар в валюте покупателя. В цене уже учтены скидки по:  * акциям; * купонам; * промокодам. 
 * @param buyerPriceBeforeDiscount Стоимость товара в валюте покупателя до применения скидок по:  * акциям; * купонам; * промокодам. 
 * @param priceBeforeDiscount {% note warning \"\" %}  Этот параметр устарел.  {% endnote %}  Стоимость товара в валюте магазина до применения скидок. 
 * @param count Количество единиц товара.
 * @param vat 
 * @param shopSku Ваш SKU — идентификатор товара в вашей системе.  Разрешена любая последовательность длиной до 255 знаков.  Правила использования SKU:  * У каждого товара SKU должен быть свой.  * SKU товара нельзя менять — можно только удалить товар и добавить заново с новым SKU.  * Уже заданный SKU нельзя освободить и использовать заново для другого товара. Каждый товар должен получать новый идентификатор, до того никогда не использовавшийся в вашем каталоге.  [Что такое SKU и как его назначать](https://yandex.ru/support/marketplace/assortment/add/index.html#fields) 
 * @param subsidy {% note warning \"\" %}  Этот параметр устарел. Вместо него используйте `subsidies`.  {% endnote %}  Общее вознаграждение партнеру за DBS-доставку и все скидки на товар:  * по промокодам; * по купонам; * по баллам Плюса; * по акциям.  Передается в валюте заказа. 
 * @param partnerWarehouseId {% note warning \"\" %}  Этот параметр устарел. Не используйте его.  {% endnote %}  Идентификатор склада в системе партнера, на который сформирован заказ. 
 * @param promos Информация о вознаграждениях партнеру за скидки на товар по промокодам, купонам и акциям.
 * @param instances Информация о маркировке единиц товара.  Возвращаются данные для маркировки, переданные в запросе [PUT campaigns/{campaignId}/orders/{orderId}/cis](../../reference/orders/provideOrderItemCis.md).  Если магазин еще не передавал коды для этого заказа, `instances` отсутствует. 
 * @param details Информация об удалении товара из заказа. 
 * @param subsidies Список субсидий по типам.
 * @param requiredInstanceTypes Список необходимых маркировок товара.
 */
data class OrderItemDTO(

    @Schema(example = "null", description = "Идентификатор товара в заказе.  Позволяет идентифицировать товар в рамках данного заказа. ")
    @get:JsonProperty("id") val id: kotlin.Long? = null,

    @get:Pattern(regexp="^[^\\x00-\\x08\\x0A-\\x1f\\x7f]{1,255}$")
    @get:Size(min=1,max=255)
    @Schema(example = "null", description = "Ваш SKU — идентификатор товара в вашей системе.  Разрешена любая последовательность длиной до 255 знаков.  Правила использования SKU:  * У каждого товара SKU должен быть свой.  * SKU товара нельзя менять — можно только удалить товар и добавить заново с новым SKU.  * Уже заданный SKU нельзя освободить и использовать заново для другого товара. Каждый товар должен получать новый идентификатор, до того никогда не использовавшийся в вашем каталоге.  [Что такое SKU и как его назначать](https://yandex.ru/support/marketplace/assortment/add/index.html#fields) ")
    @get:JsonProperty("offerId") val offerId: kotlin.String? = null,

    @Schema(example = "null", description = "Название товара.")
    @get:JsonProperty("offerName") val offerName: kotlin.String? = null,

    @Schema(example = "null", description = "Цена на товар в валюте заказа без учета вознаграждения партнеру за скидки по промокодам, купонам и акциям (параметр `subsidies`). ")
    @get:JsonProperty("price") val price: java.math.BigDecimal? = null,

    @Schema(example = "null", description = "Цена на товар в валюте покупателя. В цене уже учтены скидки по:  * акциям; * купонам; * промокодам. ")
    @get:JsonProperty("buyerPrice") val buyerPrice: java.math.BigDecimal? = null,

    @Schema(example = "null", description = "Стоимость товара в валюте покупателя до применения скидок по:  * акциям; * купонам; * промокодам. ")
    @get:JsonProperty("buyerPriceBeforeDiscount") val buyerPriceBeforeDiscount: java.math.BigDecimal? = null,

    @Schema(example = "null", description = "{% note warning \"\" %}  Этот параметр устарел.  {% endnote %}  Стоимость товара в валюте магазина до применения скидок. ")
    @Deprecated(message = "")
    @get:JsonProperty("priceBeforeDiscount") val priceBeforeDiscount: java.math.BigDecimal? = null,

    @Schema(example = "null", description = "Количество единиц товара.")
    @get:JsonProperty("count") val count: kotlin.Int? = null,

    @field:Valid
    @Schema(example = "null", description = "")
    @get:JsonProperty("vat") val vat: OrderVatType? = null,

    @get:Pattern(regexp="^[^\\x00-\\x08\\x0A-\\x1f\\x7f]{1,255}$")
    @get:Size(min=1,max=255)
    @Schema(example = "null", description = "Ваш SKU — идентификатор товара в вашей системе.  Разрешена любая последовательность длиной до 255 знаков.  Правила использования SKU:  * У каждого товара SKU должен быть свой.  * SKU товара нельзя менять — можно только удалить товар и добавить заново с новым SKU.  * Уже заданный SKU нельзя освободить и использовать заново для другого товара. Каждый товар должен получать новый идентификатор, до того никогда не использовавшийся в вашем каталоге.  [Что такое SKU и как его назначать](https://yandex.ru/support/marketplace/assortment/add/index.html#fields) ")
    @get:JsonProperty("shopSku") val shopSku: kotlin.String? = null,

    @Schema(example = "null", description = "{% note warning \"\" %}  Этот параметр устарел. Вместо него используйте `subsidies`.  {% endnote %}  Общее вознаграждение партнеру за DBS-доставку и все скидки на товар:  * по промокодам; * по купонам; * по баллам Плюса; * по акциям.  Передается в валюте заказа. ")
    @Deprecated(message = "")
    @get:JsonProperty("subsidy") val subsidy: java.math.BigDecimal? = null,

    @Schema(example = "null", description = "{% note warning \"\" %}  Этот параметр устарел. Не используйте его.  {% endnote %}  Идентификатор склада в системе партнера, на который сформирован заказ. ")
    @Deprecated(message = "")
    @get:JsonProperty("partnerWarehouseId") val partnerWarehouseId: kotlin.String? = null,

    @field:Valid
    @Schema(example = "null", description = "Информация о вознаграждениях партнеру за скидки на товар по промокодам, купонам и акциям.")
    @get:JsonProperty("promos") val promos: kotlin.collections.List<OrderItemPromoDTO>? = null,

    @field:Valid
    @Schema(example = "null", description = "Информация о маркировке единиц товара.  Возвращаются данные для маркировки, переданные в запросе [PUT campaigns/{campaignId}/orders/{orderId}/cis](../../reference/orders/provideOrderItemCis.md).  Если магазин еще не передавал коды для этого заказа, `instances` отсутствует. ")
    @get:JsonProperty("instances") val instances: kotlin.collections.List<OrderItemInstanceDTO>? = null,

    @field:Valid
    @Schema(example = "null", description = "Информация об удалении товара из заказа. ")
    @get:JsonProperty("details") val details: kotlin.collections.List<OrderItemDetailDTO>? = null,

    @field:Valid
    @Schema(example = "null", description = "Список субсидий по типам.")
    @get:JsonProperty("subsidies") val subsidies: kotlin.collections.List<OrderItemSubsidyDTO>? = null,

    @field:Valid
    @Schema(example = "null", description = "Список необходимых маркировок товара.")
    @get:JsonProperty("requiredInstanceTypes") val requiredInstanceTypes: kotlin.collections.List<OrderItemInstanceType>? = null
    ) {

}

