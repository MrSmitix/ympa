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
 * description.
 * @param skus Список товаров, для которых нужно получить рекомендации по ставкам. 
 */
data class GetBidsRecommendationsRequest(

    @get:Size(min=1,max=1500) 
    @Schema(example = "null", required = true, description = "Список товаров, для которых нужно получить рекомендации по ставкам. ")
    @get:JsonProperty("skus", required = true) val skus: kotlin.collections.List<kotlin.String>
    ) {

}

