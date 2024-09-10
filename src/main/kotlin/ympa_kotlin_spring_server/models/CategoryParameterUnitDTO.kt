package ympa_kotlin_spring_server.models

import java.util.Objects
import com.fasterxml.jackson.annotation.JsonProperty
import ympa_kotlin_spring_server.models.UnitDTO
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
 * Единицы измерения характеристики товара.
 * @param defaultUnitId Единица измерения по умолчанию.
 * @param units Допустимые единицы измерения.
 */
data class CategoryParameterUnitDTO(

    @Schema(example = "null", required = true, description = "Единица измерения по умолчанию.")
    @get:JsonProperty("defaultUnitId", required = true) val defaultUnitId: kotlin.Long,

    @field:Valid
    @Schema(example = "null", required = true, description = "Допустимые единицы измерения.")
    @get:JsonProperty("units", required = true) val units: kotlin.collections.List<UnitDTO>
    ) {

}

