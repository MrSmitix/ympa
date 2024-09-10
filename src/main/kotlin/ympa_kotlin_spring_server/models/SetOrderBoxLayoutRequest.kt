package ympa_kotlin_spring_server.models

import java.util.Objects
import com.fasterxml.jackson.annotation.JsonProperty
import ympa_kotlin_spring_server.models.OrderBoxLayoutDTO
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
 * 
 * @param boxes Список коробок.
 * @param allowRemove Передайте `true`, если вы собираетесь удалить часть товаров из заказа.
 */
data class SetOrderBoxLayoutRequest(

    @field:Valid
    @get:Size(min=1)
    @Schema(example = "null", required = true, description = "Список коробок.")
    @get:JsonProperty("boxes", required = true) val boxes: kotlin.collections.List<OrderBoxLayoutDTO>,

    @Schema(example = "null", description = "Передайте `true`, если вы собираетесь удалить часть товаров из заказа.")
    @get:JsonProperty("allowRemove") val allowRemove: kotlin.Boolean? = false
    ) {

}

