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
 * Информация для типа `MARKET_PROMOCODE`.  Параметр заполняется только для этого типа акции. 
 * @param promocode Промокод.
 * @param discount Процент скидки по промокоду.
 */
data class GetPromoPromocodeInfoDTO(

    @Schema(example = "null", required = true, description = "Промокод.")
    @get:JsonProperty("promocode", required = true) val promocode: kotlin.String,

    @Schema(example = "null", required = true, description = "Процент скидки по промокоду.")
    @get:JsonProperty("discount", required = true) val discount: kotlin.Int
    ) {

}

