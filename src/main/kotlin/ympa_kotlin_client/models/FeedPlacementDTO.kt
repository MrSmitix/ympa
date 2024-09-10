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

import ympa_kotlin_client.models.FeedStatusType

import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

/**
 * Информация о размещении предложений из прайс-листа на Маркете на момент выполнения запроса.
 *
 * @param status 
 * @param totalOffersCount Количество предложений из прайс-листа, которые размещаются на Яндекс Маркете в момент выполнения запроса.
 */


data class FeedPlacementDTO (

    @Json(name = "status")
    val status: FeedStatusType? = null,

    /* Количество предложений из прайс-листа, которые размещаются на Яндекс Маркете в момент выполнения запроса. */
    @Json(name = "totalOffersCount")
    val totalOffersCount: kotlin.Int? = null

) {


}

