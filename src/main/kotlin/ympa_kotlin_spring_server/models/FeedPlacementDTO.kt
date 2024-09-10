package ympa_kotlin_spring_server.models

import java.util.Objects
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.annotation.JsonValue
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
 * Информация о размещении предложений из прайс-листа на Маркете на момент выполнения запроса.
 * @param status 
 * @param totalOffersCount Количество предложений из прайс-листа, которые размещаются на Яндекс Маркете в момент выполнения запроса.
 */
data class FeedPlacementDTO(

    @field:Valid
    @Schema(example = "null", description = "")
    @get:JsonProperty("status") val status: FeedStatusType? = null,

    @Schema(example = "null", description = "Количество предложений из прайс-листа, которые размещаются на Яндекс Маркете в момент выполнения запроса.")
    @get:JsonProperty("totalOffersCount") val totalOffersCount: kotlin.Int? = null
    ) {

}

