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
 * Информация о товарах в акции.
 * @param activeOffers Количество товаров, которые участвуют или участвовали в акции.  Учитываются только товары, которые были добавлены вручную.  Об автоматическом и ручном добавлении товаров в акцию читайте [в Справке Маркета для продавцов](https://yandex.ru/support2/marketplace/ru/marketing/promos/market/index). 
 * @param potentialOffers Количество доступных товаров в акции.  Параметр возвращается только для текущих и будущих акций. 
 * @param processing Есть ли изменения в ассортименте, которые еще не применились. Сохранение изменений занимает некоторое время.  Параметр возвращается только для текущих и будущих акций. 
 */
data class GetPromoAssortmentInfoDTO(

    @Schema(example = "null", required = true, description = "Количество товаров, которые участвуют или участвовали в акции.  Учитываются только товары, которые были добавлены вручную.  Об автоматическом и ручном добавлении товаров в акцию читайте [в Справке Маркета для продавцов](https://yandex.ru/support2/marketplace/ru/marketing/promos/market/index). ")
    @get:JsonProperty("activeOffers", required = true) val activeOffers: kotlin.Int,

    @Schema(example = "null", description = "Количество доступных товаров в акции.  Параметр возвращается только для текущих и будущих акций. ")
    @get:JsonProperty("potentialOffers") val potentialOffers: kotlin.Int? = null,

    @Schema(example = "null", description = "Есть ли изменения в ассортименте, которые еще не применились. Сохранение изменений занимает некоторое время.  Параметр возвращается только для текущих и будущих акций. ")
    @get:JsonProperty("processing") val processing: kotlin.Boolean? = null
    ) {

}

