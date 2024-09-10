package ympa_kotlin_spring_server.models

import java.util.Objects
import com.fasterxml.jackson.annotation.JsonProperty
import ympa_kotlin_spring_server.models.SkuBidItemDTO
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
 * description.
 * @param bids Список товаров и ставки для продвижения, которые на них нужно установить.
 */
data class PutSkuBidsRequest(

    @field:Valid
    @get:Size(min=1,max=1500) 
    @Schema(example = "null", required = true, description = "Список товаров и ставки для продвижения, которые на них нужно установить.")
    @get:JsonProperty("bids", required = true) val bids: kotlin.collections.List<SkuBidItemDTO>
    ) {

}

