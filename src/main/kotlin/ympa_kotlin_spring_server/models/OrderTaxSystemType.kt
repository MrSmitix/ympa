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
* Система налогообложения (СНО) магазина на момент оформления заказа:  * `ECHN` — единый сельскохозяйственный налог (ЕСХН).  * `ENVD` — единый налог на вмененный доход (ЕНВД).  * `OSN` — общая система налогообложения (ОСН).  * `PSN` — патентная система налогообложения (ПСН).  * `USN` — упрощенная система налогообложения (УСН).  * `USN_MINUS_COST` — упрощенная система налогообложения, доходы, уменьшенные на величину расходов (УСН «Доходы минус расходы»).  * `NPD` — налог на профессиональный доход (НПД).  * `UNKNOWN_VALUE` — неизвестное значение. Используется только совместно с параметром `payment-method=YANDEX`. 
* Values: OSN,USN,USN_MINUS_COST,ENVD,ECHN,PSN,NPD,UNKNOWN_VALUE
*/
enum class OrderTaxSystemType(@get:JsonValue val value: kotlin.String) {

    OSN("OSN"),
    USN("USN"),
    USN_MINUS_COST("USN_MINUS_COST"),
    ENVD("ENVD"),
    ECHN("ECHN"),
    PSN("PSN"),
    NPD("NPD"),
    UNKNOWN_VALUE("UNKNOWN_VALUE");

    companion object {
        @JvmStatic
        @JsonCreator
        fun forValue(value: kotlin.String): OrderTaxSystemType {
                return values().first{it -> it.value == value}
        }
    }
}

