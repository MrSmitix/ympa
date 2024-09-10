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
 * Данные, необходимые для генерации документа. 
 *
 * @param campaignId Идентификатор кампании.
 * @param shipmentId Идентификатор отгрузки.
 * @param orderIds Фильтр по идентификаторам заказа в отгрузке.
 */


data class GenerateShipmentListDocumentReportRequest (

    /* Идентификатор кампании. */
    @Json(name = "campaignId")
    val campaignId: kotlin.Long,

    /* Идентификатор отгрузки. */
    @Json(name = "shipmentId")
    val shipmentId: kotlin.Long? = null,

    /* Фильтр по идентификаторам заказа в отгрузке. */
    @Json(name = "orderIds")
    val orderIds: kotlin.collections.List<kotlin.Long>? = null

) {


}

