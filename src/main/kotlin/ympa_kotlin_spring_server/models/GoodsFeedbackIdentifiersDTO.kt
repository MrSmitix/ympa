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
 * Идентификаторы, которые связаны с отзывом.
 * @param orderId Идентификатор заказа на Маркете.
 * @param modelId Идентификатор модели товара.
 */
data class GoodsFeedbackIdentifiersDTO(

    @Schema(example = "null", required = true, description = "Идентификатор заказа на Маркете.")
    @get:JsonProperty("orderId", required = true) val orderId: kotlin.Long,

    @Schema(example = "null", required = true, description = "Идентификатор модели товара.")
    @get:JsonProperty("modelId", required = true) val modelId: kotlin.Long
    ) {

}

