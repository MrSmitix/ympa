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
* Причины возврата:  * `BAD_QUALITY` — бракованный товар (есть недостатки).  * `DO_NOT_FIT` — товар не подошел.  * `WRONG_ITEM` — привезли не тот товар.  * `DAMAGE_DELIVERY` — товар поврежден при доставке.  * `LOYALTY_FAIL` — невозможно установить виновного в браке/пересорте.  * `CONTENT_FAIL` — ошибочное описание товара по вине Маркета.  * `UNKNOWN` — причина не известна. 
* Values: BAD_QUALITY,DOES_NOT_FIT,WRONG_ITEM,DAMAGE_DELIVERY,LOYALTY_FAIL,CONTENT_FAIL,UNKNOWN
*/
enum class ReturnDecisionReasonType(@get:JsonValue val value: kotlin.String) {

    BAD_QUALITY("BAD_QUALITY"),
    DOES_NOT_FIT("DOES_NOT_FIT"),
    WRONG_ITEM("WRONG_ITEM"),
    DAMAGE_DELIVERY("DAMAGE_DELIVERY"),
    LOYALTY_FAIL("LOYALTY_FAIL"),
    CONTENT_FAIL("CONTENT_FAIL"),
    UNKNOWN("UNKNOWN");

    companion object {
        @JvmStatic
        @JsonCreator
        fun forValue(value: kotlin.String): ReturnDecisionReasonType {
                return values().first{it -> it.value == value}
        }
    }
}

