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
 * Сообщение об ошибке, связанной с размещением товара.
 * @param message Тип ошибки.
 * @param comment Пояснение.
 */
data class OfferErrorDTO(

    @Schema(example = "null", description = "Тип ошибки.")
    @get:JsonProperty("message") val message: kotlin.String? = null,

    @Schema(example = "null", description = "Пояснение.")
    @get:JsonProperty("comment") val comment: kotlin.String? = null
    ) {

}

