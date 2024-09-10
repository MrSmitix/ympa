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
 * Информация о весе и габаритах товара.  Если товар уже привязан к карточке (`marketSku`), в ответе вернутся габариты из карточки Маркета, а не размеры, которые вы передаете. 
 * @param length Длина товара в сантиметрах.
 * @param width Ширина товара в сантиметрах.
 * @param height Высота товара в сантиметрах.
 * @param weight Вес товара в килограммах.
 */
data class GoodsStatsWeightDimensionsDTO(

    @Schema(example = "null", description = "Длина товара в сантиметрах.")
    @get:JsonProperty("length") val length: java.math.BigDecimal? = null,

    @Schema(example = "null", description = "Ширина товара в сантиметрах.")
    @get:JsonProperty("width") val width: java.math.BigDecimal? = null,

    @Schema(example = "null", description = "Высота товара в сантиметрах.")
    @get:JsonProperty("height") val height: java.math.BigDecimal? = null,

    @Schema(example = "null", description = "Вес товара в килограммах.")
    @get:JsonProperty("weight") val weight: java.math.BigDecimal? = null
    ) {

}

