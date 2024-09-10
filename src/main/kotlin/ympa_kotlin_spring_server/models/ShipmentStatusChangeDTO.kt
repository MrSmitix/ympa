package ympa_kotlin_spring_server.models

import java.util.Objects
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.annotation.JsonValue
import ympa_kotlin_spring_server.models.ShipmentStatusType
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
 * Статус отгрузки.
 * @param status 
 * @param description Описание статуса отгрузки.
 * @param updateTime Время последнего изменения статуса отгрузки.
 */
data class ShipmentStatusChangeDTO(

    @field:Valid
    @Schema(example = "null", description = "")
    @get:JsonProperty("status") val status: ShipmentStatusType? = null,

    @Schema(example = "null", description = "Описание статуса отгрузки.")
    @get:JsonProperty("description") val description: kotlin.String? = null,

    @Schema(example = "null", description = "Время последнего изменения статуса отгрузки.")
    @get:JsonProperty("updateTime") val updateTime: java.time.OffsetDateTime? = null
    ) {

}

