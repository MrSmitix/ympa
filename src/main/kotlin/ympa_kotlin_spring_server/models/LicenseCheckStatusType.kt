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
* Статус проверки лицензии:  * `NEW` — лицензия проверяется. * `SUCCESS` — лицензия прошла проверку. * `FAIL` — лицензия не прошла проверку. 
* Values: NEW,SUCCESS,FAIL,REVOKE,DONT_WANT,FAIL_MANUAL
*/
enum class LicenseCheckStatusType(@get:JsonValue val value: kotlin.String) {

    NEW("NEW"),
    SUCCESS("SUCCESS"),
    FAIL("FAIL"),
    REVOKE("REVOKE"),
    DONT_WANT("DONT_WANT"),
    FAIL_MANUAL("FAIL_MANUAL");

    companion object {
        @JvmStatic
        @JsonCreator
        fun forValue(value: kotlin.String): LicenseCheckStatusType {
                return values().first{it -> it.value == value}
        }
    }
}

