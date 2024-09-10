package ympa_kotlin_spring_server.models

import java.util.Objects
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.annotation.JsonValue
import ympa_kotlin_spring_server.models.OfferMappingErrorType
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
 * Текст ошибки.
 * @param type 
 * @param message Текст ошибки.
 * @param parameterId Идентификатор характеристики, с которой связана ошибка.
 */
data class OfferMappingErrorDTO(

    @field:Valid
    @Schema(example = "null", required = true, description = "")
    @get:JsonProperty("type", required = true) val type: OfferMappingErrorType,

    @Schema(example = "null", required = true, description = "Текст ошибки.")
    @get:JsonProperty("message", required = true) val message: kotlin.String,

    @Schema(example = "null", description = "Идентификатор характеристики, с которой связана ошибка.")
    @get:JsonProperty("parameterId") val parameterId: kotlin.Long? = null
    ) {

}

