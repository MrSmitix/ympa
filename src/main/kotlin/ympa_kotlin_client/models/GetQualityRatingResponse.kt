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

import ympa_kotlin_client.models.ApiResponseStatusType
import ympa_kotlin_client.models.CampaignsQualityRatingDTO

import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

/**
 * Информация об индексе качества магазинов.
 *
 * @param status 
 * @param result 
 */


data class GetQualityRatingResponse (

    @Json(name = "status")
    val status: ApiResponseStatusType? = null,

    @Json(name = "result")
    val result: CampaignsQualityRatingDTO? = null

) {


}

