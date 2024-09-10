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
* Типы ошибок:  * `UNKNOWN_CATEGORY` — указана неизвестная категория. * `CATEGORY_IS_NOT_LEAF` — указана нелистовая категория. Укажите ту, которая не имеет дочерних категорий. 
* Values: UNKNOWN_CATEGORY,CATEGORY_IS_NOT_LEAF
*/
enum class CategoryErrorType(@get:JsonValue val value: kotlin.String) {

    UNKNOWN_CATEGORY("UNKNOWN_CATEGORY"),
    CATEGORY_IS_NOT_LEAF("CATEGORY_IS_NOT_LEAF");

    companion object {
        @JvmStatic
        @JsonCreator
        fun forValue(value: kotlin.String): CategoryErrorType {
                return values().first{it -> it.value == value}
        }
    }
}

