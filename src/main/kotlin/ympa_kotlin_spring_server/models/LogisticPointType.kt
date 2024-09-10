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
* Тип логистической точки:    * `WAREHOUSE` — склад.   * `PICKUP_POINT` — обычная точка выдачи заказов (ПВЗ).   * `PICKUP_TERMINAL` — постамат.   * `PICKUP_POST_OFFICE` — отделение почтовой связи (ОПС).   * `PICKUP_MIXED` — торговый зал и пункт выдачи заказов.   * `PICKUP_RETAIL` — торговый зал. 
* Values: WAREHOUSE,PICKUP_POINT,PICKUP_TERMINAL,PICKUP_POST_OFFICE,PICKUP_MIXED,PICKUP_RETAIL,UNKNOWN
*/
enum class LogisticPointType(@get:JsonValue val value: kotlin.String) {

    WAREHOUSE("WAREHOUSE"),
    PICKUP_POINT("PICKUP_POINT"),
    PICKUP_TERMINAL("PICKUP_TERMINAL"),
    PICKUP_POST_OFFICE("PICKUP_POST_OFFICE"),
    PICKUP_MIXED("PICKUP_MIXED"),
    PICKUP_RETAIL("PICKUP_RETAIL"),
    UNKNOWN("UNKNOWN");

    companion object {
        @JvmStatic
        @JsonCreator
        fun forValue(value: kotlin.String): LogisticPointType {
                return values().first{it -> it.value == value}
        }
    }
}

