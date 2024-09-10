package ympa_kotlin_spring_server.models

import java.util.Objects
import com.fasterxml.jackson.annotation.JsonProperty
import ympa_kotlin_spring_server.models.PriceSuggestOfferDTO
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
 * Результат запроса цен для продвижения.
 * @param offers Список товаров с ценами для продвижения.
 */
data class SuggestPricesResultDTO(

    @field:Valid
    @Schema(example = "null", required = true, description = "Список товаров с ценами для продвижения.")
    @get:JsonProperty("offers", required = true) val offers: kotlin.collections.List<PriceSuggestOfferDTO>
    ) {

}

