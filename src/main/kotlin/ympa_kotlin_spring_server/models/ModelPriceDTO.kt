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
 * Информация о ценах на модель товара.
 * @param avg Средняя цена предложения для модели в регионе.
 * @param max Максимальная цена предложения для модели в регионе.
 * @param min Минимальная цена предложения для модели в регионе.
 */
data class ModelPriceDTO(

    @Schema(example = "null", description = "Средняя цена предложения для модели в регионе.")
    @get:JsonProperty("avg") val avg: java.math.BigDecimal? = null,

    @Schema(example = "null", description = "Максимальная цена предложения для модели в регионе.")
    @get:JsonProperty("max") val max: java.math.BigDecimal? = null,

    @Schema(example = "null", description = "Минимальная цена предложения для модели в регионе.")
    @get:JsonProperty("min") val min: java.math.BigDecimal? = null
    ) {

}

