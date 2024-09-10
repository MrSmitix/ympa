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

import ympa_kotlin_client.models.FeedDownloadErrorType

import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

/**
 * Информация об ошибке при загрузке прайс-листа. Выводится, если параметр `download status=ERROR`. 
 *
 * @param httpStatusCode HTTP-код ошибки индексации прайс-листа. Выводится, если `type=DOWNLOAD_HTTP_ERROR`. 
 * @param type 
 * @param description Описание ошибки. Выводится, если `type=DOWNLOAD_ERROR`. 
 */


data class FeedDownloadErrorDTO (

    /* HTTP-код ошибки индексации прайс-листа. Выводится, если `type=DOWNLOAD_HTTP_ERROR`.  */
    @Json(name = "httpStatusCode")
    val httpStatusCode: kotlin.Int? = null,

    @Json(name = "type")
    val type: FeedDownloadErrorType? = null,

    /* Описание ошибки. Выводится, если `type=DOWNLOAD_ERROR`.  */
    @Json(name = "description")
    val description: kotlin.String? = null

) {


}

