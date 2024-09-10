package ympa_kotlin_spring_server.models

import java.util.Objects
import com.fasterxml.jackson.annotation.JsonProperty
import ympa_kotlin_spring_server.models.CategoryErrorDTO
import ympa_kotlin_spring_server.models.MaxSaleQuantumDTO
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
 * Категории и лимит на установку кванта и минимального количества товаров.
 * @param results Категории и лимит на установку кванта и минимального количества товаров.
 * @param errors Ошибки, которые появились из-за переданных категорий.
 */
data class GetCategoriesMaxSaleQuantumDTO(

    @field:Valid
    @Schema(example = "null", required = true, description = "Категории и лимит на установку кванта и минимального количества товаров.")
    @get:JsonProperty("results", required = true) val results: kotlin.collections.List<MaxSaleQuantumDTO>,

    @field:Valid
    @Schema(example = "null", description = "Ошибки, которые появились из-за переданных категорий.")
    @get:JsonProperty("errors") val errors: kotlin.collections.List<CategoryErrorDTO>? = null
    ) {

}
