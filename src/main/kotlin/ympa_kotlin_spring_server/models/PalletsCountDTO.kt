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
 * Количество палет в отгрузке.
 * @param planned Количество палет, которое заявил продавец.
 * @param fact Количество палет, которое приняли в сортировочном центре.
 */
data class PalletsCountDTO(

    @Schema(example = "null", description = "Количество палет, которое заявил продавец.")
    @get:JsonProperty("planned") val planned: kotlin.Int? = null,

    @Schema(example = "null", description = "Количество палет, которое приняли в сортировочном центре.")
    @get:JsonProperty("fact") val fact: kotlin.Int? = null
    ) {

}

