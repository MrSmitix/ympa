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
* Тип товара:  * `DEFECT` — товар бракованный.  * `FIT` — товар надлежащего качества. 
* Values: FIT,FREEZE,AVAILABLE,QUARANTINE,UTILIZATION,DEFECT,EXPIRED
*/
enum class OrdersStatsStockType(@get:JsonValue val value: kotlin.String) {

    FIT("FIT"),
    FREEZE("FREEZE"),
    AVAILABLE("AVAILABLE"),
    QUARANTINE("QUARANTINE"),
    UTILIZATION("UTILIZATION"),
    DEFECT("DEFECT"),
    EXPIRED("EXPIRED");

    companion object {
        @JvmStatic
        @JsonCreator
        fun forValue(value: kotlin.String): OrdersStatsStockType {
                return values().first{it -> it.value == value}
        }
    }
}

