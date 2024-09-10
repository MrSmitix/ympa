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
* Статус карточки товара:  * `HAS_CARD_CAN_NOT_UPDATE` — Карточка Маркета. * `HAS_CARD_CAN_UPDATE` — Можно дополнить. * `HAS_CARD_CAN_UPDATE_ERRORS` — Изменения не приняты. * `HAS_CARD_CAN_UPDATE_PROCESSING` — Изменения на проверке. * `NO_CARD_NEED_CONTENT` — Создайте карточку. * `NO_CARD_MARKET_WILL_CREATE` — Создаст Маркет. * `NO_CARD_ERRORS` — Не создана из-за ошибки. * `NO_CARD_PROCESSING` — Проверяем данные. * `NO_CARD_ADD_TO_CAMPAIGN` — Разместите товар в магазине.  [Что обозначает каждый из статусов](https://yandex.ru/support/marketplace/assortment/content/statuses.html) 
* Values: HAS_CARD_CAN_NOT_UPDATE,HAS_CARD_CAN_UPDATE,HAS_CARD_CAN_UPDATE_ERRORS,HAS_CARD_CAN_UPDATE_PROCESSING,NO_CARD_NEED_CONTENT,NO_CARD_MARKET_WILL_CREATE,NO_CARD_ERRORS,NO_CARD_PROCESSING,NO_CARD_ADD_TO_CAMPAIGN
*/
enum class OfferCardStatusType(@get:JsonValue val value: kotlin.String) {

    HAS_CARD_CAN_NOT_UPDATE("HAS_CARD_CAN_NOT_UPDATE"),
    HAS_CARD_CAN_UPDATE("HAS_CARD_CAN_UPDATE"),
    HAS_CARD_CAN_UPDATE_ERRORS("HAS_CARD_CAN_UPDATE_ERRORS"),
    HAS_CARD_CAN_UPDATE_PROCESSING("HAS_CARD_CAN_UPDATE_PROCESSING"),
    NO_CARD_NEED_CONTENT("NO_CARD_NEED_CONTENT"),
    NO_CARD_MARKET_WILL_CREATE("NO_CARD_MARKET_WILL_CREATE"),
    NO_CARD_ERRORS("NO_CARD_ERRORS"),
    NO_CARD_PROCESSING("NO_CARD_PROCESSING"),
    NO_CARD_ADD_TO_CAMPAIGN("NO_CARD_ADD_TO_CAMPAIGN");

    companion object {
        @JvmStatic
        @JsonCreator
        fun forValue(value: kotlin.String): OfferCardStatusType {
                return values().first{it -> it.value == value}
        }
    }
}

