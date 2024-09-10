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
* Статус заказа:  * `CANCELLED` — отменен.  * `DELIVERED` — получен покупателем.  * `DELIVERY` — передан в службу доставки.  * `PICKUP` — доставлен в пункт самовывоза.  * `PROCESSING` — находится в обработке.  * `PENDING` — ожидает обработки со стороны продавца.  * `UNPAID` — оформлен, но еще не оплачен (если выбрана оплата при оформлении).  * `PLACING` — оформляется, подготовка к резервированию.  * `RESERVED` — зарезервирован, но недооформлен.  * `PARTIALLY_RETURNED` — возвращен частично.  * `RETURNED` — возвращен полностью.  * `UNKNOWN` — неизвестный статус.  Также могут возвращаться другие значения. Обрабатывать их не требуется. 
* Values: PLACING,RESERVED,UNPAID,PROCESSING,DELIVERY,PICKUP,DELIVERED,CANCELLED,PENDING,PARTIALLY_RETURNED,RETURNED,UNKNOWN
*/
enum class OrderStatusType(@get:JsonValue val value: kotlin.String) {

    PLACING("PLACING"),
    RESERVED("RESERVED"),
    UNPAID("UNPAID"),
    PROCESSING("PROCESSING"),
    DELIVERY("DELIVERY"),
    PICKUP("PICKUP"),
    DELIVERED("DELIVERED"),
    CANCELLED("CANCELLED"),
    PENDING("PENDING"),
    PARTIALLY_RETURNED("PARTIALLY_RETURNED"),
    RETURNED("RETURNED"),
    UNKNOWN("UNKNOWN");

    companion object {
        @JvmStatic
        @JsonCreator
        fun forValue(value: kotlin.String): OrderStatusType {
                return values().first{it -> it.value == value}
        }
    }
}

