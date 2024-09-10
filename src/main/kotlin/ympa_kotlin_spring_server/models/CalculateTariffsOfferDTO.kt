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
 * Параметры товара, для которого нужно рассчитать стоимость услуг.
 * @param categoryId Идентификатор категории товара на Маркете.  Для расчета стоимости услуг необходимо указать идентификатор листовой категории товара — той, которая не имеет дочерних категорий.  Чтобы узнать идентификатор категории, к которой относится товар, воспользуйтесь запросом [POST categories/tree](../../reference/categories/getCategoriesTree.md). 
 * @param price Цена на товар в рублях.
 * @param length Длина товара в сантиметрах.
 * @param width Ширина товара в сантиметрах.
 * @param height Высота товара в сантиметрах.
 * @param weight Вес товара в килограммах.
 * @param quantity Квант продажи — количество единиц товара в одном товарном предложении.
 */
data class CalculateTariffsOfferDTO(

    @get:Min(0L)
    @Schema(example = "null", required = true, description = "Идентификатор категории товара на Маркете.  Для расчета стоимости услуг необходимо указать идентификатор листовой категории товара — той, которая не имеет дочерних категорий.  Чтобы узнать идентификатор категории, к которой относится товар, воспользуйтесь запросом [POST categories/tree](../../reference/categories/getCategoriesTree.md). ")
    @get:JsonProperty("categoryId", required = true) val categoryId: kotlin.Long,

    @get:DecimalMin("0")
    @Schema(example = "null", required = true, description = "Цена на товар в рублях.")
    @get:JsonProperty("price", required = true) val price: java.math.BigDecimal,

    @get:DecimalMin("0")
    @Schema(example = "null", required = true, description = "Длина товара в сантиметрах.")
    @get:JsonProperty("length", required = true) val length: java.math.BigDecimal,

    @get:DecimalMin("0")
    @Schema(example = "null", required = true, description = "Ширина товара в сантиметрах.")
    @get:JsonProperty("width", required = true) val width: java.math.BigDecimal,

    @get:DecimalMin("0")
    @Schema(example = "null", required = true, description = "Высота товара в сантиметрах.")
    @get:JsonProperty("height", required = true) val height: java.math.BigDecimal,

    @get:DecimalMin("0")
    @Schema(example = "null", required = true, description = "Вес товара в килограммах.")
    @get:JsonProperty("weight", required = true) val weight: java.math.BigDecimal,

    @get:Min(1)
    @Schema(example = "null", description = "Квант продажи — количество единиц товара в одном товарном предложении.")
    @get:JsonProperty("quantity") val quantity: kotlin.Int? = 1
    ) {

}

