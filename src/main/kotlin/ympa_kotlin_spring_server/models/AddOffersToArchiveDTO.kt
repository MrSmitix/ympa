package ympa_kotlin_spring_server.models

import java.util.Objects
import com.fasterxml.jackson.annotation.JsonProperty
import ympa_kotlin_spring_server.models.AddOffersToArchiveErrorDTO
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
 * Товары, которые не удалось поместить в архив.
 * @param notArchivedOffers Список товаров, которые не удалось поместить в архив.
 */
data class AddOffersToArchiveDTO(

    @field:Valid
    @Schema(example = "null", description = "Список товаров, которые не удалось поместить в архив.")
    @get:JsonProperty("notArchivedOffers") val notArchivedOffers: kotlin.collections.List<AddOffersToArchiveErrorDTO>? = null
    ) {

}

