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
 * Параметры товара в акции с типом `DIRECT_DISCOUNT` или `BLUE_FLASH`.
 * @param maxPromoPrice Максимально возможная цена для участия в акции.  Указывается в рублях.  Возвращается для всех товаров. 
 * @param price Зачеркнутая цена — та, по которой товар продавался до акции.  Указывается в рублях.  Возвращается, только если товар участвует в акции. 
 * @param promoPrice Цена по акции — та, по которой вы хотите продавать товар.  Указывается в рублях.  Возвращается, только если товар участвует в акции. 
 */
data class PromoOfferDiscountParamsDTO(

    @Schema(example = "null", required = true, description = "Максимально возможная цена для участия в акции.  Указывается в рублях.  Возвращается для всех товаров. ")
    @get:JsonProperty("maxPromoPrice", required = true) val maxPromoPrice: kotlin.Long,

    @Schema(example = "null", description = "Зачеркнутая цена — та, по которой товар продавался до акции.  Указывается в рублях.  Возвращается, только если товар участвует в акции. ")
    @get:JsonProperty("price") val price: kotlin.Long? = null,

    @Schema(example = "null", description = "Цена по акции — та, по которой вы хотите продавать товар.  Указывается в рублях.  Возвращается, только если товар участвует в акции. ")
    @get:JsonProperty("promoPrice") val promoPrice: kotlin.Long? = null
    ) {

}

