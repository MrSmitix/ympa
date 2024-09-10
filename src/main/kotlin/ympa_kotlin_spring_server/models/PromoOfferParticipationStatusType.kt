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
* Статус товара в акции:  * `AUTO` — добавлен автоматически во всех магазинах кабинета, в которых товар доступен для покупки.  * `PARTIALLY_AUTO` — добавлен автоматически у части магазинов.  * `MANUAL` — добавлен вручную.  * `NOT_PARTICIPATING` — не участвует в акции.  Об автоматическом и ручном добавлении товаров в акцию читайте [в Справке Маркета для продавцов](https://yandex.ru/support2/marketplace/ru/marketing/promos/market/index). 
* Values: AUTO,PARTIALLY_AUTO,MANUAL,NOT_PARTICIPATING
*/
enum class PromoOfferParticipationStatusType(@get:JsonValue val value: kotlin.String) {

    AUTO("AUTO"),
    PARTIALLY_AUTO("PARTIALLY_AUTO"),
    MANUAL("MANUAL"),
    NOT_PARTICIPATING("NOT_PARTICIPATING");

    companion object {
        @JvmStatic
        @JsonCreator
        fun forValue(value: kotlin.String): PromoOfferParticipationStatusType {
                return values().first{it -> it.value == value}
        }
    }
}

