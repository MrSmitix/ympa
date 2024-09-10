package ympa_kotlin_spring_server.models

import java.util.Objects
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.annotation.JsonValue
import ympa_kotlin_spring_server.models.OfferProcessingNoteType
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
 * Причины, по которым товар не прошел модерацию.
 * @param type 
 * @param payload Дополнительная информация о причине отклонения товара. 
 */
data class OfferProcessingNoteDTO(

    @field:Valid
    @Schema(example = "null", description = "")
    @get:JsonProperty("type") val type: OfferProcessingNoteType? = null,

    @Schema(example = "null", description = "Дополнительная информация о причине отклонения товара. ")
    @get:JsonProperty("payload") val payload: kotlin.String? = null
    ) {

}

