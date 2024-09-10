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

import ympa_kotlin_client.models.CurrencyType
import ympa_kotlin_client.models.FlippingPagerDTO
import ympa_kotlin_client.models.ModelDTO

import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

/**
 * 
 *
 * @param models Список моделей товаров.
 * @param currency 
 * @param regionId Идентификатор региона, для которого выводится информация о предложениях модели (доставляемых в этот регион).  Информацию о регионе по идентификатору можно получить с помощью запроса [GET regions/{regionId}](../../reference/regions/searchRegionsById.md). 
 * @param pager 
 */


data class SearchModelsResponse (

    /* Список моделей товаров. */
    @Json(name = "models")
    val models: kotlin.collections.List<ModelDTO>,

    @Json(name = "currency")
    val currency: CurrencyType? = null,

    /* Идентификатор региона, для которого выводится информация о предложениях модели (доставляемых в этот регион).  Информацию о регионе по идентификатору можно получить с помощью запроса [GET regions/{regionId}](../../reference/regions/searchRegionsById.md).  */
    @Json(name = "regionId")
    val regionId: kotlin.Long? = null,

    @Json(name = "pager")
    val pager: FlippingPagerDTO? = null

) {


}

