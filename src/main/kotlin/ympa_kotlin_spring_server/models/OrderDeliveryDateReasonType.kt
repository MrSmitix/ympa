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
* Причина переноса доставки заказа. Возможные причины изменения даты:   - ```USER_MOVED_DELIVERY_DATES``` — покупатель попросил изменить дату или вы договорились привезти ему заказ раньше изначальной даты. Кроме этого указывается для подтверждения даты доставки товаров на заказ с долгой (31-60 дней) доставкой.   - ```PARTNER_MOVED_DELIVERY_DATES``` — магазин не может доставить заказ в срок. 
* Values: USER_MOVED_DELIVERY_DATES,PARTNER_MOVED_DELIVERY_DATES
*/
enum class OrderDeliveryDateReasonType(@get:JsonValue val value: kotlin.String) {

    USER_MOVED_DELIVERY_DATES("USER_MOVED_DELIVERY_DATES"),
    PARTNER_MOVED_DELIVERY_DATES("PARTNER_MOVED_DELIVERY_DATES");

    companion object {
        @JvmStatic
        @JsonCreator
        fun forValue(value: kotlin.String): OrderDeliveryDateReasonType {
                return values().first{it -> it.value == value}
        }
    }
}

