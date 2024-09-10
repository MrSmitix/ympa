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

import ympa_kotlin_client.models.PriceQuarantineVerdictParameterDTO
import ympa_kotlin_client.models.PriceQuarantineVerdictType

import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

/**
 * Причина попадания товара в карантин.
 *
 * @param params Цена, из-за которой товар попал в карантин, и значения для сравнения. Конкретный набор параметров зависит от типа карантина.
 * @param type 
 */


data class PriceQuarantineVerdictDTO (

    /* Цена, из-за которой товар попал в карантин, и значения для сравнения. Конкретный набор параметров зависит от типа карантина. */
    @Json(name = "params")
    val params: kotlin.collections.List<PriceQuarantineVerdictParameterDTO>,

    @Json(name = "type")
    val type: PriceQuarantineVerdictType? = null

) {


}

