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
 * Информация о предложении.
 * @param discount Скидка на предложение в процентах.
 * @param name Наименование предложения.
 * @param pos Позиция предложения в выдаче Маркета на карточке модели.
 * @param preDiscountPrice Цена предложения без скидки магазина.
 * @param price Цена предложения без скидки, которую получает покупатель при оплате через Yandex Pay.
 * @param regionId Идентификатор региона предложения (регион, откуда доставляется товар).  Сначала показываются предложения, доставляемые из региона, указанного в запросе в параметре `regionId`. Предложения, доставляемые из других регионов, показываются после них. 
 * @param shippingCost Стоимость доставки товара в регион:  * `0` — доставка осуществляется бесплатно. * `-1` — магазин не осуществляет доставку этого товара (самовывоз).  Если стоимость доставки неизвестна, параметр не выводится. 
 * @param shopName Название магазина (в том виде, в котором отображается на Маркете).
 * @param shopRating Рейтинг магазина.  Возможные значения: * `-1` — у магазинов, недавно появившихся на Маркете, рейтинг появляется не сразу. До момента появления рейтинга для таких магазинов возвращается значение `-1`. * `1`. * `2`. * `3`. * `4`. * `5`. 
 * @param inStock {% note warning \"\" %}  Этот параметр устарел. Не используйте его.  {% endnote %} 
 */
data class ModelOfferDTO(

    @Schema(example = "null", description = "Скидка на предложение в процентах.")
    @get:JsonProperty("discount") val discount: kotlin.Int? = null,

    @Schema(example = "null", description = "Наименование предложения.")
    @get:JsonProperty("name") val name: kotlin.String? = null,

    @Schema(example = "null", description = "Позиция предложения в выдаче Маркета на карточке модели.")
    @get:JsonProperty("pos") val pos: kotlin.Int? = null,

    @Schema(example = "null", description = "Цена предложения без скидки магазина.")
    @get:JsonProperty("preDiscountPrice") val preDiscountPrice: java.math.BigDecimal? = null,

    @Schema(example = "null", description = "Цена предложения без скидки, которую получает покупатель при оплате через Yandex Pay.")
    @get:JsonProperty("price") val price: java.math.BigDecimal? = null,

    @Schema(example = "null", description = "Идентификатор региона предложения (регион, откуда доставляется товар).  Сначала показываются предложения, доставляемые из региона, указанного в запросе в параметре `regionId`. Предложения, доставляемые из других регионов, показываются после них. ")
    @get:JsonProperty("regionId") val regionId: kotlin.Long? = null,

    @Schema(example = "null", description = "Стоимость доставки товара в регион:  * `0` — доставка осуществляется бесплатно. * `-1` — магазин не осуществляет доставку этого товара (самовывоз).  Если стоимость доставки неизвестна, параметр не выводится. ")
    @get:JsonProperty("shippingCost") val shippingCost: java.math.BigDecimal? = null,

    @Schema(example = "null", description = "Название магазина (в том виде, в котором отображается на Маркете).")
    @get:JsonProperty("shopName") val shopName: kotlin.String? = null,

    @Schema(example = "null", description = "Рейтинг магазина.  Возможные значения: * `-1` — у магазинов, недавно появившихся на Маркете, рейтинг появляется не сразу. До момента появления рейтинга для таких магазинов возвращается значение `-1`. * `1`. * `2`. * `3`. * `4`. * `5`. ")
    @get:JsonProperty("shopRating") val shopRating: kotlin.Int? = null,

    @Schema(example = "null", description = "{% note warning \"\" %}  Этот параметр устарел. Не используйте его.  {% endnote %} ")
    @Deprecated(message = "")
    @get:JsonProperty("inStock") val inStock: kotlin.Int? = null
    ) {

}

