package ympa_kotlin_spring_server.models

import java.util.Objects
import com.fasterxml.jackson.annotation.JsonProperty
import ympa_kotlin_spring_server.models.ChannelType
import ympa_kotlin_spring_server.models.GetPromoAssortmentInfoDTO
import ympa_kotlin_spring_server.models.GetPromoBestsellerInfoDTO
import ympa_kotlin_spring_server.models.GetPromoConstraintsDTO
import ympa_kotlin_spring_server.models.GetPromoMechanicsInfoDTO
import ympa_kotlin_spring_server.models.PromoPeriodDTO
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
 * Информация об акции.
 * @param id Идентификатор акции.
 * @param name Название акции.
 * @param period 
 * @param participating Участвует или участвовал ли продавец в этой акции.  Для текущих и будущих акций возвращается со значением `true`, если в акции есть товары, которые были добавлены вручную. Если товары не участвуют в акции или добавлены в нее автоматически, параметр возвращается со значением `false`.  Для прошедших акций всегда возвращается со значением `true`.  Об автоматическом и ручном добавлении товаров в акцию читайте [в Справке Маркета для продавцов](https://yandex.ru/support2/marketplace/ru/marketing/promos/market/index). 
 * @param assortmentInfo 
 * @param mechanicsInfo 
 * @param bestsellerInfo 
 * @param channels Список каналов продвижения товаров.
 * @param constraints 
 */
data class GetPromoDTO(

    @Schema(example = "null", required = true, description = "Идентификатор акции.")
    @get:JsonProperty("id", required = true) val id: kotlin.String,

    @Schema(example = "null", required = true, description = "Название акции.")
    @get:JsonProperty("name", required = true) val name: kotlin.String,

    @field:Valid
    @Schema(example = "null", required = true, description = "")
    @get:JsonProperty("period", required = true) val period: PromoPeriodDTO,

    @Schema(example = "null", required = true, description = "Участвует или участвовал ли продавец в этой акции.  Для текущих и будущих акций возвращается со значением `true`, если в акции есть товары, которые были добавлены вручную. Если товары не участвуют в акции или добавлены в нее автоматически, параметр возвращается со значением `false`.  Для прошедших акций всегда возвращается со значением `true`.  Об автоматическом и ручном добавлении товаров в акцию читайте [в Справке Маркета для продавцов](https://yandex.ru/support2/marketplace/ru/marketing/promos/market/index). ")
    @get:JsonProperty("participating", required = true) val participating: kotlin.Boolean,

    @field:Valid
    @Schema(example = "null", required = true, description = "")
    @get:JsonProperty("assortmentInfo", required = true) val assortmentInfo: GetPromoAssortmentInfoDTO,

    @field:Valid
    @Schema(example = "null", required = true, description = "")
    @get:JsonProperty("mechanicsInfo", required = true) val mechanicsInfo: GetPromoMechanicsInfoDTO,

    @field:Valid
    @Schema(example = "null", required = true, description = "")
    @get:JsonProperty("bestsellerInfo", required = true) val bestsellerInfo: GetPromoBestsellerInfoDTO,

    @field:Valid
    @Schema(example = "null", description = "Список каналов продвижения товаров.")
    @get:JsonProperty("channels") val channels: kotlin.collections.List<ChannelType>? = null,

    @field:Valid
    @Schema(example = "null", description = "")
    @get:JsonProperty("constraints") val constraints: GetPromoConstraintsDTO? = null
    ) {

}

