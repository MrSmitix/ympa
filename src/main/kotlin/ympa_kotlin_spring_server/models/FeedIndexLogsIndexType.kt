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
* Тип обновления.  Возможные значения:  * `DIFF` — частичное обновление данных на Яндекс Маркете (например, обновление цен ранее опубликованных предложений и публикация новых). * `FAST_PRICE` — только обновление цен ранее опубликованных предложений. * `FULL` — полное обновление данных на Яндекс Маркете. 
* Values: DIFF,FAST_PRICE,FULL
*/
enum class FeedIndexLogsIndexType(@get:JsonValue val value: kotlin.String) {

    DIFF("DIFF"),
    FAST_PRICE("FAST_PRICE"),
    FULL("FULL");

    companion object {
        @JvmStatic
        @JsonCreator
        fun forValue(value: kotlin.String): FeedIndexLogsIndexType {
                return values().first{it -> it.value == value}
        }
    }
}

