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
* Тип оплаты заказа: - `CREDIT` — заказ оформлен в кредит. - `POSTPAID` — заказ оплачен после того, как был получен. - `PREPAID` — заказ оплачен до того, как был получен. 
* Values: CREDIT,POSTPAID,PREPAID,TINKOFF_CREDIT
*/
enum class OrdersStatsOrderPaymentType(@get:JsonValue val value: kotlin.String) {

    CREDIT("CREDIT"),
    POSTPAID("POSTPAID"),
    PREPAID("PREPAID"),
    TINKOFF_CREDIT("TINKOFF_CREDIT");

    companion object {
        @JvmStatic
        @JsonCreator
        fun forValue(value: kotlin.String): OrdersStatsOrderPaymentType {
                return values().first{it -> it.value == value}
        }
    }
}

