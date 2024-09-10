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
 * Детали расчета конкретной услуги Маркета.
 *
 * @param name Название параметра.
 * @param `value` Значение параметра.
 */


data class TariffParameterDTO (

    /* Название параметра. */
    @Json(name = "name")
    val name: kotlin.String,

    /* Значение параметра. */
    @Json(name = "value")
    val `value`: kotlin.String

) {


}

