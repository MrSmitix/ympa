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

import ympa_kotlin_client.models.FeedbackDTO
import ympa_kotlin_client.models.ScrollingPagerDTO

import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

/**
 * Отзывы пользователей Яндекс Маркета об указанном магазине.
 *
 * @param feedbackList Список отзывов.  Содержит не более 20 отзывов. 
 * @param paging 
 */


data class FeedbackListDTO (

    /* Список отзывов.  Содержит не более 20 отзывов.  */
    @Json(name = "feedbackList")
    val feedbackList: kotlin.collections.List<FeedbackDTO>,

    @Json(name = "paging")
    val paging: ScrollingPagerDTO? = null

) {


}

