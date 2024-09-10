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
 * Запрос на подтверждение цены. 
 *
 * @param offerIds Идентификаторы товаров, у которых подтверждается цена.
 */


data class ConfirmPricesRequest (

    /* Идентификаторы товаров, у которых подтверждается цена. */
    @Json(name = "offerIds")
    val offerIds: kotlin.collections.List<kotlin.String>

) {


}

