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
* Детали причин возврата:   * `DO_NOT_FIT`:     * `USER_DID_NOT_LIKE` — товар не понравился.     * `USER_CHANGED_MIND` — передумал покупать.     * `DELIVERED_TOO_LONG` — длительный срок доставки, поэтому передумал.    * `BAD_QUALITY`:     * `BAD_PACKAGE` — упаковка товара была нарушена.     * `DAMAGED` — царапины, сколы.     * `NOT_WORKING` — не включается / не работает.     * `INCOMPLETENESS` — некомплект (не хватает детали в наборе, к товару).    * `WRONG_ITEM`:     * `WRONG_ITEM` — не тот товар.     * `WRONG_COLOR` — не соответствует по цвету.     * `DID_NOT_MATCH_DESCRIPTION` — не соответствует заявленным характеристикам/описанию. 
* Values: USER_DID_NOT_LIKE,USER_CHANGED_MIND,DELIVERED_TOO_LONG,BAD_PACKAGE,DAMAGED,NOT_WORKING,INCOMPLETENESS,WRONG_ITEM,WRONG_COLOR,DID_NOT_MATCH_DESCRIPTION,UNKNOWN
*/
enum class ReturnDecisionSubreasonType(@get:JsonValue val value: kotlin.String) {

    USER_DID_NOT_LIKE("USER_DID_NOT_LIKE"),
    USER_CHANGED_MIND("USER_CHANGED_MIND"),
    DELIVERED_TOO_LONG("DELIVERED_TOO_LONG"),
    BAD_PACKAGE("BAD_PACKAGE"),
    DAMAGED("DAMAGED"),
    NOT_WORKING("NOT_WORKING"),
    INCOMPLETENESS("INCOMPLETENESS"),
    WRONG_ITEM("WRONG_ITEM"),
    WRONG_COLOR("WRONG_COLOR"),
    DID_NOT_MATCH_DESCRIPTION("DID_NOT_MATCH_DESCRIPTION"),
    UNKNOWN("UNKNOWN");

    companion object {
        @JvmStatic
        @JsonCreator
        fun forValue(value: kotlin.String): ReturnDecisionSubreasonType {
                return values().first{it -> it.value == value}
        }
    }
}

