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
 * Информация о трек-номерах.
 *
 * @param trackCode Трек-код почтового отправления.
 */


data class TrackDTO (

    /* Трек-код почтового отправления. */
    @Json(name = "trackCode")
    val trackCode: kotlin.String? = null

) {


}

