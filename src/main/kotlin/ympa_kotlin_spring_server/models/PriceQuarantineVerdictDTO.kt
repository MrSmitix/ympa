package ympa_kotlin_spring_server.models

import java.util.Objects
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.annotation.JsonValue
import ympa_kotlin_spring_server.models.PriceQuarantineVerdictParameterDTO
import ympa_kotlin_spring_server.models.PriceQuarantineVerdictType
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
 * Причина попадания товара в карантин.
 * @param params Цена, из-за которой товар попал в карантин, и значения для сравнения. Конкретный набор параметров зависит от типа карантина.
 * @param type 
 */
data class PriceQuarantineVerdictDTO(

    @field:Valid
    @Schema(example = "null", required = true, description = "Цена, из-за которой товар попал в карантин, и значения для сравнения. Конкретный набор параметров зависит от типа карантина.")
    @get:JsonProperty("params", required = true) val params: kotlin.collections.List<PriceQuarantineVerdictParameterDTO>,

    @field:Valid
    @Schema(example = "null", description = "")
    @get:JsonProperty("type") val type: PriceQuarantineVerdictType? = null
    ) {

}

