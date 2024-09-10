package ympa_kotlin_spring_server.models

import java.util.Objects
import com.fasterxml.jackson.annotation.JsonProperty
import ympa_kotlin_spring_server.models.BidRecommendationItemDTO
import ympa_kotlin_spring_server.models.PriceRecommendationItemDTO
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
 * Список товаров с рекомендованными ставками.
 * @param sku Ваш SKU — идентификатор товара в вашей системе.  Разрешена любая последовательность длиной до 255 знаков.  Правила использования SKU:  * У каждого товара SKU должен быть свой.  * SKU товара нельзя менять — можно только удалить товар и добавить заново с новым SKU.  * Уже заданный SKU нельзя освободить и использовать заново для другого товара. Каждый товар должен получать новый идентификатор, до того никогда не использовавшийся в вашем каталоге.  [Что такое SKU и как его назначать](https://yandex.ru/support/marketplace/assortment/add/index.html#fields) 
 * @param bid Значение ставки.
 * @param bidRecommendations Список рекомендованных ставок с соответствующими долями показов. Чем больше ставка, тем большую долю показов она помогает получить. 
 * @param priceRecommendations Рекомендованные цены.
 */
data class SkuBidRecommendationItemDTO(

    @get:Pattern(regexp="^[^\\x00-\\x08\\x0A-\\x1f\\x7f]{1,255}$")
    @get:Size(min=1,max=255)
    @Schema(example = "null", required = true, description = "Ваш SKU — идентификатор товара в вашей системе.  Разрешена любая последовательность длиной до 255 знаков.  Правила использования SKU:  * У каждого товара SKU должен быть свой.  * SKU товара нельзя менять — можно только удалить товар и добавить заново с новым SKU.  * Уже заданный SKU нельзя освободить и использовать заново для другого товара. Каждый товар должен получать новый идентификатор, до того никогда не использовавшийся в вашем каталоге.  [Что такое SKU и как его назначать](https://yandex.ru/support/marketplace/assortment/add/index.html#fields) ")
    @get:JsonProperty("sku", required = true) val sku: kotlin.String,

    @get:Min(0)
    @get:Max(9999)
    @Schema(example = "570", required = true, description = "Значение ставки.")
    @get:JsonProperty("bid", required = true) val bid: kotlin.Int,

    @field:Valid
    @Schema(example = "null", description = "Список рекомендованных ставок с соответствующими долями показов. Чем больше ставка, тем большую долю показов она помогает получить. ")
    @get:JsonProperty("bidRecommendations") val bidRecommendations: kotlin.collections.List<BidRecommendationItemDTO>? = null,

    @field:Valid
    @Schema(example = "null", description = "Рекомендованные цены.")
    @get:JsonProperty("priceRecommendations") val priceRecommendations: kotlin.collections.List<PriceRecommendationItemDTO>? = null
    ) {

}

