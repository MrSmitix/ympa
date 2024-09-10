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
* Способ возврата товара покупателем:  * `SHOP` — в точку возврата магазина.  * `DELIVERY_SERVICE` — отправить курьером.  * `POST` — почта. 
* Values: SHOP,DELIVERY_SERVICE,POST
*/
enum class RecipientType(@get:JsonValue val value: kotlin.String) {

    SHOP("SHOP"),
    DELIVERY_SERVICE("DELIVERY_SERVICE"),
    POST("POST");

    companion object {
        @JvmStatic
        @JsonCreator
        fun forValue(value: kotlin.String): RecipientType {
                return values().first{it -> it.value == value}
        }
    }
}

