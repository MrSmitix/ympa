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
 * GPS-координаты широты и долготы. 
 * @param latitude Широта.
 * @param longitude Долгота.
 */
data class GpsDTO(

    @Schema(example = "null", required = true, description = "Широта.")
    @get:JsonProperty("latitude", required = true) val latitude: java.math.BigDecimal,

    @Schema(example = "null", required = true, description = "Долгота.")
    @get:JsonProperty("longitude", required = true) val longitude: java.math.BigDecimal
    ) {

}

