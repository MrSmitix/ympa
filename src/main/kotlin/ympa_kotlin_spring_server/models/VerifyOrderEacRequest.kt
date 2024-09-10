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
 * 
 * @param code Код для подтверждения ЭАПП.
 */
data class VerifyOrderEacRequest(

    @Schema(example = "null", description = "Код для подтверждения ЭАПП.")
    @get:JsonProperty("code") val code: kotlin.String? = null
    ) {

}

