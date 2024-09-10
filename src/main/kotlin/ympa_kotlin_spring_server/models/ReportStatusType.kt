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
* Статус генерации отчета:  * `PENDING` — отчет ожидает генерации. * `PROCESSING` — отчет генерируется. * `FAILED` — во время генерации произошла ошибка. * `DONE` — отчет готов. 
* Values: PENDING,PROCESSING,FAILED,DONE
*/
enum class ReportStatusType(@get:JsonValue val value: kotlin.String) {

    PENDING("PENDING"),
    PROCESSING("PROCESSING"),
    FAILED("FAILED"),
    DONE("DONE");

    companion object {
        @JvmStatic
        @JsonCreator
        fun forValue(value: kotlin.String): ReportStatusType {
                return values().first{it -> it.value == value}
        }
    }
}

