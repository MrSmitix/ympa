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
import ympa_kotlin_client.models.GetHiddenOffersResultDTO

import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

/**
 * Ответ на запрос списка скрытий.
 *
 * @param status 
 * @param result 
 */


data class GetHiddenOffersResponse (

    @Json(name = "status")
    val status: ApiResponseStatusType? = null,

    @Json(name = "result")
    val result: GetHiddenOffersResultDTO? = null

) {


}

