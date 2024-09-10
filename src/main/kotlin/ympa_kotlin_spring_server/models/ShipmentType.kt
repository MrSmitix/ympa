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
* Способ отгрузки заказов:  * `IMPORT` — вы самостоятельно привозите заказы в выбранный сортировочный центр или пункт приема заказов. * `WITHDRAW` — вы отгружаете заказы со своего склада курьерам Яндекс Маркета. 
* Values: IMPORT,WITHDRAW
*/
enum class ShipmentType(@get:JsonValue val value: kotlin.String) {

    IMPORT("IMPORT"),
    WITHDRAW("WITHDRAW");

    companion object {
        @JvmStatic
        @JsonCreator
        fun forValue(value: kotlin.String): ShipmentType {
                return values().first{it -> it.value == value}
        }
    }
}

