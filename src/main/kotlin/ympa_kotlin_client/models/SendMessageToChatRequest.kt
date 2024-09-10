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
 * В какой чат нужно отправить сообщение и текст сообщения.
 *
 * @param message Текст сообщения. Максимальная длина — 4096 символа.
 */


data class SendMessageToChatRequest (

    /* Текст сообщения. Максимальная длина — 4096 символа. */
    @Json(name = "message")
    val message: kotlin.String

) {


}

