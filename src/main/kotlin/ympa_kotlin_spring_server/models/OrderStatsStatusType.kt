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
* Текущий статус заказа:  * `CANCELLED_BEFORE_PROCESSING` — заказ отменен до начала его обработки.  * `CANCELLED_IN_DELIVERY` — заказ отменен во время его доставки.  * `CANCELLED_IN_PROCESSING` — заказ отменен во время его обработки.  * `DELIVERY` — заказ передан службе доставки.  * `DELIVERED` — заказ доставлен.  * `PARTIALLY_DELIVERED` — заказ частично доставлен.  * `PARTIALLY_RETURNED` — заказ частично возвращен покупателем.  * `PENDING` — заказ ожидает подтверждения.  * `PICKUP` — заказ доставлен в пункт выдачи.  * `PROCESSING` — заказ в обработке.  * `RESERVED` — товар зарезервирован на складе.  * `RETURNED` — заказ полностью возвращен покупателем.  * `UNKNOWN` — неизвестный статус заказа.  * `UNPAID` — заказ от юридического лица ожидает оплаты.  * `LOST` — заказ утерян. 
* Values: CANCELLED_BEFORE_PROCESSING,CANCELLED_IN_DELIVERY,CANCELLED_IN_PROCESSING,DELIVERY,DELIVERED,PARTIALLY_DELIVERED,PARTIALLY_RETURNED,PENDING,PICKUP,PROCESSING,RESERVED,RETURNED,UNKNOWN,UNPAID,LOST
*/
enum class OrderStatsStatusType(@get:JsonValue val value: kotlin.String) {

    CANCELLED_BEFORE_PROCESSING("CANCELLED_BEFORE_PROCESSING"),
    CANCELLED_IN_DELIVERY("CANCELLED_IN_DELIVERY"),
    CANCELLED_IN_PROCESSING("CANCELLED_IN_PROCESSING"),
    DELIVERY("DELIVERY"),
    DELIVERED("DELIVERED"),
    PARTIALLY_DELIVERED("PARTIALLY_DELIVERED"),
    PARTIALLY_RETURNED("PARTIALLY_RETURNED"),
    PENDING("PENDING"),
    PICKUP("PICKUP"),
    PROCESSING("PROCESSING"),
    RESERVED("RESERVED"),
    RETURNED("RETURNED"),
    UNKNOWN("UNKNOWN"),
    UNPAID("UNPAID"),
    LOST("LOST");

    companion object {
        @JvmStatic
        @JsonCreator
        fun forValue(value: kotlin.String): OrderStatsStatusType {
                return values().first{it -> it.value == value}
        }
    }
}

