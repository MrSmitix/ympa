/**
 *
 * Please note:
 * This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * Do not edit this file manually.
 *
 */

@file:Suppress(
    "ArrayInDataClass",
    "EnumEntryName",
    "RemoveRedundantQualifierName",
    "UnusedImport"
)

package ympa_kotlin_client.models

import ympa_kotlin_client.models.ChannelType
import ympa_kotlin_client.models.GetPromoAssortmentInfoDTO
import ympa_kotlin_client.models.GetPromoBestsellerInfoDTO
import ympa_kotlin_client.models.GetPromoConstraintsDTO
import ympa_kotlin_client.models.GetPromoMechanicsInfoDTO
import ympa_kotlin_client.models.PromoPeriodDTO

import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

/**
 * Информация об акции.
 *
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


data class GetPromoDTO (

    /* Идентификатор акции. */
    @Json(name = "id")
    val id: kotlin.String,

    /* Название акции. */
    @Json(name = "name")
    val name: kotlin.String,

    @Json(name = "period")
    val period: PromoPeriodDTO,

    /* Участвует или участвовал ли продавец в этой акции.  Для текущих и будущих акций возвращается со значением `true`, если в акции есть товары, которые были добавлены вручную. Если товары не участвуют в акции или добавлены в нее автоматически, параметр возвращается со значением `false`.  Для прошедших акций всегда возвращается со значением `true`.  Об автоматическом и ручном добавлении товаров в акцию читайте [в Справке Маркета для продавцов](https://yandex.ru/support2/marketplace/ru/marketing/promos/market/index).  */
    @Json(name = "participating")
    val participating: kotlin.Boolean,

    @Json(name = "assortmentInfo")
    val assortmentInfo: GetPromoAssortmentInfoDTO,

    @Json(name = "mechanicsInfo")
    val mechanicsInfo: GetPromoMechanicsInfoDTO,

    @Json(name = "bestsellerInfo")
    val bestsellerInfo: GetPromoBestsellerInfoDTO,

    /* Список каналов продвижения товаров. */
    @Json(name = "channels")
    val channels: kotlin.collections.List<ChannelType>? = null,

    @Json(name = "constraints")
    val constraints: GetPromoConstraintsDTO? = null

) {


}

