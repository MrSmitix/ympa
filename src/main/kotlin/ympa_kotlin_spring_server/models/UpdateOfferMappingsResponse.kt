package ympa_kotlin_spring_server.models

import java.util.Objects
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.annotation.JsonValue
import ympa_kotlin_spring_server.models.ApiResponseStatusType
import ympa_kotlin_spring_server.models.UpdateOfferMappingResultDTO
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
 * Описывает проблемы, возникшие при сохранении товара.
 * @param status 
 * @param results Ошибки и предупреждения, которые появились при обработке списка характеристик. Каждый элемент списка соответствует одному товару.  Если ошибок и предупреждений нет, поле не передается. 
 */
data class UpdateOfferMappingsResponse(

    @field:Valid
    @Schema(example = "null", description = "")
    @get:JsonProperty("status") val status: ApiResponseStatusType? = null,

    @field:Valid
    @Schema(example = "null", description = "Ошибки и предупреждения, которые появились при обработке списка характеристик. Каждый элемент списка соответствует одному товару.  Если ошибок и предупреждений нет, поле не передается. ")
    @get:JsonProperty("results") val results: kotlin.collections.List<UpdateOfferMappingResultDTO>? = null
    ) {

}
