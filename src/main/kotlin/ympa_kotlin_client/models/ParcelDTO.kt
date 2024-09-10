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

import ympa_kotlin_client.models.ParcelBoxDTO

import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

/**
 * Информация о грузовых местах в заказе.
 *
 * @param boxes Список грузовых мест. Маркет определяет количество мест по длине этого списка.
 */


data class ParcelDTO (

    /* Список грузовых мест. Маркет определяет количество мест по длине этого списка. */
    @Json(name = "boxes")
    val boxes: kotlin.collections.List<ParcelBoxDTO>

) {


}

