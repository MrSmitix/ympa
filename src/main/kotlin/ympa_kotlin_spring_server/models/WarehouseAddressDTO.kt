package ympa_kotlin_spring_server.models

import java.util.Objects
import com.fasterxml.jackson.annotation.JsonProperty
import ympa_kotlin_spring_server.models.GpsDTO
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
 * Адрес склада.
 * @param city Город.
 * @param gps 
 * @param street Улица.
 * @param number Номер дома.
 * @param building Номер строения.
 * @param block Номер корпуса.
 */
data class WarehouseAddressDTO(

    @get:Size(max=200)
    @Schema(example = "null", required = true, description = "Город.")
    @get:JsonProperty("city", required = true) val city: kotlin.String,

    @field:Valid
    @Schema(example = "null", required = true, description = "")
    @get:JsonProperty("gps", required = true) val gps: GpsDTO,

    @get:Size(max=512)
    @Schema(example = "null", description = "Улица.")
    @get:JsonProperty("street") val street: kotlin.String? = null,

    @get:Size(max=256)
    @Schema(example = "null", description = "Номер дома.")
    @get:JsonProperty("number") val number: kotlin.String? = null,

    @get:Size(max=16)
    @Schema(example = "null", description = "Номер строения.")
    @get:JsonProperty("building") val building: kotlin.String? = null,

    @get:Size(max=16)
    @Schema(example = "null", description = "Номер корпуса.")
    @get:JsonProperty("block") val block: kotlin.String? = null
    ) {

}

