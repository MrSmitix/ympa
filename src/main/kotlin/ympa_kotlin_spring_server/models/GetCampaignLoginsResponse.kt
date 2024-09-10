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
 * Ответ на запрос списка логинов, связанных с магазином.
 * @param logins Список логинов.
 */
data class GetCampaignLoginsResponse(

    @Schema(example = "null", required = true, description = "Список логинов.")
    @get:JsonProperty("logins", required = true) val logins: kotlin.collections.List<kotlin.String>
    ) {

}

