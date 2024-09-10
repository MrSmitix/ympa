package ympa_kotlin_spring_server.models

import java.util.Objects
import com.fasterxml.jackson.annotation.JsonValue
import com.fasterxml.jackson.annotation.JsonCreator
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
* Причина отклонения изменения:  * `OFFER_DOES_NOT_EXIST` — в кабинете нет товара с таким SKU.  * `OFFER_DUPLICATION` — один и тот же товар передан несколько раз.  * `OFFER_NOT_ELIGIBLE_FOR_PROMO` — товар не подходит под условия акции.  * `OFFER_PROMOS_MAX_BYTE_SIZE_EXCEEDED` — товар не добавлен в акцию по техническим причинам.  * `DEADLINE_FOR_FOCUS_PROMOS_EXCEEDED` — истек срок добавления товаров в акцию.  * `EMPTY_OLD_PRICE` — не указана зачеркнутая цена.  * `EMPTY_PROMO_PRICE` — не указана цена по акции.  * `MAX_PROMO_PRICE_EXCEEDED` — цена по акции превышает максимально возможную цену для участия в акции.  * `PROMO_PRICE_BIGGER_THAN_MAX` — цена по акции больше 95% от зачеркнутой цены.  * `PROMO_PRICE_SMALLER_THAN_MIN` — цена по акции меньше 1% от зачеркнутой цены. 
* Values: OFFER_DOES_NOT_EXIST,OFFER_DUPLICATION,OFFER_NOT_ELIGIBLE_FOR_PROMO,OFFER_PROMOS_MAX_BYTE_SIZE_EXCEEDED,DEADLINE_FOR_FOCUS_PROMOS_EXCEEDED,EMPTY_OLD_PRICE,EMPTY_PROMO_PRICE,MAX_PROMO_PRICE_EXCEEDED,PROMO_PRICE_BIGGER_THAN_MAX,PROMO_PRICE_SMALLER_THAN_MIN
*/
enum class RejectedPromoOfferUpdateReasonType(@get:JsonValue val value: kotlin.String) {

    OFFER_DOES_NOT_EXIST("OFFER_DOES_NOT_EXIST"),
    OFFER_DUPLICATION("OFFER_DUPLICATION"),
    OFFER_NOT_ELIGIBLE_FOR_PROMO("OFFER_NOT_ELIGIBLE_FOR_PROMO"),
    OFFER_PROMOS_MAX_BYTE_SIZE_EXCEEDED("OFFER_PROMOS_MAX_BYTE_SIZE_EXCEEDED"),
    DEADLINE_FOR_FOCUS_PROMOS_EXCEEDED("DEADLINE_FOR_FOCUS_PROMOS_EXCEEDED"),
    EMPTY_OLD_PRICE("EMPTY_OLD_PRICE"),
    EMPTY_PROMO_PRICE("EMPTY_PROMO_PRICE"),
    MAX_PROMO_PRICE_EXCEEDED("MAX_PROMO_PRICE_EXCEEDED"),
    PROMO_PRICE_BIGGER_THAN_MAX("PROMO_PRICE_BIGGER_THAN_MAX"),
    PROMO_PRICE_SMALLER_THAN_MIN("PROMO_PRICE_SMALLER_THAN_MIN");

    companion object {
        @JvmStatic
        @JsonCreator
        fun forValue(value: kotlin.String): RejectedPromoOfferUpdateReasonType {
                return values().first{it -> it.value == value}
        }
    }
}

