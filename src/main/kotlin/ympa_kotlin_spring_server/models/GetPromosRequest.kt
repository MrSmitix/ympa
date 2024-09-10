package ympa_kotlin_spring_server.models

import java.util.Objects
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.annotation.JsonValue
import ympa_kotlin_spring_server.models.MechanicsType
import ympa_kotlin_spring_server.models.PromoParticipationType
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
 * Фильтры для получения списка акций.
 * @param participation 
 * @param mechanics 
 */
data class GetPromosRequest(

    @field:Valid
    @Schema(example = "null", description = "")
    @get:JsonProperty("participation") val participation: PromoParticipationType? = null,

    @field:Valid
    @Schema(example = "null", description = "")
    @get:JsonProperty("mechanics") val mechanics: MechanicsType? = null
    ) {

}

