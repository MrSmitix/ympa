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
* Способ отгрузки:  * `BUYER` — доставка покупателю.  * `MARKET_PARTNER_OUTLET` — доставка в пункт выдачи партнера.  * `MARKET_BRANDED_OUTLET` — доставка в пункт выдачи заказов Маркета.  * `SHOP_OUTLET` — доставка в пункт выдачи заказов магазина.  * `DROPOFF` — доставка в пункт выдачи, который принимает заказы от продавцов и передает их курьерам.  * `UNKNOWN` — неизвестный тип. 
* Values: UNKNOWN,BUYER,MARKET_PARTNER_OUTLET,MARKET_BRANDED_OUTLET,SHOP_OUTLET,DROPOFF
*/
enum class OrderDeliveryDispatchType(@get:JsonValue val value: kotlin.String) {

    UNKNOWN("UNKNOWN"),
    BUYER("BUYER"),
    MARKET_PARTNER_OUTLET("MARKET_PARTNER_OUTLET"),
    MARKET_BRANDED_OUTLET("MARKET_BRANDED_OUTLET"),
    SHOP_OUTLET("SHOP_OUTLET"),
    DROPOFF("DROPOFF");

    companion object {
        @JvmStatic
        @JsonCreator
        fun forValue(value: kotlin.String): OrderDeliveryDispatchType {
                return values().first{it -> it.value == value}
        }
    }
}

