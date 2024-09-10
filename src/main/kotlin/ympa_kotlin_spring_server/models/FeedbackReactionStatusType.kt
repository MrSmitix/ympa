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
* Статус реакции на отзыв:  * `ALL` — все отзывы.  * `NEED_REACTION` — отзывы, на которые нужно ответить. 
* Values: ALL,NEED_REACTION
*/
enum class FeedbackReactionStatusType(@get:JsonValue val value: kotlin.String) {

    ALL("ALL"),
    NEED_REACTION("NEED_REACTION");

    companion object {
        @JvmStatic
        @JsonCreator
        fun forValue(value: kotlin.String): FeedbackReactionStatusType {
                return values().first{it -> it.value == value}
        }
    }
}

