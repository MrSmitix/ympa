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
* Формат отчета:  * `FILE` — файл с электронной таблицей. * `CSV` — ZIP-архив с CSV-файлами на каждый лист отчета. 
* Values: FILE,CSV
*/
enum class ReportFormatType(@get:JsonValue val value: kotlin.String) {

    FILE("FILE"),
    CSV("CSV");

    companion object {
        @JvmStatic
        @JsonCreator
        fun forValue(value: kotlin.String): ReportFormatType {
                return values().first{it -> it.value == value}
        }
    }
}

