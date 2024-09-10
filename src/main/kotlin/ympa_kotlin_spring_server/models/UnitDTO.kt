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
 * Единица измерения.
 * @param id Идентификатор единицы измерения.
 * @param name Сокращенное название единицы измерения.
 * @param fullName Полное название единицы измерения.
 */
data class UnitDTO(

    @Schema(example = "null", required = true, description = "Идентификатор единицы измерения.")
    @get:JsonProperty("id", required = true) val id: kotlin.Long,

    @Schema(example = "кг", required = true, description = "Сокращенное название единицы измерения.")
    @get:JsonProperty("name", required = true) val name: kotlin.String,

    @Schema(example = "килограмм", required = true, description = "Полное название единицы измерения.")
    @get:JsonProperty("fullName", required = true) val fullName: kotlin.String
    ) {

}

