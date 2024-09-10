package ympa_kotlin_spring_server.models

import java.util.Objects
import com.fasterxml.jackson.annotation.JsonProperty
import ympa_kotlin_spring_server.models.GoodsStatsWarehouseDTO
import ympa_kotlin_spring_server.models.GoodsStatsWeightDimensionsDTO
import ympa_kotlin_spring_server.models.TariffDTO
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
 * Информация о товаре.
 * @param shopSku Ваш SKU — идентификатор товара в вашей системе.  Разрешена любая последовательность длиной до 255 знаков.  Правила использования SKU:  * У каждого товара SKU должен быть свой.  * SKU товара нельзя менять — можно только удалить товар и добавить заново с новым SKU.  * Уже заданный SKU нельзя освободить и использовать заново для другого товара. Каждый товар должен получать новый идентификатор, до того никогда не использовавшийся в вашем каталоге.  [Что такое SKU и как его назначать](https://yandex.ru/support/marketplace/assortment/add/index.html#fields) 
 * @param marketSku SKU на Маркете.
 * @param name Название товара.
 * @param price Цена на товар в валюте, которая установлена [в кабинете продавца на Маркете](https://partner.market.yandex.ru/).
 * @param categoryId Идентификатор категории товара на Маркете.
 * @param categoryName Название категории товара на Маркете.
 * @param weightDimensions 
 * @param warehouses Информация о складах, на которых хранится товар.  Параметр не приходит, если товара нет ни на одном складе. 
 * @param tariffs Информация о тарифах, по которым нужно заплатить за услуги Маркета.  По некоторым услугам могут возвращаться несколько разных стоимостей. Например, в модели FBS стоимость услуги `SORTING` (обработка заказа) зависит от способа отгрузки и количества заказов в отгрузке. Подробнее о тарифах на услуги читайте [в Справке Маркета для продавцов](https://yandex.ru/support2/marketplace/ru/introduction/rates/models/). 
 * @param pictures Ссылки (URL) изображений товара в хорошем качестве.
 */
data class GoodsStatsGoodsDTO(

    @get:Pattern(regexp="^[^\\x00-\\x08\\x0A-\\x1f\\x7f]{1,255}$")
    @get:Size(min=1,max=255)
    @Schema(example = "null", description = "Ваш SKU — идентификатор товара в вашей системе.  Разрешена любая последовательность длиной до 255 знаков.  Правила использования SKU:  * У каждого товара SKU должен быть свой.  * SKU товара нельзя менять — можно только удалить товар и добавить заново с новым SKU.  * Уже заданный SKU нельзя освободить и использовать заново для другого товара. Каждый товар должен получать новый идентификатор, до того никогда не использовавшийся в вашем каталоге.  [Что такое SKU и как его назначать](https://yandex.ru/support/marketplace/assortment/add/index.html#fields) ")
    @get:JsonProperty("shopSku") val shopSku: kotlin.String? = null,

    @Schema(example = "null", description = "SKU на Маркете.")
    @get:JsonProperty("marketSku") val marketSku: kotlin.Long? = null,

    @Schema(example = "null", description = "Название товара.")
    @get:JsonProperty("name") val name: kotlin.String? = null,

    @Schema(example = "null", description = "Цена на товар в валюте, которая установлена [в кабинете продавца на Маркете](https://partner.market.yandex.ru/).")
    @get:JsonProperty("price") val price: java.math.BigDecimal? = null,

    @Schema(example = "null", description = "Идентификатор категории товара на Маркете.")
    @get:JsonProperty("categoryId") val categoryId: kotlin.Long? = null,

    @Schema(example = "null", description = "Название категории товара на Маркете.")
    @get:JsonProperty("categoryName") val categoryName: kotlin.String? = null,

    @field:Valid
    @Schema(example = "null", description = "")
    @get:JsonProperty("weightDimensions") val weightDimensions: GoodsStatsWeightDimensionsDTO? = null,

    @field:Valid
    @Schema(example = "null", description = "Информация о складах, на которых хранится товар.  Параметр не приходит, если товара нет ни на одном складе. ")
    @get:JsonProperty("warehouses") val warehouses: kotlin.collections.List<GoodsStatsWarehouseDTO>? = null,

    @field:Valid
    @Schema(example = "null", description = "Информация о тарифах, по которым нужно заплатить за услуги Маркета.  По некоторым услугам могут возвращаться несколько разных стоимостей. Например, в модели FBS стоимость услуги `SORTING` (обработка заказа) зависит от способа отгрузки и количества заказов в отгрузке. Подробнее о тарифах на услуги читайте [в Справке Маркета для продавцов](https://yandex.ru/support2/marketplace/ru/introduction/rates/models/). ")
    @get:JsonProperty("tariffs") val tariffs: kotlin.collections.List<TariffDTO>? = null,

    @Schema(example = "null", description = "Ссылки (URL) изображений товара в хорошем качестве.")
    @get:JsonProperty("pictures") val pictures: kotlin.collections.List<kotlin.String>? = null
    ) {

}

