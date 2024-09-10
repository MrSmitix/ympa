package ympa_kotlin_spring_server.models

import java.util.Objects
import com.fasterxml.jackson.annotation.JsonProperty
import ympa_kotlin_spring_server.models.DeliveryServiceInfoDTO
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
 * Информация о службах доставки.
 * @param deliveryService Информация о службе доставки.
 */
data class DeliveryServicesDTO(

    @field:Valid
    @Schema(example = "null", required = true, description = "Информация о службе доставки.")
    @get:JsonProperty("deliveryService", required = true) val deliveryService: kotlin.collections.List<DeliveryServiceInfoDTO>
    ) {

}

