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
 * Рекомендованная ставка и возможная доля показов.
 * @param bid Значение ставки.
 * @param showPercent Доля показов. 
 */
data class BidRecommendationItemDTO(

    @get:Min(0)
    @get:Max(9999)
    @Schema(example = "570", required = true, description = "Значение ставки.")
    @get:JsonProperty("bid", required = true) val bid: kotlin.Int,

    @get:Min(0L)
    @get:Max(100L)
    @Schema(example = "null", required = true, description = "Доля показов. ")
    @get:JsonProperty("showPercent", required = true) val showPercent: kotlin.Long
    ) {

}
