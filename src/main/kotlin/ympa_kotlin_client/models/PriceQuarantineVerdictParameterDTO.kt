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

import ympa_kotlin_client.models.PriceQuarantineVerdictParamNameType

import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

/**
 * Параметр карантина.
 *
 * @param name 
 * @param `value` Значение параметра.
 */


data class PriceQuarantineVerdictParameterDTO (

    @Json(name = "name")
    val name: PriceQuarantineVerdictParamNameType,

    /* Значение параметра. */
    @Json(name = "value")
    val `value`: kotlin.String

) {


}

