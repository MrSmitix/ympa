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

import ympa_kotlin_client.models.CurrencyType

import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

/**
 * Настройки кабинета.
 *
 * @param onlyDefaultPrice Можно ли установить только [базовую цену](*rule): * `false` — можно задать и базовую цену, и цены в конкретных магазинах. * `true` — можно задать только базовую цену. 
 * @param currency 
 */


data class BusinessSettingsDTO (

    /* Можно ли установить только [базовую цену](*rule): * `false` — можно задать и базовую цену, и цены в конкретных магазинах. * `true` — можно задать только базовую цену.  */
    @Json(name = "onlyDefaultPrice")
    val onlyDefaultPrice: kotlin.Boolean? = null,

    @Json(name = "currency")
    val currency: CurrencyType? = null

) {


}

