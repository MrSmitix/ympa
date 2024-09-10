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
* Особый тип товара:  * `MEDICINE` — лекарства. * `BOOK` — бумажные и электронные книги. * `AUDIOBOOK` — аудиокниги. * `ARTIST_TITLE` — музыкальная и видеопродукция. * `ON_DEMAND` — товары на заказ.  {% note info \"Если ваш товар — книга\" %}  Укажите год издания в характеристиках товара. [Подробнее о параметре](../../reference/business-assortment/updateOfferMappings.md#offerparamdto)  {% endnote %} 
* Values: DEFAULT,MEDICINE,BOOK,AUDIOBOOK,ARTIST_TITLE,ON_DEMAND
*/
enum class OfferType(@get:JsonValue val value: kotlin.String) {

    DEFAULT("DEFAULT"),
    MEDICINE("MEDICINE"),
    BOOK("BOOK"),
    AUDIOBOOK("AUDIOBOOK"),
    ARTIST_TITLE("ARTIST_TITLE"),
    ON_DEMAND("ON_DEMAND");

    companion object {
        @JvmStatic
        @JsonCreator
        fun forValue(value: kotlin.String): OfferType {
                return values().first{it -> it.value == value}
        }
    }
}

