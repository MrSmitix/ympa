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
 * Габариты упаковки и вес товара.  Если товар занимает несколько коробок, перед измерением размеров сложите их компактно.  ![Схема измерения многоместных грузов](../../_images/reference/boxes-measure.png) 
 * @param length Длина упаковки в см. 
 * @param width Ширина упаковки в см. 
 * @param height Высота упаковки в см. 
 * @param weight Вес товара в кг с учетом упаковки (брутто). 
 */
data class OfferWeightDimensionsDTO(

    @Schema(example = "65.55", required = true, description = "Длина упаковки в см. ")
    @get:JsonProperty("length", required = true) val length: java.math.BigDecimal,

    @Schema(example = "50.7", required = true, description = "Ширина упаковки в см. ")
    @get:JsonProperty("width", required = true) val width: java.math.BigDecimal,

    @Schema(example = "20", required = true, description = "Высота упаковки в см. ")
    @get:JsonProperty("height", required = true) val height: java.math.BigDecimal,

    @Schema(example = "1.001", required = true, description = "Вес товара в кг с учетом упаковки (брутто). ")
    @get:JsonProperty("weight", required = true) val weight: java.math.BigDecimal
    ) {

}

