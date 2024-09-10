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

import ympa_kotlin_client.models.ModelOfferDTO
import ympa_kotlin_client.models.ModelPriceDTO

import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

/**
 * Модель товара.
 *
 * @param id Идентификатор модели товара.
 * @param name Название модели товара.
 * @param prices 
 * @param offers Список первых десяти предложений, расположенных на карточке модели.  В ответе на запрос возвращаются предложения различных магазинов. Если есть несколько предложений от одного магазина, в ответе отображается только одно, наиболее релевантное из них. 
 * @param offlineOffers Суммарное количество предложений в розничных магазинах в регионе. Учитываются все предложения от каждого магазина.
 * @param onlineOffers Суммарное количество предложений в интернет-магазинах в регионе. Учитываются все предложения от каждого магазина.
 */


data class EnrichedModelDTO (

    /* Идентификатор модели товара. */
    @Json(name = "id")
    val id: kotlin.Long? = null,

    /* Название модели товара. */
    @Json(name = "name")
    val name: kotlin.String? = null,

    @Json(name = "prices")
    val prices: ModelPriceDTO? = null,

    /* Список первых десяти предложений, расположенных на карточке модели.  В ответе на запрос возвращаются предложения различных магазинов. Если есть несколько предложений от одного магазина, в ответе отображается только одно, наиболее релевантное из них.  */
    @Json(name = "offers")
    val offers: kotlin.collections.List<ModelOfferDTO>? = null,

    /* Суммарное количество предложений в розничных магазинах в регионе. Учитываются все предложения от каждого магазина. */
    @Json(name = "offlineOffers")
    val offlineOffers: kotlin.Int? = null,

    /* Суммарное количество предложений в интернет-магазинах в регионе. Учитываются все предложения от каждого магазина. */
    @Json(name = "onlineOffers")
    val onlineOffers: kotlin.Int? = null

) {


}

