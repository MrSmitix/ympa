package ympa_kotlin_spring_server.models

import java.util.Objects
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
 * Инструкция по использованию товара. 
 * @param url Ссылка на инструкцию.
 * @param title Название инструкции, которое будет отображаться на карточке товара. 
 */
data class OfferManualDTO(

    @Schema(example = "null", required = true, description = "Ссылка на инструкцию.")
    @get:JsonProperty("url", required = true) val url: kotlin.String,

    @Schema(example = "null", description = "Название инструкции, которое будет отображаться на карточке товара. ")
    @get:JsonProperty("title") val title: kotlin.String? = null
    ) {

}

