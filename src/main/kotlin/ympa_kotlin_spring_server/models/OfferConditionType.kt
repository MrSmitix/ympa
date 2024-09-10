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
* Тип уценки:  * `PREOWNED` —  бывший в употреблении товар, раньше принадлежал другому человеку. * `SHOWCASESAMPLE` — витринный образец. * `REFURBISHED` — повторная продажа товара. * `REDUCTION` — товар с дефектами. * `RENOVATED` — восстановленный товар. * `NOT_SPECIFIED` — не выбран.  `REFURBISHED` — специальное значение для одежды, обуви и аксессуаров. Используется только для уцененных товаров из этой категории. Другие значения для одежды, обуви и аксессуаров не используются. 
* Values: PREOWNED,SHOWCASESAMPLE,REFURBISHED,REDUCTION,RENOVATED,NOT_SPECIFIED
*/
enum class OfferConditionType(@get:JsonValue val value: kotlin.String) {

    PREOWNED("PREOWNED"),
    SHOWCASESAMPLE("SHOWCASESAMPLE"),
    REFURBISHED("REFURBISHED"),
    REDUCTION("REDUCTION"),
    RENOVATED("RENOVATED"),
    NOT_SPECIFIED("NOT_SPECIFIED");

    companion object {
        @JvmStatic
        @JsonCreator
        fun forValue(value: kotlin.String): OfferConditionType {
                return values().first{it -> it.value == value}
        }
    }
}

