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
* Статус товара:  * `PUBLISHED` — Готов к продаже. * `CHECKING` — На проверке. * `DISABLED_BY_PARTNER` — Скрыт вами. * `REJECTED_BY_MARKET` — Отклонен. * `DISABLED_AUTOMATICALLY` — Исправьте ошибки. * `CREATING_CARD` — Создается карточка. * `NO_CARD` — Нужна карточка. * `NO_STOCKS` — Нет на складе. * `ARCHIVED` — В архиве.  [Что обозначает каждый из статусов](https://yandex.ru/support/marketplace/assortment/add/statuses.html) 
* Values: PUBLISHED,CHECKING,DISABLED_BY_PARTNER,DISABLED_AUTOMATICALLY,REJECTED_BY_MARKET,CREATING_CARD,NO_CARD,NO_STOCKS,ARCHIVED
*/
enum class OfferCampaignStatusType(@get:JsonValue val value: kotlin.String) {

    PUBLISHED("PUBLISHED"),
    CHECKING("CHECKING"),
    DISABLED_BY_PARTNER("DISABLED_BY_PARTNER"),
    DISABLED_AUTOMATICALLY("DISABLED_AUTOMATICALLY"),
    REJECTED_BY_MARKET("REJECTED_BY_MARKET"),
    CREATING_CARD("CREATING_CARD"),
    NO_CARD("NO_CARD"),
    NO_STOCKS("NO_STOCKS"),
    ARCHIVED("ARCHIVED");

    companion object {
        @JvmStatic
        @JsonCreator
        fun forValue(value: kotlin.String): OfferCampaignStatusType {
                return values().first{it -> it.value == value}
        }
    }
}

