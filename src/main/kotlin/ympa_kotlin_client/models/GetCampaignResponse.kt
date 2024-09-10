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

import ympa_kotlin_client.models.CampaignDTO

import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

/**
 * Информация о магазине к данным идентификатора кампании.
 *
 * @param campaign 
 */


data class GetCampaignResponse (

    @Json(name = "campaign")
    val campaign: CampaignDTO? = null

) {


}

