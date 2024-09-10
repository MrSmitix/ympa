/**
* Партнерский API Маркета
* API Яндекс Маркета помогает продавцам автоматизировать и упростить работу с маркетплейсом.  В числе возможностей интеграции:  * управление каталогом товаров и витриной,  * обработка заказов,  * изменение настроек магазина,  * получение отчетов. 
*
* The version of the OpenAPI document: LATEST
* 
*
* NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
* https://openapi-generator.tech
* Do not edit the class manually.
*/
package ympa_ktorm_schema.models

import org.ktorm.dsl.*
import org.ktorm.schema.*
import org.ktorm.database.Database
import .*


/**
 * Ответ на запрос настроек магазина.
 * @param settings 
 */
object GetCampaignSettingsResponses : BaseTable<GetCampaignSettingsResponse>("GetCampaignSettingsResponse") {
    val settings = long("settings") /* null */

    /**
     * Create an entity of type GetCampaignSettingsResponse from the model
     */
    override fun doCreateEntity(row: QueryRowSet, withReferences: Boolean) = GetCampaignSettingsResponse(
        settings = CampaignSettingsDTOs.createEntity(row, withReferences) /* CampaignSettingsDTO? */
    )

    /**
    * Assign all the columns from the entity of type GetCampaignSettingsResponse to the DML expression.
    *
    * Usage:
    *
    * ```kotlin
    * let entity = GetCampaignSettingsResponse()
    * database.update(GetCampaignSettingsResponses, {
    *     assignFrom(entity)
    * })
    * ```
    * @return the builder with the columns for the update or insert.
    */
    fun AssignmentsBuilder.assignFrom(entity: GetCampaignSettingsResponse) {
        this.apply {
            set(GetCampaignSettingsResponses.settings, entity.settings)
        }
    }

}


