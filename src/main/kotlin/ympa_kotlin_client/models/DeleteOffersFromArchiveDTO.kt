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
 * Товары, которые не удалось восстановить из архива.
 *
 * @param notUnarchivedOfferIds Список товаров, которые не удалось восстановить из архива.
 */


data class DeleteOffersFromArchiveDTO (

    /* Список товаров, которые не удалось восстановить из архива. */
    @Json(name = "notUnarchivedOfferIds")
    val notUnarchivedOfferIds: kotlin.collections.List<kotlin.String>? = null

) {


}

