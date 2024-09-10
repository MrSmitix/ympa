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
 * 
 * @param status 
 * @param result 
 */
object GetChatsResponses : BaseTable<GetChatsResponse>("GetChatsResponse") {
    val status = long("status") /* null */
    val result = long("result") /* null */

    /**
     * Create an entity of type GetChatsResponse from the model
     */
    override fun doCreateEntity(row: QueryRowSet, withReferences: Boolean) = GetChatsResponse(
        status = ApiResponseStatusTypes.createEntity(row, withReferences) /* ApiResponseStatusType? */,
        result = GetChatsInfoDTOs.createEntity(row, withReferences) /* GetChatsInfoDTO? */
    )

    /**
    * Assign all the columns from the entity of type GetChatsResponse to the DML expression.
    *
    * Usage:
    *
    * ```kotlin
    * let entity = GetChatsResponse()
    * database.update(GetChatsResponses, {
    *     assignFrom(entity)
    * })
    * ```
    * @return the builder with the columns for the update or insert.
    */
    fun AssignmentsBuilder.assignFrom(entity: GetChatsResponse) {
        this.apply {
            set(GetChatsResponses.status, entity.status)
            set(GetChatsResponses.result, entity.result)
        }
    }

}


