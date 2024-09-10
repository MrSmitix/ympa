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

import ympa_kotlin_client.models.PriceSuggestType

import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

/**
 * Тип цены.
 *
 * @param type 
 * @param price Цена в рублях.
 */


data class PriceSuggestDTO (

    @Json(name = "type")
    val type: PriceSuggestType? = null,

    /* Цена в рублях. */
    @Json(name = "price")
    val price: java.math.BigDecimal? = null

) {


}

