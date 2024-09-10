package ympa_kotlin_spring_server.models

import java.util.Objects
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.annotation.JsonValue
import ympa_kotlin_spring_server.models.ApiResponseStatusType
import ympa_kotlin_spring_server.models.ShipmentDTO
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
 * 
 * @param status 
 * @param result 
 */
data class GetShipmentResponse(

    @field:Valid
    @Schema(example = "null", description = "")
    @get:JsonProperty("status") val status: ApiResponseStatusType? = null,

    @field:Valid
    @Schema(example = "null", description = "")
    @get:JsonProperty("result") val result: ShipmentDTO? = null
    ) {

}

