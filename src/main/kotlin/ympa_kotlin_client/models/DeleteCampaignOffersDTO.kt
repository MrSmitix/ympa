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


import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

/**
 * Список товаров, которые не удалось удалить, потому что они не найдены или хранятся на складе Маркета.
 *
 * @param notDeletedOfferIds Список SKU.
 */


data class DeleteCampaignOffersDTO (

    /* Список SKU. */
    @Json(name = "notDeletedOfferIds")
    val notDeletedOfferIds: kotlin.collections.List<kotlin.String>? = null

) {


}

