package ympa_kotlin_spring_server.models

import java.util.Objects
import com.fasterxml.jackson.annotation.JsonProperty
import ympa_kotlin_spring_server.models.UpdatePromoOfferDiscountParamsDTO
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
 * Параметры товара, который участвует в акции.
 * @param discountParams 
 */
data class UpdatePromoOfferParamsDTO(

    @field:Valid
    @Schema(example = "null", description = "")
    @get:JsonProperty("discountParams") val discountParams: UpdatePromoOfferDiscountParamsDTO? = null
    ) {

}

