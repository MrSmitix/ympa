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
* Составляющие индекса качества.  **Для модели DBS:** * `DBS_CANCELLATION_RATE` — доля отмененных товаров. * `DBS_LATE_DELIVERY_RATE` — доля заказов, доставленных после плановой даты.  **Для моделей FBS и Экспресс:** * `FBS_CANCELLATION_RATE` — доля отмененных товаров. * `FBS_LATE_SHIP_RATE` — доля не вовремя отгруженных заказов.  **Для модели FBY:** * `FBY_LATE_DELIVERY_RATE` — доля товаров, которые приехали на склад с опозданием. * `FBY_CANCELLATION_RATE` — доля отмененных или недоставленных товаров. * `FBY_DELIVERY_DIFF_RATE` — доля товаров, которые не прибыли вместе с поставкой или которые не приняли. * `FBY_LATE_EDITING_RATE` — доля товаров, которые поздно убрали из заявки. 
* Values: DBS_CANCELLATION_RATE,DBS_LATE_DELIVERY_RATE,FBS_CANCELLATION_RATE,FBS_LATE_SHIP_RATE,FBY_LATE_DELIVERY_RATE,FBY_CANCELLATION_RATE,FBY_DELIVERY_DIFF_RATE,FBY_LATE_EDITING_RATE
*/
enum class QualityRatingComponentType(@get:JsonValue val value: kotlin.String) {

    DBS_CANCELLATION_RATE("DBS_CANCELLATION_RATE"),
    DBS_LATE_DELIVERY_RATE("DBS_LATE_DELIVERY_RATE"),
    FBS_CANCELLATION_RATE("FBS_CANCELLATION_RATE"),
    FBS_LATE_SHIP_RATE("FBS_LATE_SHIP_RATE"),
    FBY_LATE_DELIVERY_RATE("FBY_LATE_DELIVERY_RATE"),
    FBY_CANCELLATION_RATE("FBY_CANCELLATION_RATE"),
    FBY_DELIVERY_DIFF_RATE("FBY_DELIVERY_DIFF_RATE"),
    FBY_LATE_EDITING_RATE("FBY_LATE_EDITING_RATE");

    companion object {
        @JvmStatic
        @JsonCreator
        fun forValue(value: kotlin.String): QualityRatingComponentType {
                return values().first{it -> it.value == value}
        }
    }
}

