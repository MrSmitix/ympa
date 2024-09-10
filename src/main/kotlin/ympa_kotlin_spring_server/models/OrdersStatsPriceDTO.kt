package ympa_kotlin_spring_server.models

import java.util.Objects
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.annotation.JsonValue
import ympa_kotlin_spring_server.models.OrdersStatsPriceType
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
 * Цена или скидки на товар.
 * @param type 
 * @param costPerItem Цена или скидка на единицу товара в заказе. Указана в рублях. Точность — два знака после запятой. 
 * @param total Суммарная цена или скидка на все единицы товара в заказе. Указана в рублях. Точность — два знака после запятой. 
 */
data class OrdersStatsPriceDTO(

    @field:Valid
    @Schema(example = "null", description = "")
    @get:JsonProperty("type") val type: OrdersStatsPriceType? = null,

    @Schema(example = "null", description = "Цена или скидка на единицу товара в заказе. Указана в рублях. Точность — два знака после запятой. ")
    @get:JsonProperty("costPerItem") val costPerItem: java.math.BigDecimal? = null,

    @Schema(example = "null", description = "Суммарная цена или скидка на все единицы товара в заказе. Указана в рублях. Точность — два знака после запятой. ")
    @get:JsonProperty("total") val total: java.math.BigDecimal? = null
    ) {

}
