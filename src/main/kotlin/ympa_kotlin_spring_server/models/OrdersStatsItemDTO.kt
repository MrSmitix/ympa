package ympa_kotlin_spring_server.models

import java.util.Objects
import com.fasterxml.jackson.annotation.JsonProperty
import ympa_kotlin_spring_server.models.OrdersStatsDetailsDTO
import ympa_kotlin_spring_server.models.OrdersStatsPriceDTO
import ympa_kotlin_spring_server.models.OrdersStatsWarehouseDTO
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
 * Список товаров в заказе после возможных изменений.  В ходе обработки заказа Маркет может удалить из него единицы товаров — при проблемах на складе или по инициативе пользователя.  * Если из заказа удалены все единицы товара, его не будет в списке `items` — только в списке `initialItems`.  * Если в заказе осталась хотя бы одна единица товара, он будет и в списке `items` (с уменьшенным количеством единиц `count`), и в списке `initialItems` (с первоначальным количеством единиц `initialCount`). 
 * @param offerName Название товара.
 * @param marketSku SKU на Маркете.
 * @param shopSku Ваш SKU — идентификатор товара в вашей системе.  Разрешена любая последовательность длиной до 255 знаков.  Правила использования SKU:  * У каждого товара SKU должен быть свой.  * SKU товара нельзя менять — можно только удалить товар и добавить заново с новым SKU.  * Уже заданный SKU нельзя освободить и использовать заново для другого товара. Каждый товар должен получать новый идентификатор, до того никогда не использовавшийся в вашем каталоге.  [Что такое SKU и как его назначать](https://yandex.ru/support/marketplace/assortment/add/index.html#fields) 
 * @param count Количество единиц товара с учетом удаленных единиц.  Если из заказа удалены все единицы товара, он попадет только в список `initialItems`. 
 * @param prices Цена или скидки на товар.
 * @param warehouse 
 * @param details Информация об удалении товара из заказа.
 * @param cisList Список кодов идентификации товара [в системе «Честный ЗНАК»](https://честныйзнак.рф/).
 * @param initialCount Первоначальное количество единиц товара.
 * @param bidFee Списанная ставка ближайшего конкурента.  Указывается в процентах от стоимости товара и умножается на 100. Например, ставка 5% обозначается как 500. 
 * @param cofinanceThreshold Порог для скидок с Маркетом на момент оформления заказа. [Что это такое?](https://yandex.ru/support/marketplace/marketing/smart-pricing.html#sponsored-discounts)  Указан в рублях. Точность — два знака после запятой. 
 * @param cofinanceValue Скидка с Маркетом. [Что это такое?](https://yandex.ru/support/marketplace/marketing/smart-pricing.html#sponsored-discounts)  Указана в рублях. Точность — два знака после запятой. 
 */
data class OrdersStatsItemDTO(

    @Schema(example = "null", description = "Название товара.")
    @get:JsonProperty("offerName") val offerName: kotlin.String? = null,

    @Schema(example = "null", description = "SKU на Маркете.")
    @get:JsonProperty("marketSku") val marketSku: kotlin.Long? = null,

    @get:Pattern(regexp="^[^\\x00-\\x08\\x0A-\\x1f\\x7f]{1,255}$")
    @get:Size(min=1,max=255)
    @Schema(example = "null", description = "Ваш SKU — идентификатор товара в вашей системе.  Разрешена любая последовательность длиной до 255 знаков.  Правила использования SKU:  * У каждого товара SKU должен быть свой.  * SKU товара нельзя менять — можно только удалить товар и добавить заново с новым SKU.  * Уже заданный SKU нельзя освободить и использовать заново для другого товара. Каждый товар должен получать новый идентификатор, до того никогда не использовавшийся в вашем каталоге.  [Что такое SKU и как его назначать](https://yandex.ru/support/marketplace/assortment/add/index.html#fields) ")
    @get:JsonProperty("shopSku") val shopSku: kotlin.String? = null,

    @Schema(example = "null", description = "Количество единиц товара с учетом удаленных единиц.  Если из заказа удалены все единицы товара, он попадет только в список `initialItems`. ")
    @get:JsonProperty("count") val count: kotlin.Int? = null,

    @field:Valid
    @Schema(example = "null", description = "Цена или скидки на товар.")
    @get:JsonProperty("prices") val prices: kotlin.collections.List<OrdersStatsPriceDTO>? = null,

    @field:Valid
    @Schema(example = "null", description = "")
    @get:JsonProperty("warehouse") val warehouse: OrdersStatsWarehouseDTO? = null,

    @field:Valid
    @Schema(example = "null", description = "Информация об удалении товара из заказа.")
    @get:JsonProperty("details") val details: kotlin.collections.List<OrdersStatsDetailsDTO>? = null,

    @Schema(example = "null", description = "Список кодов идентификации товара [в системе «Честный ЗНАК»](https://честныйзнак.рф/).")
    @get:JsonProperty("cisList") val cisList: kotlin.collections.List<kotlin.String>? = null,

    @Schema(example = "null", description = "Первоначальное количество единиц товара.")
    @get:JsonProperty("initialCount") val initialCount: kotlin.Int? = null,

    @get:Min(0)
    @get:Max(10000)
    @Schema(example = "570", description = "Списанная ставка ближайшего конкурента.  Указывается в процентах от стоимости товара и умножается на 100. Например, ставка 5% обозначается как 500. ")
    @get:JsonProperty("bidFee") val bidFee: kotlin.Int? = null,

    @Schema(example = "null", description = "Порог для скидок с Маркетом на момент оформления заказа. [Что это такое?](https://yandex.ru/support/marketplace/marketing/smart-pricing.html#sponsored-discounts)  Указан в рублях. Точность — два знака после запятой. ")
    @get:JsonProperty("cofinanceThreshold") val cofinanceThreshold: java.math.BigDecimal? = null,

    @Schema(example = "null", description = "Скидка с Маркетом. [Что это такое?](https://yandex.ru/support/marketplace/marketing/smart-pricing.html#sponsored-discounts)  Указана в рублях. Точность — два знака после запятой. ")
    @get:JsonProperty("cofinanceValue") val cofinanceValue: java.math.BigDecimal? = null
    ) {

}

