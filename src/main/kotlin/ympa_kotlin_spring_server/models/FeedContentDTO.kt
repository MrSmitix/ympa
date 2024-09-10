package ympa_kotlin_spring_server.models

import java.util.Objects
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.annotation.JsonValue
import ympa_kotlin_spring_server.models.FeedContentErrorDTO
import ympa_kotlin_spring_server.models.FeedStatusType
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
 * Информация о проверке содержимого прайс-листа, загруженного на Маркет.
 * @param rejectedOffersCount Количество предложений, в которых найдены ошибки на этапе загрузки прайс-листа. Выводится, если параметр `content status=OK`. 
 * @param status 
 * @param totalOffersCount Количество предложений в прайс-листе. Выводится, если параметр `content status=OK`. 
 * @param error 
 */
data class FeedContentDTO(

    @Schema(example = "null", description = "Количество предложений, в которых найдены ошибки на этапе загрузки прайс-листа. Выводится, если параметр `content status=OK`. ")
    @get:JsonProperty("rejectedOffersCount") val rejectedOffersCount: kotlin.Long? = null,

    @field:Valid
    @Schema(example = "null", description = "")
    @get:JsonProperty("status") val status: FeedStatusType? = null,

    @Schema(example = "null", description = "Количество предложений в прайс-листе. Выводится, если параметр `content status=OK`. ")
    @get:JsonProperty("totalOffersCount") val totalOffersCount: kotlin.Long? = null,

    @field:Valid
    @Schema(example = "null", description = "")
    @get:JsonProperty("error") val error: FeedContentErrorDTO? = null
    ) {

}

