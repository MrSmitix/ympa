package ympa_kotlin_spring_server.models

import java.util.Objects
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.annotation.JsonValue
import ympa_kotlin_spring_server.models.OfferSellingProgramStatusType
import ympa_kotlin_spring_server.models.SellingProgramType
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
 * Информация о том, по каким моделям можно продавать товар, а по каким нельзя.
 * @param sellingProgram 
 * @param status 
 */
data class OfferSellingProgramDTO(

    @field:Valid
    @Schema(example = "null", required = true, description = "")
    @get:JsonProperty("sellingProgram", required = true) val sellingProgram: SellingProgramType,

    @field:Valid
    @Schema(example = "null", required = true, description = "")
    @get:JsonProperty("status", required = true) val status: OfferSellingProgramStatusType
    ) {

}

