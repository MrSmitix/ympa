package ympa_kotlin_spring_server.models

import java.util.Objects
import com.fasterxml.jackson.annotation.JsonProperty
import ympa_kotlin_spring_server.models.CampaignDTO
import ympa_kotlin_spring_server.models.FlippingPagerDTO
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
 * Результаты поиска магазинов.
 * @param campaigns Список с информацией по каждому магазину.
 * @param pager 
 */
data class GetCampaignsResponse(

    @field:Valid
    @Schema(example = "null", required = true, description = "Список с информацией по каждому магазину.")
    @get:JsonProperty("campaigns", required = true) val campaigns: kotlin.collections.List<CampaignDTO>,

    @field:Valid
    @Schema(example = "null", description = "")
    @get:JsonProperty("pager") val pager: FlippingPagerDTO? = null
    ) {

}

