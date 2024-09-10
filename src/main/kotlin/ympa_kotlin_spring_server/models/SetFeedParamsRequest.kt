package ympa_kotlin_spring_server.models

import java.util.Objects
import com.fasterxml.jackson.annotation.JsonProperty
import ympa_kotlin_spring_server.models.FeedParameterDTO
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
 * Запрос на обновление изменение параметров прайс-листа.
 * @param parameters Параметры прайс-листа.  Обязательный параметр. 
 */
data class SetFeedParamsRequest(

    @field:Valid
    @Schema(example = "null", required = true, description = "Параметры прайс-листа.  Обязательный параметр. ")
    @get:JsonProperty("parameters", required = true) val parameters: kotlin.collections.List<FeedParameterDTO>
    ) {

}

