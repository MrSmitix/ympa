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

import ympa_kotlin_client.models.QualityRatingAffectedOrderDTO

import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

/**
 * Информация о заказах, которые повлияли на индекс качества.
 *
 * @param affectedOrders Список заказов, которые повлияли на индекс качества.
 */


data class QualityRatingDetailsDTO (

    /* Список заказов, которые повлияли на индекс качества. */
    @Json(name = "affectedOrders")
    val affectedOrders: kotlin.collections.List<QualityRatingAffectedOrderDTO>

) {


}

