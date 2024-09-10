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
* Подстатус генерации отчета: * `NO_DATA` — для такого отчета нет данных. * `TOO_LARGE` — отчет превысил допустимый размер — укажите меньший период времени или уточните условия запроса. * `RESOURCE_NOT_FOUND` — для такого отчета не удалось найти часть сущностей. 
* Values: NO_DATA,TOO_LARGE,RESOURCE_NOT_FOUND
*/
enum class ReportSubStatusType(@get:JsonValue val value: kotlin.String) {

    NO_DATA("NO_DATA"),
    TOO_LARGE("TOO_LARGE"),
    RESOURCE_NOT_FOUND("RESOURCE_NOT_FOUND");

    companion object {
        @JvmStatic
        @JsonCreator
        fun forValue(value: kotlin.String): ReportSubStatusType {
                return values().first{it -> it.value == value}
        }
    }
}

