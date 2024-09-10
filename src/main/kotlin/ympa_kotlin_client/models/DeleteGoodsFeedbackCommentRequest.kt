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
 * Фильтр запроса отзывов по бизнесу. 
 *
 * @param id Идентификатор комментария к отзыву. 
 */


data class DeleteGoodsFeedbackCommentRequest (

    /* Идентификатор комментария к отзыву.  */
    @Json(name = "id")
    val id: kotlin.Long

) {


}

