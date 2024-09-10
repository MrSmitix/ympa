package ympa_kotlin_spring_server.models

import java.util.Objects
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.annotation.JsonValue
import ympa_kotlin_spring_server.models.OrderDocumentStatusType
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
 * Информация о документе.
 * @param status 
 * @param number Номер документа.
 * @param date Дата создания документа.
 */
data class DocumentDTO(

    @field:Valid
    @Schema(example = "null", description = "")
    @get:JsonProperty("status") val status: OrderDocumentStatusType? = null,

    @Schema(example = "null", description = "Номер документа.")
    @get:JsonProperty("number") val number: kotlin.String? = null,

    @field:Valid
    @Schema(example = "null", description = "Дата создания документа.")
    @get:JsonProperty("date") val date: java.time.LocalDate? = null
    ) {

}

