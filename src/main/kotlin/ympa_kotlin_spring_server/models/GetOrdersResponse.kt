package ympa_kotlin_spring_server.models

import java.util.Objects
import com.fasterxml.jackson.annotation.JsonProperty
import ympa_kotlin_spring_server.models.FlippingPagerDTO
import ympa_kotlin_spring_server.models.ForwardScrollingPagerDTO
import ympa_kotlin_spring_server.models.OrderDTO
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
 * Модель для ответа API списка информации по заказам.
 * @param orders Модель заказа. 
 * @param pager 
 * @param paging 
 */
data class GetOrdersResponse(

    @field:Valid
    @Schema(example = "null", required = true, description = "Модель заказа. ")
    @get:JsonProperty("orders", required = true) val orders: kotlin.collections.List<OrderDTO>,

    @field:Valid
    @Schema(example = "null", description = "")
    @get:JsonProperty("pager") val pager: FlippingPagerDTO? = null,

    @field:Valid
    @Schema(example = "null", description = "")
    @get:JsonProperty("paging") val paging: ForwardScrollingPagerDTO? = null
    ) {

}
