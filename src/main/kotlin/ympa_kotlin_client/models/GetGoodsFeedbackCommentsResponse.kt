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
import ympa_kotlin_client.models.GoodsFeedbackCommentListDTO

import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

/**
 * 
 *
 * @param status 
 * @param result 
 */


data class GetGoodsFeedbackCommentsResponse (

    @Json(name = "status")
    val status: ApiResponseStatusType? = null,

    @Json(name = "result")
    val result: GoodsFeedbackCommentListDTO? = null

) {


}

