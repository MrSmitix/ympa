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

import ympa_kotlin_client.models.ForwardScrollingPagerDTO
import ympa_kotlin_client.models.GoodsFeedbackCommentDTO

import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

/**
 * Комментарии к отзыву.
 *
 * @param comments Список комментариев.
 * @param paging 
 */


data class GoodsFeedbackCommentListDTO (

    /* Список комментариев. */
    @Json(name = "comments")
    val comments: kotlin.collections.List<GoodsFeedbackCommentDTO>,

    @Json(name = "paging")
    val paging: ForwardScrollingPagerDTO? = null

) {


}

