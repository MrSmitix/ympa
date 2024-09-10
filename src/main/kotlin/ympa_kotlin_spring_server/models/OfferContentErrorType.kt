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
* Типы ошибок:  * `OFFER_NOT_FOUND` — такого товара нет в каталоге. * `UNKNOWN_CATEGORY` — указана неизвестная категория. * `CATEGORY_MISMATCH` — указана категория, которая не совпадает с категорией товара. * `UNKNOWN_PARAMETER` — передана характеристика, которой нет среди характеристик категории. * `UNEXPECTED_BOOLEAN_VALUE` — вместо boolean-значения передано что-то другое. * `NUMBER_FORMAT` — передана строка, не обозначающая число, вместо числа. * `VALUE_BLANK` — передано пустое значение. * `INVALID_UNIT_ID` — передана единица измерения, недопустимая для характеристики. * `INVALID_GROUP_ID_LENGTH` — в названии превышено допустимое значение символов — 255. * `INVALID_GROUP_ID_CHARACTERS` — переданы [недопустимые символы](*ascii-code). 
* Values: OFFER_NOT_FOUND,UNKNOWN_CATEGORY,CATEGORY_MISMATCH,UNKNOWN_PARAMETER,UNEXPECTED_BOOLEAN_VALUE,NUMBER_FORMAT,VALUE_BLANK,INVALID_UNIT_ID,INVALID_GROUP_ID_LENGTH,INVALID_GROUP_ID_CHARACTERS
*/
enum class OfferContentErrorType(@get:JsonValue val value: kotlin.String) {

    OFFER_NOT_FOUND("OFFER_NOT_FOUND"),
    UNKNOWN_CATEGORY("UNKNOWN_CATEGORY"),
    CATEGORY_MISMATCH("CATEGORY_MISMATCH"),
    UNKNOWN_PARAMETER("UNKNOWN_PARAMETER"),
    UNEXPECTED_BOOLEAN_VALUE("UNEXPECTED_BOOLEAN_VALUE"),
    NUMBER_FORMAT("NUMBER_FORMAT"),
    VALUE_BLANK("VALUE_BLANK"),
    INVALID_UNIT_ID("INVALID_UNIT_ID"),
    INVALID_GROUP_ID_LENGTH("INVALID_GROUP_ID_LENGTH"),
    INVALID_GROUP_ID_CHARACTERS("INVALID_GROUP_ID_CHARACTERS");

    companion object {
        @JvmStatic
        @JsonCreator
        fun forValue(value: kotlin.String): OfferContentErrorType {
                return values().first{it -> it.value == value}
        }
    }
}

