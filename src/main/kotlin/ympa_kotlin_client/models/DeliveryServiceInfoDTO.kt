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
 * Информация о службе доставки.
 *
 * @param id Идентификатор службы доставки.
 * @param name Наименование службы доставки.
 */


data class DeliveryServiceInfoDTO (

    /* Идентификатор службы доставки. */
    @Json(name = "id")
    val id: kotlin.Long,

    /* Наименование службы доставки. */
    @Json(name = "name")
    val name: kotlin.String

) {


}

