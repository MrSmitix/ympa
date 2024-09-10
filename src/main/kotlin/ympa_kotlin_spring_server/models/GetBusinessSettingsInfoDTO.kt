package ympa_kotlin_spring_server.models

import java.util.Objects
import com.fasterxml.jackson.annotation.JsonProperty
import ympa_kotlin_spring_server.models.BusinessDTO
import ympa_kotlin_spring_server.models.BusinessSettingsDTO
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
 * Информация о кабинете и его настройках.
 * @param info 
 * @param settings 
 */
data class GetBusinessSettingsInfoDTO(

    @field:Valid
    @Schema(example = "null", description = "")
    @get:JsonProperty("info") val info: BusinessDTO? = null,

    @field:Valid
    @Schema(example = "null", description = "")
    @get:JsonProperty("settings") val settings: BusinessSettingsDTO? = null
    ) {

}

