package ympa_kotlin_spring_server.models

import java.util.Objects
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.annotation.JsonValue
import ympa_kotlin_spring_server.models.BusinessDTO
import ympa_kotlin_spring_server.models.PlacementType
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
 * Информация о магазине.
 * @param domain URL магазина.
 * @param id Идентификатор кампании.
 * @param clientId Идентификатор плательщика в Яндекс Балансе.
 * @param business 
 * @param placementType 
 */
data class CampaignDTO(

    @Schema(example = "null", description = "URL магазина.")
    @get:JsonProperty("domain") val domain: kotlin.String? = null,

    @Schema(example = "null", description = "Идентификатор кампании.")
    @get:JsonProperty("id") val id: kotlin.Long? = null,

    @Schema(example = "null", description = "Идентификатор плательщика в Яндекс Балансе.")
    @get:JsonProperty("clientId") val clientId: kotlin.Long? = null,

    @field:Valid
    @Schema(example = "null", description = "")
    @get:JsonProperty("business") val business: BusinessDTO? = null,

    @field:Valid
    @Schema(example = "null", description = "")
    @get:JsonProperty("placementType") val placementType: PlacementType? = null
    ) {

}

