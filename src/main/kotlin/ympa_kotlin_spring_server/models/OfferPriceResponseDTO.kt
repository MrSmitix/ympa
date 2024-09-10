package ympa_kotlin_spring_server.models

import java.util.Objects
import com.fasterxml.jackson.annotation.JsonProperty
import ympa_kotlin_spring_server.models.PriceDTO
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
 * Информация об установленной цене на товар.
 * @param id Идентификатор предложения из прайс-листа.
 * @param price 
 * @param marketSku SKU на Маркете.
 * @param updatedAt Дата и время последнего обновления цены на товар.
 */
data class OfferPriceResponseDTO(

    @Schema(example = "null", description = "Идентификатор предложения из прайс-листа.")
    @get:JsonProperty("id") val id: kotlin.String? = null,

    @field:Valid
    @Schema(example = "null", description = "")
    @get:JsonProperty("price") val price: PriceDTO? = null,

    @Schema(example = "null", description = "SKU на Маркете.")
    @get:JsonProperty("marketSku") val marketSku: kotlin.Long? = null,

    @Schema(example = "null", description = "Дата и время последнего обновления цены на товар.")
    @get:JsonProperty("updatedAt") val updatedAt: java.time.OffsetDateTime? = null
    ) {

}

