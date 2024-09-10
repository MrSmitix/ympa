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
* Причина, по которой товар не удалось поместить в архив:  * `OFFER_HAS_STOCKS` — товар хранится на складе Маркета. 
* Values: OFFER_HAS_STOCKS,UNKNOWN
*/
enum class AddOffersToArchiveErrorType(@get:JsonValue val value: kotlin.String) {

    OFFER_HAS_STOCKS("OFFER_HAS_STOCKS"),
    UNKNOWN("UNKNOWN");

    companion object {
        @JvmStatic
        @JsonCreator
        fun forValue(value: kotlin.String): AddOffersToArchiveErrorType {
                return values().first{it -> it.value == value}
        }
    }
}

