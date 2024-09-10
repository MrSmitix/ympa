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
* Услуга Маркета:  * `AGENCY_COMMISSION` — прием платежа покупателя.  * `PAYMENT_TRANSFER` — перевод платежа покупателя.  * `FEE` — размещение товара на Маркете.  * `DELIVERY_TO_CUSTOMER` — доставка покупателю.  * `CROSSREGIONAL_DELIVERY` — доставка в федеральный округ, город или населенный пункт.  * `EXPRESS_DELIVERY` — экспресс-доставка покупателю.  * `SORTING` — обработка заказа.  * `MIDDLE_MILE` — средняя миля.  Подробнее об услугах Маркета читайте [в Справке Маркета для продавцов](https://yandex.ru/support/marketplace/introduction/rates/index.html). 
* Values: AGENCY_COMMISSION,PAYMENT_TRANSFER,FEE,DELIVERY_TO_CUSTOMER,CROSSREGIONAL_DELIVERY,EXPRESS_DELIVERY,SORTING,MIDDLE_MILE
*/
enum class CalculatedTariffType(@get:JsonValue val value: kotlin.String) {

    AGENCY_COMMISSION("AGENCY_COMMISSION"),
    PAYMENT_TRANSFER("PAYMENT_TRANSFER"),
    FEE("FEE"),
    DELIVERY_TO_CUSTOMER("DELIVERY_TO_CUSTOMER"),
    CROSSREGIONAL_DELIVERY("CROSSREGIONAL_DELIVERY"),
    EXPRESS_DELIVERY("EXPRESS_DELIVERY"),
    SORTING("SORTING"),
    MIDDLE_MILE("MIDDLE_MILE");

    companion object {
        @JvmStatic
        @JsonCreator
        fun forValue(value: kotlin.String): CalculatedTariffType {
                return values().first{it -> it.value == value}
        }
    }
}

