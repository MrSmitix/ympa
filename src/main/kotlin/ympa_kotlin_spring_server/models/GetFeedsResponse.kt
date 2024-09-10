package ympa_kotlin_spring_server.models

import java.util.Objects
import com.fasterxml.jackson.annotation.JsonProperty
import ympa_kotlin_spring_server.models.FeedDTO
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
 * Ответ на запрос списка прайс-листов.
 * @param feeds Список прайс-листов.
 */
data class GetFeedsResponse(

    @field:Valid
    @Schema(example = "null", required = true, description = "Список прайс-листов.")
    @get:JsonProperty("feeds", required = true) val feeds: kotlin.collections.List<FeedDTO>
    ) {

}

