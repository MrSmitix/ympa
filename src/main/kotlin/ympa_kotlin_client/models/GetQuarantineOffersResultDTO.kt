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

import ympa_kotlin_client.models.QuarantineOfferDTO
import ympa_kotlin_client.models.ScrollingPagerDTO

import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

/**
 * Список товаров в карантине.
 *
 * @param offers Страница списка товаров в карантине.
 * @param paging 
 */


data class GetQuarantineOffersResultDTO (

    /* Страница списка товаров в карантине. */
    @Json(name = "offers")
    val offers: kotlin.collections.List<QuarantineOfferDTO>,

    @Json(name = "paging")
    val paging: ScrollingPagerDTO? = null

) {


}

