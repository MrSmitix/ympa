package ympa_kotlin_spring_server.models

import java.util.Objects
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.annotation.JsonValue
import ympa_kotlin_spring_server.models.FieldStateType
import ympa_kotlin_spring_server.models.PriceCompetitivenessType
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
 * @param offerIds Идентификаторы товаров, информация о которых нужна. ⚠️ Не используйте это поле одновременно с остальными фильтрами. Если вы хотите воспользоваться фильтрами, оставьте поле пустым.
 * @param cofinancePriceFilter 
 * @param recommendedCofinancePriceFilter 
 * @param competitivenessFilter 
 */
data class GetOfferRecommendationsRequest(

    @Schema(example = "null", description = "Идентификаторы товаров, информация о которых нужна. ⚠️ Не используйте это поле одновременно с остальными фильтрами. Если вы хотите воспользоваться фильтрами, оставьте поле пустым.")
    @get:JsonProperty("offerIds") val offerIds: kotlin.collections.List<kotlin.String>? = null,

    @field:Valid
    @Schema(example = "null", description = "")
    @get:JsonProperty("cofinancePriceFilter") val cofinancePriceFilter: FieldStateType? = null,

    @field:Valid
    @Schema(example = "null", description = "")
    @get:JsonProperty("recommendedCofinancePriceFilter") val recommendedCofinancePriceFilter: FieldStateType? = null,

    @field:Valid
    @Schema(example = "null", description = "")
    @get:JsonProperty("competitivenessFilter") val competitivenessFilter: PriceCompetitivenessType? = null
    ) {

}

