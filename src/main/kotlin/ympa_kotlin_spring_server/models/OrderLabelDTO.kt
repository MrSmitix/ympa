package ympa_kotlin_spring_server.models

import java.util.Objects
import com.fasterxml.jackson.annotation.JsonProperty
import ympa_kotlin_spring_server.models.ParcelBoxLabelDTO
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
 * Данные для печати ярлыка.
 * @param orderId Идентификатор заказа.
 * @param placesNumber Количество коробок в заказе.
 * @param url URL файла с ярлыками‑наклейками на все коробки в заказе.  Соответствует URL, по которому выполняется запрос [GET campaigns/{campaignId}/orders/{orderId}/delivery/labels](../../reference/orders/generateOrderLabels.md). 
 * @param parcelBoxLabels Информация на ярлыке.
 */
data class OrderLabelDTO(

    @Schema(example = "null", required = true, description = "Идентификатор заказа.")
    @get:JsonProperty("orderId", required = true) val orderId: kotlin.Long,

    @Schema(example = "null", required = true, description = "Количество коробок в заказе.")
    @get:JsonProperty("placesNumber", required = true) val placesNumber: kotlin.Int,

    @Schema(example = "null", required = true, description = "URL файла с ярлыками‑наклейками на все коробки в заказе.  Соответствует URL, по которому выполняется запрос [GET campaigns/{campaignId}/orders/{orderId}/delivery/labels](../../reference/orders/generateOrderLabels.md). ")
    @get:JsonProperty("url", required = true) val url: kotlin.String,

    @field:Valid
    @Schema(example = "null", required = true, description = "Информация на ярлыке.")
    @get:JsonProperty("parcelBoxLabels", required = true) val parcelBoxLabels: kotlin.collections.List<ParcelBoxLabelDTO>
    ) {

}

