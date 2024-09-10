package ympa_kotlin_spring_server.models

import java.util.Objects
import com.fasterxml.jackson.annotation.JsonProperty
import ympa_kotlin_spring_server.models.FlippingPagerDTO
import ympa_kotlin_spring_server.models.FullOutletDTO
import ympa_kotlin_spring_server.models.ScrollingPagerDTO
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
 * Ответ на запрос информации о точках продаж.
 * @param outlets Информация о точках продаж.
 * @param paging 
 * @param pager 
 */
data class GetOutletsResponse(

    @field:Valid
    @Schema(example = "null", required = true, description = "Информация о точках продаж.")
    @get:JsonProperty("outlets", required = true) val outlets: kotlin.collections.List<FullOutletDTO>,

    @field:Valid
    @Schema(example = "null", description = "")
    @get:JsonProperty("paging") val paging: ScrollingPagerDTO? = null,

    @field:Valid
    @Schema(example = "null", description = "")
    @get:JsonProperty("pager") val pager: FlippingPagerDTO? = null
    ) {

}

