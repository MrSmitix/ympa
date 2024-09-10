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
* Тип кода подтверждения ЭАПП:  * `MERCHANT_TO_COURIER` — продавец передает код курьеру.  * `COURIER_TO_MERCHANT` — курьер передает код продавцу.  * `CHECKING_BY_MERCHANT` — продавец проверяет код на своей стороне. 
* Values: MERCHANT_TO_COURIER,COURIER_TO_MERCHANT,CHECKING_BY_MERCHANT
*/
enum class OrderDeliveryEacType(@get:JsonValue val value: kotlin.String) {

    MERCHANT_TO_COURIER("MERCHANT_TO_COURIER"),
    COURIER_TO_MERCHANT("COURIER_TO_MERCHANT"),
    CHECKING_BY_MERCHANT("CHECKING_BY_MERCHANT");

    companion object {
        @JvmStatic
        @JsonCreator
        fun forValue(value: kotlin.String): OrderDeliveryEacType {
                return values().first{it -> it.value == value}
        }
    }
}

