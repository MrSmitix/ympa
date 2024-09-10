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
 * Фильтрации удаляемых товаров по offerIds. 
 * @param offerIds Список SKU товаров, которые нужно удалить.
 */
data class DeleteOffersRequest(

    @get:Size(min=1,max=500) 
    @Schema(example = "null", required = true, description = "Список SKU товаров, которые нужно удалить.")
    @get:JsonProperty("offerIds", required = true) val offerIds: kotlin.collections.List<kotlin.String>
    ) {

}

