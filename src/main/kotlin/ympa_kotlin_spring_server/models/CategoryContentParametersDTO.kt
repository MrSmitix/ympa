package ympa_kotlin_spring_server.models

import java.util.Objects
import com.fasterxml.jackson.annotation.JsonProperty
import ympa_kotlin_spring_server.models.CategoryParameterDTO
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
 * Информация о параметрах категории.
 * @param categoryId Идентификатор категории на Маркете. Чтобы узнать идентификатор категории, к которой относится товар, воспользуйтесь запросом [POST categories/tree](../../reference/categories/getCategoriesTree.md).
 * @param parameters Список характеристик.
 */
data class CategoryContentParametersDTO(

    @Schema(example = "null", required = true, description = "Идентификатор категории на Маркете. Чтобы узнать идентификатор категории, к которой относится товар, воспользуйтесь запросом [POST categories/tree](../../reference/categories/getCategoriesTree.md).")
    @get:JsonProperty("categoryId", required = true) val categoryId: kotlin.Int,

    @field:Valid
    @Schema(example = "null", description = "Список характеристик.")
    @get:JsonProperty("parameters") val parameters: kotlin.collections.List<CategoryParameterDTO>? = null
    ) {

}

