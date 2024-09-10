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
* Тип скидки или цена на товар: - `BUYER` — цена на товар с учетом скидок, в том числе купонов. - `CASHBACK` — баллы Плюса. - `MARKETPLACE` — купоны. 
* Values: BUYER,CASHBACK,MARKETPLACE
*/
enum class OrdersStatsPriceType(@get:JsonValue val value: kotlin.String) {

    BUYER("BUYER"),
    CASHBACK("CASHBACK"),
    MARKETPLACE("MARKETPLACE");

    companion object {
        @JvmStatic
        @JsonCreator
        fun forValue(value: kotlin.String): OrdersStatsPriceType {
                return values().first{it -> it.value == value}
        }
    }
}

