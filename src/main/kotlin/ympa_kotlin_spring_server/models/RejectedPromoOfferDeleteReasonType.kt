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
* Описание ошибки:  * `OFFER_DOES_NOT_EXIST` — в кабинете нет товара с таким SKU. 
* Values: OFFER_DOES_NOT_EXIST
*/
enum class RejectedPromoOfferDeleteReasonType(@get:JsonValue val value: kotlin.String) {

    OFFER_DOES_NOT_EXIST("OFFER_DOES_NOT_EXIST");

    companion object {
        @JvmStatic
        @JsonCreator
        fun forValue(value: kotlin.String): RejectedPromoOfferDeleteReasonType {
                return values().first{it -> it.value == value}
        }
    }
}

