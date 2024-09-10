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
 * Информация о кабинете.
 *
 * @param id Идентификатор кабинета.
 * @param name Название бизнеса.
 */


data class BusinessDTO (

    /* Идентификатор кабинета. */
    @Json(name = "id")
    val id: kotlin.Long? = null,

    /* Название бизнеса. */
    @Json(name = "name")
    val name: kotlin.String? = null

) {


}

