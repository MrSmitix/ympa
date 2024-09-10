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
* Составляющие индекса качества.  **Для модели DBS:** * `DBS_CANCELLATION_RATE` — доля отмененных товаров. * `DBS_LATE_DELIVERY_RATE` — доля заказов, доставленных после плановой даты.  **Для моделей FBS и Экспресс:** * `FBS_CANCELLATION_RATE` — доля отмененных товаров. * `FBS_LATE_SHIP_RATE` — доля не вовремя отгруженных заказов. 
* Values: DBS_CANCELLATION_RATE,DBS_LATE_DELIVERY_RATE,FBS_CANCELLATION_RATE,FBS_LATE_SHIP_RATE
*/
enum class AffectedOrderQualityRatingComponentType(@get:JsonValue val value: kotlin.String) {

    DBS_CANCELLATION_RATE("DBS_CANCELLATION_RATE"),
    DBS_LATE_DELIVERY_RATE("DBS_LATE_DELIVERY_RATE"),
    FBS_CANCELLATION_RATE("FBS_CANCELLATION_RATE"),
    FBS_LATE_SHIP_RATE("FBS_LATE_SHIP_RATE");

    companion object {
        @JvmStatic
        @JsonCreator
        fun forValue(value: kotlin.String): AffectedOrderQualityRatingComponentType {
                return values().first{it -> it.value == value}
        }
    }
}

