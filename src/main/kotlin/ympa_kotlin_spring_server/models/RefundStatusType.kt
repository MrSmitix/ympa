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
* Cтатус возврата денег:  * `STARTED_BY_USER` — создан клиентом из личного кабинета.  * `REFUND_IN_PROGRESS` — ждет решение о возврате денег.  * `REFUNDED` — по возврату проведены все возвратные денежные транзакции.  * `FAILED` — невозможно провести возврат покупателю.  * `WAITING_FOR_DECISION` — ожидает решения.  * `DECISION_MADE` — по возврату принято решение.  * `REFUNDED_WITH_BONUSES` — возврат осуществлен баллами Плюса или промокодом.  * `REFUNDED_BY_SHOP` — магазин сделал самостоятельно возврат денег.  * `COMPLETE_WITHOUT_REFUND` — возврат денег не требуется.  * `CANCELLED` — возврат отменен. 
* Values: STARTED_BY_USER,REFUND_IN_PROGRESS,REFUNDED,FAILED,WAITING_FOR_DECISION,DECISION_MADE,REFUNDED_WITH_BONUSES,REFUNDED_BY_SHOP,CANCELLED,COMPLETE_WITHOUT_REFUND,UNKNOWN
*/
enum class RefundStatusType(@get:JsonValue val value: kotlin.String) {

    STARTED_BY_USER("STARTED_BY_USER"),
    REFUND_IN_PROGRESS("REFUND_IN_PROGRESS"),
    REFUNDED("REFUNDED"),
    FAILED("FAILED"),
    WAITING_FOR_DECISION("WAITING_FOR_DECISION"),
    DECISION_MADE("DECISION_MADE"),
    REFUNDED_WITH_BONUSES("REFUNDED_WITH_BONUSES"),
    REFUNDED_BY_SHOP("REFUNDED_BY_SHOP"),
    CANCELLED("CANCELLED"),
    COMPLETE_WITHOUT_REFUND("COMPLETE_WITHOUT_REFUND"),
    UNKNOWN("UNKNOWN");

    companion object {
        @JvmStatic
        @JsonCreator
        fun forValue(value: kotlin.String): RefundStatusType {
                return values().first{it -> it.value == value}
        }
    }
}

