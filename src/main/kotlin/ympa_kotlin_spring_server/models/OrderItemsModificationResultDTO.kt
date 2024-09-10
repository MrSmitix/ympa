package ympa_kotlin_spring_server.models

import java.util.Objects
import com.fasterxml.jackson.annotation.JsonProperty
import ympa_kotlin_spring_server.models.BriefOrderItemDTO
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
 * Краткие сведения о промаркированных товарах. Параметр возвращается, если ответ `OK`. 
 * @param items Список позиций в заказе, подлежащих маркировке.
 */
data class OrderItemsModificationResultDTO(

    @field:Valid
    @Schema(example = "null", required = true, description = "Список позиций в заказе, подлежащих маркировке.")
    @get:JsonProperty("items", required = true) val items: kotlin.collections.List<BriefOrderItemDTO>
    ) {

}

