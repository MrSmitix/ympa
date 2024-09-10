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

import ympa_kotlin_client.models.CampaignSettingsDeliveryDTO
import ympa_kotlin_client.models.CampaignSettingsScheduleSourceType
import ympa_kotlin_client.models.RegionType

import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

/**
 * Информация о своем регионе магазина.
 *
 * @param id Идентификатор региона.
 * @param name Название региона.
 * @param type 
 * @param deliveryOptionsSource 
 * @param delivery 
 */


data class CampaignSettingsLocalRegionDTO (

    /* Идентификатор региона. */
    @Json(name = "id")
    val id: kotlin.Long? = null,

    /* Название региона. */
    @Json(name = "name")
    val name: kotlin.String? = null,

    @Json(name = "type")
    val type: RegionType? = null,

    @Json(name = "deliveryOptionsSource")
    val deliveryOptionsSource: CampaignSettingsScheduleSourceType? = null,

    @Json(name = "delivery")
    val delivery: CampaignSettingsDeliveryDTO? = null

) {


}

