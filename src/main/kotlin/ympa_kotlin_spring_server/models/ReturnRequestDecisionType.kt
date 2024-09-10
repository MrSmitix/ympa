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
* Решение по возврату.
* Values: REFUND_MONEY,REFUND_MONEY_INCLUDING_SHIPMENT,REPAIR,REPLACE,SEND_TO_EXAMINATION,DECLINE_REFUND,OTHER_DECISION
*/
enum class ReturnRequestDecisionType(@get:JsonValue val value: kotlin.String) {

    REFUND_MONEY("REFUND_MONEY"),
    REFUND_MONEY_INCLUDING_SHIPMENT("REFUND_MONEY_INCLUDING_SHIPMENT"),
    REPAIR("REPAIR"),
    REPLACE("REPLACE"),
    SEND_TO_EXAMINATION("SEND_TO_EXAMINATION"),
    DECLINE_REFUND("DECLINE_REFUND"),
    OTHER_DECISION("OTHER_DECISION");

    companion object {
        @JvmStatic
        @JsonCreator
        fun forValue(value: kotlin.String): ReturnRequestDecisionType {
                return values().first{it -> it.value == value}
        }
    }
}

