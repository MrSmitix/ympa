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
 * Информация о предложениях прайс-листа.
 * @param rejectedCount Количество предложений, который не опубликованы на Маркете из-за найденных ошибок.
 * @param totalCount Количество предложений в прайс-листе.
 */
data class FeedIndexLogsOffersDTO(

    @Schema(example = "null", description = "Количество предложений, который не опубликованы на Маркете из-за найденных ошибок.")
    @get:JsonProperty("rejectedCount") val rejectedCount: kotlin.Long? = null,

    @Schema(example = "null", description = "Количество предложений в прайс-листе.")
    @get:JsonProperty("totalCount") val totalCount: kotlin.Long? = null
    ) {

}

