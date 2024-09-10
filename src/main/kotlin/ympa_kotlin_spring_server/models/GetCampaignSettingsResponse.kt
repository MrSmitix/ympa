package ympa_kotlin_spring_server.models

import java.util.Objects
import com.fasterxml.jackson.annotation.JsonProperty
import ympa_kotlin_spring_server.models.CampaignSettingsDTO
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
 * Ответ на запрос настроек магазина.
 * @param settings 
 */
data class GetCampaignSettingsResponse(

    @field:Valid
    @Schema(example = "null", description = "")
    @get:JsonProperty("settings") val settings: CampaignSettingsDTO? = null
    ) {

}

