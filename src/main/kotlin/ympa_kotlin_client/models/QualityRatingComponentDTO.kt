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

import ympa_kotlin_client.models.QualityRatingComponentType

import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

/**
 * Составляющая индекса качества.
 *
 * @param `value` Значение составляющей в процентах.
 * @param componentType 
 */


data class QualityRatingComponentDTO (

    /* Значение составляющей в процентах. */
    @Json(name = "value")
    val `value`: kotlin.Double,

    @Json(name = "componentType")
    val componentType: QualityRatingComponentType

) {


}

