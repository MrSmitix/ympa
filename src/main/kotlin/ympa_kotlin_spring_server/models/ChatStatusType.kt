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
* Статус чата:  * `NEW` — новый чат. * `WAITING_FOR_CUSTOMER` — нужен ответ покупателя. * `WAITING_FOR_PARTNER` — нужен ответ магазина. * `WAITING_FOR_ARBITER` — нужен ответ арбитра. * `WAITING_FOR_MARKET` — нужен ответ Маркета. * `FINISHED` — чат завершен. 
* Values: NEW,WAITING_FOR_CUSTOMER,WAITING_FOR_PARTNER,WAITING_FOR_ARBITER,WAITING_FOR_MARKET,FINISHED
*/
enum class ChatStatusType(@get:JsonValue val value: kotlin.String) {

    NEW("NEW"),
    WAITING_FOR_CUSTOMER("WAITING_FOR_CUSTOMER"),
    WAITING_FOR_PARTNER("WAITING_FOR_PARTNER"),
    WAITING_FOR_ARBITER("WAITING_FOR_ARBITER"),
    WAITING_FOR_MARKET("WAITING_FOR_MARKET"),
    FINISHED("FINISHED");

    companion object {
        @JvmStatic
        @JsonCreator
        fun forValue(value: kotlin.String): ChatStatusType {
                return values().first{it -> it.value == value}
        }
    }
}

