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
 * Список категорий, для которых нужно вернуть лимит на установку кванта и минимального количества товаров. 
 * @param marketCategoryIds Идентификаторы листовых категории на Маркете — тех, у которых нет дочерних категорий.
 */
data class GetCategoriesMaxSaleQuantumRequest(

    @get:Size(min=1,max=1500) 
    @Schema(example = "null", required = true, description = "Идентификаторы листовых категории на Маркете — тех, у которых нет дочерних категорий.")
    @get:JsonProperty("marketCategoryIds", required = true) val marketCategoryIds: kotlin.collections.Set<kotlin.Long>
    ) {

}

