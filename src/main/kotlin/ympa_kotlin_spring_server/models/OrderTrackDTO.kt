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
 * Информация о трек-номере посылки (DBS).
 * @param trackCode Трек‑номер посылки.
 * @param deliveryServiceId Идентификатор службы доставки. Информацию о службе доставки можно получить с помощью запроса [GET delivery/services](../../reference/orders/getDeliveryServices.md).
 */
data class OrderTrackDTO(

    @Schema(example = "null", description = "Трек‑номер посылки.")
    @get:JsonProperty("trackCode") val trackCode: kotlin.String? = null,

    @Schema(example = "null", description = "Идентификатор службы доставки. Информацию о службе доставки можно получить с помощью запроса [GET delivery/services](../../reference/orders/getDeliveryServices.md).")
    @get:JsonProperty("deliveryServiceId") val deliveryServiceId: kotlin.Long? = null
    ) {

}

