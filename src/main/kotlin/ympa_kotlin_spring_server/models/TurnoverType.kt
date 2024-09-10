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
* Оценка оборачиваемости.  |enum|Диапазон оборачиваемости|Комментарий| |-|-|-| |`LOW`|`turnoverDays` ≥ 120|| |`ALMOST_LOW`|100 ≤ `turnoverDays` < 120|| |`HIGH`|45 ≤ `turnoverDays` < 100|| |`VERY_HIGH`|0 ≤ `turnoverDays` < 45|| |`NO_SALES`|—|Продаж нет.| |`FREE_STORE`|Любое значение.|Товары этой категории сейчас хранятся бесплатно.| 
* Values: LOW,ALMOST_LOW,HIGH,VERY_HIGH,NO_SALES,FREE_STORE
*/
enum class TurnoverType(@get:JsonValue val value: kotlin.String) {

    LOW("LOW"),
    ALMOST_LOW("ALMOST_LOW"),
    HIGH("HIGH"),
    VERY_HIGH("VERY_HIGH"),
    NO_SALES("NO_SALES"),
    FREE_STORE("FREE_STORE");

    companion object {
        @JvmStatic
        @JsonCreator
        fun forValue(value: kotlin.String): TurnoverType {
                return values().first{it -> it.value == value}
        }
    }
}

