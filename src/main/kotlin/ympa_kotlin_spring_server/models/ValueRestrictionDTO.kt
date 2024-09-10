package ympa_kotlin_spring_server.models

import java.util.Objects
import com.fasterxml.jackson.annotation.JsonProperty
import ympa_kotlin_spring_server.models.OptionValuesLimitedDTO
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
 * Ограничение на возможные значения, накладываемое другой характеристикой.  Если ограничивающая характеристика принимает определенное значение, список возможных значений ограничиваемой характеристики сокращается.  **Пример**  Характеристика **размер** сама по себе может принимать девять разных значений: `S`, `M`, `L`, `44`, `46`, `48`, `42/164`, `46/176`, `44S`.  Если ограничивающая характеристика **размерная сетка** принимает значение `RU`, список возможных значений размера сокращается до `44`, `46`, `48`. 
 * @param limitingParameterId Идентификатор ограничивающей характеристики.
 * @param limitedValues Значения ограничивающей характеристики и соответствующие допустимые значения текущей характеристики.
 */
data class ValueRestrictionDTO(

    @Schema(example = "null", required = true, description = "Идентификатор ограничивающей характеристики.")
    @get:JsonProperty("limitingParameterId", required = true) val limitingParameterId: kotlin.Long,

    @field:Valid
    @Schema(example = "null", required = true, description = "Значения ограничивающей характеристики и соответствующие допустимые значения текущей характеристики.")
    @get:JsonProperty("limitedValues", required = true) val limitedValues: kotlin.collections.List<OptionValuesLimitedDTO>
    ) {

}

