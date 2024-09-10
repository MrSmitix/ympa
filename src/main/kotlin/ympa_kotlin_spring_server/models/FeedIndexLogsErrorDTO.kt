package ympa_kotlin_spring_server.models

import java.util.Objects
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.annotation.JsonValue
import ympa_kotlin_spring_server.models.FeedIndexLogsErrorType
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
 * Информация об ошибке, произошедшей во время индексации прайс-листа.  Выводится, если во время индексации произошли ошибки (`index-log-record status=ERROR`). 
 * @param httpStatusCode HTTP-код ошибки индексации прайс-листа.  Выводится, если `type=DOWNLOAD_HTTP_ERROR`. 
 * @param type 
 * @param description Описание ошибки.  Выводится, если `type=DOWNLOAD_ERROR`. 
 */
data class FeedIndexLogsErrorDTO(

    @Schema(example = "null", description = "HTTP-код ошибки индексации прайс-листа.  Выводится, если `type=DOWNLOAD_HTTP_ERROR`. ")
    @get:JsonProperty("httpStatusCode") val httpStatusCode: kotlin.Int? = null,

    @field:Valid
    @Schema(example = "null", description = "")
    @get:JsonProperty("type") val type: FeedIndexLogsErrorType? = null,

    @Schema(example = "null", description = "Описание ошибки.  Выводится, если `type=DOWNLOAD_ERROR`. ")
    @get:JsonProperty("description") val description: kotlin.String? = null
    ) {

}

