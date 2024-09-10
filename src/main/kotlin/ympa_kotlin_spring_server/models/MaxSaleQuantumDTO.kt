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
 * Лимит на установку кванта и минимального количества товаров по категориям. 
 * @param id Идентификатор категории.
 * @param name Название категории.
 * @param maxSaleQuantum Лимит на установку кванта и минимального количества товаров.
 */
data class MaxSaleQuantumDTO(

    @Schema(example = "null", required = true, description = "Идентификатор категории.")
    @get:JsonProperty("id", required = true) val id: kotlin.Long,

    @Schema(example = "null", description = "Название категории.")
    @get:JsonProperty("name") val name: kotlin.String? = null,

    @Schema(example = "null", description = "Лимит на установку кванта и минимального количества товаров.")
    @get:JsonProperty("maxSaleQuantum") val maxSaleQuantum: kotlin.Int? = null
    ) {

}

