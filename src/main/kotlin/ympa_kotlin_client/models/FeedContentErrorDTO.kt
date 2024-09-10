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

import ympa_kotlin_client.models.FeedContentErrorType

import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

/**
 * Информация об ошибке в содержимом прайс-листа. Выводится, если параметр `content status=ERROR`. 
 *
 * @param type 
 */


data class FeedContentErrorDTO (

    @Json(name = "type")
    val type: FeedContentErrorType? = null

) {


}

