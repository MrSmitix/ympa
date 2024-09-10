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
 * Информация о категории.  Категория считается листовой, если у нее нет дочерних категорий. 
 * @param id Идентификатор категории.
 * @param name Название категории.
 * @param children Дочерние категории.
 */
data class CategoryDTO(

    @Schema(example = "null", required = true, description = "Идентификатор категории.")
    @get:JsonProperty("id", required = true) val id: kotlin.Long,

    @Schema(example = "null", required = true, description = "Название категории.")
    @get:JsonProperty("name", required = true) val name: kotlin.String,

    @field:Valid
    @Schema(example = "null", description = "Дочерние категории.")
    @get:JsonProperty("children") val children: kotlin.collections.List<CategoryDTO>? = null
    ) {

}

