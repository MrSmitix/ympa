package ympa_kotlin_spring_server.models

import java.util.Objects
import com.fasterxml.jackson.annotation.JsonProperty
import ympa_kotlin_spring_server.models.OrderBoxLayoutItemDTO
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
 * Информация о коробке.
 * @param items Список товаров в коробке.  Если в коробке едет часть большого товара, в списке может быть только один пункт. 
 * @param boxId Идентификатор коробки.
 */
data class EnrichedOrderBoxLayoutDTO(

    @field:Valid
    @get:Size(min=1)
    @Schema(example = "null", required = true, description = "Список товаров в коробке.  Если в коробке едет часть большого товара, в списке может быть только один пункт. ")
    @get:JsonProperty("items", required = true) val items: kotlin.collections.List<OrderBoxLayoutItemDTO>,

    @Schema(example = "null", description = "Идентификатор коробки.")
    @get:JsonProperty("boxId") val boxId: kotlin.Long? = null
    ) {

}

