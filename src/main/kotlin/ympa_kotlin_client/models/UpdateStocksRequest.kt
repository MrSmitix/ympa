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

import ympa_kotlin_client.models.UpdateStockDTO

import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

/**
 * Запрос на изменение информации по остаткам товаров.
 *
 * @param skus Данные об остатках товаров. 
 */


data class UpdateStocksRequest (

    /* Данные об остатках товаров.  */
    @Json(name = "skus")
    val skus: kotlin.collections.Set<UpdateStockDTO>

) {


}

