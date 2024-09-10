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
* Имя параметра причины скрытия товара по цене.  * `CURRENT_PRICE` — цена, из-за которой товар попал в карантин. * `LAST_VALID_PRICE` — последняя цена до попадания в карантин (только для карантина типа `PRICE_CHANGE`). * `MIN_PRICE` — порог попадания в карантин (только для карантина типов `LOW_PRICE` и `LOW_PRICE_PROMO`). * `CURRENCY` — валюта. 
* Values: CURRENT_PRICE,LAST_VALID_PRICE,MIN_PRICE,CURRENCY
*/
enum class PriceQuarantineVerdictParamNameType(@get:JsonValue val value: kotlin.String) {

    CURRENT_PRICE("CURRENT_PRICE"),
    LAST_VALID_PRICE("LAST_VALID_PRICE"),
    MIN_PRICE("MIN_PRICE"),
    CURRENCY("CURRENCY");

    companion object {
        @JvmStatic
        @JsonCreator
        fun forValue(value: kotlin.String): PriceQuarantineVerdictParamNameType {
                return values().first{it -> it.value == value}
        }
    }
}

