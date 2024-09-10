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
 * Годные/негодные ярлыки по заказам в отгрузке.
 * @param orderIdsWithLabels Идентификаторы заказов в отгрузке, для которых можно распечатать ярлыки.
 * @param orderIdsWithoutLabels Идентификаторы заказов в отгрузке, для которых нельзя распечатать ярлыки.
 */
data class OrdersShipmentInfoDTO(

    @Schema(example = "null", required = true, description = "Идентификаторы заказов в отгрузке, для которых можно распечатать ярлыки.")
    @get:JsonProperty("orderIdsWithLabels", required = true) val orderIdsWithLabels: kotlin.collections.Set<kotlin.Long>,

    @Schema(example = "null", required = true, description = "Идентификаторы заказов в отгрузке, для которых нельзя распечатать ярлыки.")
    @get:JsonProperty("orderIdsWithoutLabels", required = true) val orderIdsWithoutLabels: kotlin.collections.Set<kotlin.Long>
    ) {

}

