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
 * Данные о складе отправления.
 * @param id Идентификатор склада отправления.
 * @param name Наименование склада отправления.
 * @param address Адрес склада отправления.
 */
data class PartnerShipmentWarehouseDTO(

    @Schema(example = "null", description = "Идентификатор склада отправления.")
    @get:JsonProperty("id") val id: kotlin.Long? = null,

    @Schema(example = "null", description = "Наименование склада отправления.")
    @get:JsonProperty("name") val name: kotlin.String? = null,

    @Schema(example = "null", description = "Адрес склада отправления.")
    @get:JsonProperty("address") val address: kotlin.String? = null
    ) {

}

