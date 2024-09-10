package ympa_kotlin_spring_server.models

import java.util.Objects
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.annotation.JsonValue
import ympa_kotlin_spring_server.models.AffectedOrderQualityRatingComponentType
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
 * Информация о заказе, который повлиял на индекс качества.
 * @param orderId Идентификатор заказа.
 * @param description Описание проблемы.
 * @param componentType 
 */
data class QualityRatingAffectedOrderDTO(

    @get:Min(0L)
    @Schema(example = "null", required = true, description = "Идентификатор заказа.")
    @get:JsonProperty("orderId", required = true) val orderId: kotlin.Long,

    @Schema(example = "null", required = true, description = "Описание проблемы.")
    @get:JsonProperty("description", required = true) val description: kotlin.String,

    @field:Valid
    @Schema(example = "null", required = true, description = "")
    @get:JsonProperty("componentType", required = true) val componentType: AffectedOrderQualityRatingComponentType
    ) {

}

