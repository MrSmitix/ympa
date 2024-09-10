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
 * Товары, которые не удалось восстановить из архива.
 * @param notUnarchivedOfferIds Список товаров, которые не удалось восстановить из архива.
 */
data class DeleteOffersFromArchiveDTO(

    @Schema(example = "null", description = "Список товаров, которые не удалось восстановить из архива.")
    @get:JsonProperty("notUnarchivedOfferIds") val notUnarchivedOfferIds: kotlin.collections.List<kotlin.String>? = null
    ) {

}

