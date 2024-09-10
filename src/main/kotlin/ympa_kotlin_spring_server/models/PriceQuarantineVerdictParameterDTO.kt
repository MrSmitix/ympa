package ympa_kotlin_spring_server.models

import java.util.Objects
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.annotation.JsonValue
import ympa_kotlin_spring_server.models.PriceQuarantineVerdictParamNameType
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
 * Параметр карантина.
 * @param name 
 * @param &#x60;value&#x60; Значение параметра.
 */
data class PriceQuarantineVerdictParameterDTO(

    @field:Valid
    @Schema(example = "null", required = true, description = "")
    @get:JsonProperty("name", required = true) val name: PriceQuarantineVerdictParamNameType,

    @Schema(example = "null", required = true, description = "Значение параметра.")
    @get:JsonProperty("value", required = true) val `value`: kotlin.String
    ) {

}

