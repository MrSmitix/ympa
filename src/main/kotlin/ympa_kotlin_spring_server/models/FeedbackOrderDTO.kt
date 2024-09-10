package ympa_kotlin_spring_server.models

import java.util.Objects
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.annotation.JsonValue
import ympa_kotlin_spring_server.models.FeedbackDeliveryType
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
 * Информация о заказе, указанная в отзыве.
 * @param shopOrderId Номер заказа, указанный в отзыве.
 * @param delivery 
 */
data class FeedbackOrderDTO(

    @Schema(example = "null", description = "Номер заказа, указанный в отзыве.")
    @get:JsonProperty("shopOrderId") val shopOrderId: kotlin.String? = null,

    @field:Valid
    @Schema(example = "null", description = "")
    @get:JsonProperty("delivery") val delivery: FeedbackDeliveryType? = null
    ) {

}

