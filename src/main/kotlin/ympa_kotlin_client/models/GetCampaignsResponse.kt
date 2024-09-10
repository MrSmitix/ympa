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

import ympa_kotlin_client.models.CampaignDTO
import ympa_kotlin_client.models.FlippingPagerDTO

import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

/**
 * Результаты поиска магазинов.
 *
 * @param campaigns Список с информацией по каждому магазину.
 * @param pager 
 */


data class GetCampaignsResponse (

    /* Список с информацией по каждому магазину. */
    @Json(name = "campaigns")
    val campaigns: kotlin.collections.List<CampaignDTO>,

    @Json(name = "pager")
    val pager: FlippingPagerDTO? = null

) {


}

