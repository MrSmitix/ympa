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
 * Информация о текущей карточке товара на Маркете.
 * @param marketSku SKU на Маркете.
 * @param modelId Идентификатор модели для текущей карточки товара на Маркете.  Например, две лопатки разных цветов имеют разные SKU на Маркете (параметр `marketSku`), но одинаковый идентификатор модели товара. 
 * @param categoryId Идентификатор категории для текущей карточки товара на Маркете.
 */
data class OfferMappingDTO(

    @Schema(example = "null", description = "SKU на Маркете.")
    @get:JsonProperty("marketSku") val marketSku: kotlin.Long? = null,

    @Schema(example = "null", description = "Идентификатор модели для текущей карточки товара на Маркете.  Например, две лопатки разных цветов имеют разные SKU на Маркете (параметр `marketSku`), но одинаковый идентификатор модели товара. ")
    @get:JsonProperty("modelId") val modelId: kotlin.Long? = null,

    @Schema(example = "null", description = "Идентификатор категории для текущей карточки товара на Маркете.")
    @get:JsonProperty("categoryId") val categoryId: kotlin.Long? = null
    ) {

}

