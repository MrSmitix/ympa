package ympa_kotlin_spring_server.models

import java.util.Objects
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.annotation.JsonValue
import ympa_kotlin_spring_server.models.CurrencyType
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
 * Цена с указанием скидки и времени последнего обновления.
 * @param &#x60;value&#x60; Значение.
 * @param currencyId 
 * @param updatedAt Время последнего обновления.
 * @param discountBase Цена до скидки.  Число должно быть целым. Вы можете указать цену со скидкой от 5 до 99%.  Передавайте этот параметр при каждом обновлении цены, если предоставляете скидку на товар. 
 */
data class GetPriceWithDiscountDTO(

    @get:DecimalMin("0")
    @Schema(example = "null", required = true, description = "Значение.")
    @get:JsonProperty("value", required = true) val `value`: java.math.BigDecimal,

    @field:Valid
    @Schema(example = "null", required = true, description = "")
    @get:JsonProperty("currencyId", required = true) val currencyId: CurrencyType,

    @Schema(example = "null", required = true, description = "Время последнего обновления.")
    @get:JsonProperty("updatedAt", required = true) val updatedAt: java.time.OffsetDateTime,

    @get:DecimalMin("0")
    @Schema(example = "null", description = "Цена до скидки.  Число должно быть целым. Вы можете указать цену со скидкой от 5 до 99%.  Передавайте этот параметр при каждом обновлении цены, если предоставляете скидку на товар. ")
    @get:JsonProperty("discountBase") val discountBase: java.math.BigDecimal? = null
    ) {

}

