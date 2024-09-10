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
* Тип остатка на складе.
* Values: FIT,DEFECT,ANOMALY,SURPLUS,EXPIRED,MISGRADING,UNDEFINED,INCORRECT_IMEI,INCORRECT_SERIAL_NUMBER,INCORRECT_CIS,PART_MISSING,NON_COMPLIENT,NOT_ACCEPTABLE,SERVICE,MARKDOWN,DEMO,REPAIR,FIRMWARE,UNKNOWN
*/
enum class ReturnInstanceStockType(@get:JsonValue val value: kotlin.String) {

    FIT("FIT"),
    DEFECT("DEFECT"),
    ANOMALY("ANOMALY"),
    SURPLUS("SURPLUS"),
    EXPIRED("EXPIRED"),
    MISGRADING("MISGRADING"),
    UNDEFINED("UNDEFINED"),
    INCORRECT_IMEI("INCORRECT_IMEI"),
    INCORRECT_SERIAL_NUMBER("INCORRECT_SERIAL_NUMBER"),
    INCORRECT_CIS("INCORRECT_CIS"),
    PART_MISSING("PART_MISSING"),
    NON_COMPLIENT("NON_COMPLIENT"),
    NOT_ACCEPTABLE("NOT_ACCEPTABLE"),
    SERVICE("SERVICE"),
    MARKDOWN("MARKDOWN"),
    DEMO("DEMO"),
    REPAIR("REPAIR"),
    FIRMWARE("FIRMWARE"),
    UNKNOWN("UNKNOWN");

    companion object {
        @JvmStatic
        @JsonCreator
        fun forValue(value: kotlin.String): ReturnInstanceStockType {
                return values().first{it -> it.value == value}
        }
    }
}

