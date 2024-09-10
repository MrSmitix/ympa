package ympa_kotlin_spring_server.models

import java.util.Objects
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.annotation.JsonValue
import ympa_kotlin_spring_server.models.CurrencyType
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
 * Предложение.
 * @param modelId Идентификатор модели Маркета, с которой соотнесено предложение.  Если предложение не соотнесено ни с какой карточкой модели, то параметр `modelid` содержит значение `0`.  {% note info %}  Идентификатор модели присутствует в URL карточки модели в виде значения параметра `product`. Например: `https://market.yandex.ru/product/13584121`.  {% endnote %} 
 * @param price Цена предложения.  До версии 2.0 партнерского API у параметра был тип String. 
 * @param feedId Идентификатор прайс-листа, содержащего предложение.  Параметр доступен начиная с версии 2.0 партнерского API. 
 * @param id Идентификатор предложения из прайс-листа.  Параметр выводится, если в прайс-листе задан уникальный идентификатор. Если в прайс-листе содержится несколько предложений с одинаковыми идентификаторами, параметр `id` указывается только для первого из них, для остальных параметры `id` и `feedId` не выводятся.  Параметр доступен начиная с версии 2.0 партнерского API. 
 * @param shopCategoryId Идентификатор категории предложения, указанный магазином в прайс-листе.  Параметр выводится только для предложений, у которых указана категория в прайс-листе.  Параметр доступен начиная с версии 2.0 партнерского API. 
 * @param marketCategoryId Идентификатор категории предложения в дереве категорий Маркета. Параметр доступен начиная с версии 2.0 партнерского API. 
 * @param preDiscountPrice Цена предложения без скидки.
 * @param discount Скидка на предложение в процентах.
 * @param cutPrice Является ли предложение уцененным:  * `true` — да. * `false` — нет.  Параметр доступен начиная с версии 2.58 партнерского API. 
 * @param url URL-адрес предложения на сайте магазина.
 * @param name Наименование предложения.
 * @param currency 
 * @param bid {% note warning \"\" %}  Этот параметр устарел. Не используйте его.  {% endnote %}  Ставка на клик. 
 * @param cbid {% note warning \"\" %}  Этот параметр устарел. Не используйте его.  {% endnote %}  Ставка на клик. 
 * @param fee {% note warning \"\" %}  Этот параметр устарел. Не используйте его.  {% endnote %}  Процент комиссии на товар при продаже по CPA. 
 * @param blocked Признак блокировки предложения. Возможные значения: * `false` — предложение активно, параметр не выводится. * `true` — предложение заблокировано. Параметр выводится, если предложение заблокировано и не попадает в выдачу Маркета. Это может произойти из-за отключения магазина. 
 */
data class OfferDTO(

    @Schema(example = "null", required = true, description = "Идентификатор модели Маркета, с которой соотнесено предложение.  Если предложение не соотнесено ни с какой карточкой модели, то параметр `modelid` содержит значение `0`.  {% note info %}  Идентификатор модели присутствует в URL карточки модели в виде значения параметра `product`. Например: `https://market.yandex.ru/product/13584121`.  {% endnote %} ")
    @get:JsonProperty("modelId", required = true) val modelId: kotlin.Long,

    @Schema(example = "null", description = "Цена предложения.  До версии 2.0 партнерского API у параметра был тип String. ")
    @get:JsonProperty("price") val price: java.math.BigDecimal? = null,

    @Schema(example = "null", description = "Идентификатор прайс-листа, содержащего предложение.  Параметр доступен начиная с версии 2.0 партнерского API. ")
    @get:JsonProperty("feedId") val feedId: kotlin.Long? = null,

    @Schema(example = "null", description = "Идентификатор предложения из прайс-листа.  Параметр выводится, если в прайс-листе задан уникальный идентификатор. Если в прайс-листе содержится несколько предложений с одинаковыми идентификаторами, параметр `id` указывается только для первого из них, для остальных параметры `id` и `feedId` не выводятся.  Параметр доступен начиная с версии 2.0 партнерского API. ")
    @get:JsonProperty("id") val id: kotlin.String? = null,

    @Schema(example = "null", description = "Идентификатор категории предложения, указанный магазином в прайс-листе.  Параметр выводится только для предложений, у которых указана категория в прайс-листе.  Параметр доступен начиная с версии 2.0 партнерского API. ")
    @get:JsonProperty("shopCategoryId") val shopCategoryId: kotlin.String? = null,

    @Schema(example = "null", description = "Идентификатор категории предложения в дереве категорий Маркета. Параметр доступен начиная с версии 2.0 партнерского API. ")
    @get:JsonProperty("marketCategoryId") val marketCategoryId: kotlin.Int? = null,

    @Schema(example = "null", description = "Цена предложения без скидки.")
    @get:JsonProperty("preDiscountPrice") val preDiscountPrice: java.math.BigDecimal? = null,

    @Schema(example = "null", description = "Скидка на предложение в процентах.")
    @get:JsonProperty("discount") val discount: kotlin.Int? = null,

    @Schema(example = "null", description = "Является ли предложение уцененным:  * `true` — да. * `false` — нет.  Параметр доступен начиная с версии 2.58 партнерского API. ")
    @get:JsonProperty("cutPrice") val cutPrice: kotlin.Boolean? = null,

    @Schema(example = "null", description = "URL-адрес предложения на сайте магазина.")
    @get:JsonProperty("url") val url: kotlin.String? = null,

    @Schema(example = "null", description = "Наименование предложения.")
    @get:JsonProperty("name") val name: kotlin.String? = null,

    @field:Valid
    @Schema(example = "null", description = "")
    @get:JsonProperty("currency") val currency: CurrencyType? = null,

    @Schema(example = "null", description = "{% note warning \"\" %}  Этот параметр устарел. Не используйте его.  {% endnote %}  Ставка на клик. ")
    @get:JsonProperty("bid") val bid: java.math.BigDecimal? = null,

    @Schema(example = "null", description = "{% note warning \"\" %}  Этот параметр устарел. Не используйте его.  {% endnote %}  Ставка на клик. ")
    @get:JsonProperty("cbid") val cbid: java.math.BigDecimal? = null,

    @Schema(example = "null", description = "{% note warning \"\" %}  Этот параметр устарел. Не используйте его.  {% endnote %}  Процент комиссии на товар при продаже по CPA. ")
    @get:JsonProperty("fee") val fee: java.math.BigDecimal? = null,

    @Schema(example = "null", description = "Признак блокировки предложения. Возможные значения: * `false` — предложение активно, параметр не выводится. * `true` — предложение заблокировано. Параметр выводится, если предложение заблокировано и не попадает в выдачу Маркета. Это может произойти из-за отключения магазина. ")
    @get:JsonProperty("blocked") val blocked: kotlin.Boolean? = null
    ) {

}

