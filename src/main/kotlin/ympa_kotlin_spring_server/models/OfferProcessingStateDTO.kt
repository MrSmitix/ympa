package ympa_kotlin_spring_server.models

import java.util.Objects
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.annotation.JsonValue
import ympa_kotlin_spring_server.models.OfferProcessingNoteDTO
import ympa_kotlin_spring_server.models.OfferProcessingStatusType
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
 * Информация о статусе публикации товара на Маркете.
 * @param status 
 * @param notes Причины, по которым товар не прошел модерацию.
 */
data class OfferProcessingStateDTO(

    @field:Valid
    @Schema(example = "null", description = "")
    @get:JsonProperty("status") val status: OfferProcessingStatusType? = null,

    @field:Valid
    @Schema(example = "null", description = "Причины, по которым товар не прошел модерацию.")
    @get:JsonProperty("notes") val notes: kotlin.collections.List<OfferProcessingNoteDTO>? = null
    ) {

}

