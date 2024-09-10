package ympa_kotlin_spring_server.models

import java.util.Objects
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.annotation.JsonValue
import ympa_kotlin_spring_server.models.CurrencyType
import ympa_kotlin_spring_server.models.EnrichedModelDTO
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
 * Ответ на запрос списка предложений для моделей.
 * @param models Список моделей товаров.
 * @param currency 
 * @param regionId Идентификатор региона, для которого выводится информация о предложениях модели (доставляемых в этот регион).  Информацию о регионе по идентификатору можно получить с помощью запроса [GET regions/{regionId}](../../reference/regions/searchRegionsById.md). 
 */
data class GetModelsOffersResponse(

    @field:Valid
    @Schema(example = "null", required = true, description = "Список моделей товаров.")
    @get:JsonProperty("models", required = true) val models: kotlin.collections.List<EnrichedModelDTO>,

    @field:Valid
    @Schema(example = "null", description = "")
    @get:JsonProperty("currency") val currency: CurrencyType? = null,

    @Schema(example = "null", description = "Идентификатор региона, для которого выводится информация о предложениях модели (доставляемых в этот регион).  Информацию о регионе по идентификатору можно получить с помощью запроса [GET regions/{regionId}](../../reference/regions/searchRegionsById.md). ")
    @get:JsonProperty("regionId") val regionId: kotlin.Long? = null
    ) {

}

