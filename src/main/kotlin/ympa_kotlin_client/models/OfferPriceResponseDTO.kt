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

import ympa_kotlin_client.models.PriceDTO

import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

/**
 * Информация об установленной цене на товар.
 *
 * @param id Идентификатор предложения из прайс-листа.
 * @param price 
 * @param marketSku SKU на Маркете.
 * @param updatedAt Дата и время последнего обновления цены на товар.
 */


data class OfferPriceResponseDTO (

    /* Идентификатор предложения из прайс-листа. */
    @Json(name = "id")
    val id: kotlin.String? = null,

    @Json(name = "price")
    val price: PriceDTO? = null,

    /* SKU на Маркете. */
    @Json(name = "marketSku")
    val marketSku: kotlin.Long? = null,

    /* Дата и время последнего обновления цены на товар. */
    @Json(name = "updatedAt")
    val updatedAt: java.time.OffsetDateTime? = null

) {


}

