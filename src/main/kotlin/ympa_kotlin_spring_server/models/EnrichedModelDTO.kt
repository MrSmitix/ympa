package ympa_kotlin_spring_server.models

import java.util.Objects
import com.fasterxml.jackson.annotation.JsonProperty
import ympa_kotlin_spring_server.models.ModelOfferDTO
import ympa_kotlin_spring_server.models.ModelPriceDTO
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
 * Модель товара.
 * @param id Идентификатор модели товара.
 * @param name Название модели товара.
 * @param prices 
 * @param offers Список первых десяти предложений, расположенных на карточке модели.  В ответе на запрос возвращаются предложения различных магазинов. Если есть несколько предложений от одного магазина, в ответе отображается только одно, наиболее релевантное из них. 
 * @param offlineOffers Суммарное количество предложений в розничных магазинах в регионе. Учитываются все предложения от каждого магазина.
 * @param onlineOffers Суммарное количество предложений в интернет-магазинах в регионе. Учитываются все предложения от каждого магазина.
 */
data class EnrichedModelDTO(

    @Schema(example = "null", description = "Идентификатор модели товара.")
    @get:JsonProperty("id") val id: kotlin.Long? = null,

    @Schema(example = "null", description = "Название модели товара.")
    @get:JsonProperty("name") val name: kotlin.String? = null,

    @field:Valid
    @Schema(example = "null", description = "")
    @get:JsonProperty("prices") val prices: ModelPriceDTO? = null,

    @field:Valid
    @Schema(example = "null", description = "Список первых десяти предложений, расположенных на карточке модели.  В ответе на запрос возвращаются предложения различных магазинов. Если есть несколько предложений от одного магазина, в ответе отображается только одно, наиболее релевантное из них. ")
    @get:JsonProperty("offers") val offers: kotlin.collections.List<ModelOfferDTO>? = null,

    @Schema(example = "null", description = "Суммарное количество предложений в розничных магазинах в регионе. Учитываются все предложения от каждого магазина.")
    @get:JsonProperty("offlineOffers") val offlineOffers: kotlin.Int? = null,

    @Schema(example = "null", description = "Суммарное количество предложений в интернет-магазинах в регионе. Учитываются все предложения от каждого магазина.")
    @get:JsonProperty("onlineOffers") val onlineOffers: kotlin.Int? = null
    ) {

}

