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
 * Значение ограничивающей характеристики и список допустимых значений ограничиваемой характеристики.
 * @param limitingOptionValueId Идентификатор значения ограничивающей характеристики.
 * @param optionValueIds Идентификаторы допустимых значений ограничиваемой характеристики. 
 */
data class OptionValuesLimitedDTO(

    @Schema(example = "null", required = true, description = "Идентификатор значения ограничивающей характеристики.")
    @get:JsonProperty("limitingOptionValueId", required = true) val limitingOptionValueId: kotlin.Long,

    @Schema(example = "null", required = true, description = "Идентификаторы допустимых значений ограничиваемой характеристики. ")
    @get:JsonProperty("optionValueIds", required = true) val optionValueIds: kotlin.collections.List<kotlin.Long>
    ) {

}

