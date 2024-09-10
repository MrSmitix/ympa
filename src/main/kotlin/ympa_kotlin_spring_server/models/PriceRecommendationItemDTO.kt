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
 * Рекомендованная цена.
 * @param campaignId Идентификатор кампании.
 * @param price Рекомендованная цена на товар. Чтобы продвижение хорошо работало, цена на товар должна быть не выше этого значения. [Подробно о рекомендованных ценах](https://yandex.ru/support/marketplace/marketing/campaigns.html#prices) 
 */
data class PriceRecommendationItemDTO(

    @Schema(example = "null", required = true, description = "Идентификатор кампании.")
    @get:JsonProperty("campaignId", required = true) val campaignId: kotlin.Long,

    @get:DecimalMin("1")
    @Schema(example = "null", required = true, description = "Рекомендованная цена на товар. Чтобы продвижение хорошо работало, цена на товар должна быть не выше этого значения. [Подробно о рекомендованных ценах](https://yandex.ru/support/marketplace/marketing/campaigns.html#prices) ")
    @get:JsonProperty("price", required = true) val price: java.math.BigDecimal
    ) {

}

