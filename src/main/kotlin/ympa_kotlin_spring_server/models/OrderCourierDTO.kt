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
 * Информация о курьере.
 * @param fullName Полное имя курьера.
 * @param phone Номер телефона курьера.
 * @param phoneExtension Добавочный номер телефона.
 * @param vehicleNumber Номер транспортного средства.
 * @param vehicleDescription Описание машины. Например, модель и цвет.
 */
data class OrderCourierDTO(

    @Schema(example = "null", description = "Полное имя курьера.")
    @get:JsonProperty("fullName") val fullName: kotlin.String? = null,

    @Schema(example = "null", description = "Номер телефона курьера.")
    @get:JsonProperty("phone") val phone: kotlin.String? = null,

    @Schema(example = "null", description = "Добавочный номер телефона.")
    @get:JsonProperty("phoneExtension") val phoneExtension: kotlin.String? = null,

    @Schema(example = "null", description = "Номер транспортного средства.")
    @get:JsonProperty("vehicleNumber") val vehicleNumber: kotlin.String? = null,

    @Schema(example = "null", description = "Описание машины. Например, модель и цвет.")
    @get:JsonProperty("vehicleDescription") val vehicleDescription: kotlin.String? = null
    ) {

}

