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
 * Результат разархивации товаров.
 * @param status 
 * @param result 
 */
object DeleteOffersFromArchiveResponses : BaseTable<DeleteOffersFromArchiveResponse>("DeleteOffersFromArchiveResponse") {
    val status = long("status") /* null */
    val result = long("result") /* null */

    /**
     * Create an entity of type DeleteOffersFromArchiveResponse from the model
     */
    override fun doCreateEntity(row: QueryRowSet, withReferences: Boolean) = DeleteOffersFromArchiveResponse(
        status = ApiResponseStatusTypes.createEntity(row, withReferences) /* ApiResponseStatusType? */,
        result = DeleteOffersFromArchiveDTOs.createEntity(row, withReferences) /* DeleteOffersFromArchiveDTO? */
    )

    /**
    * Assign all the columns from the entity of type DeleteOffersFromArchiveResponse to the DML expression.
    *
    * Usage:
    *
    * ```kotlin
    * let entity = DeleteOffersFromArchiveResponse()
    * database.update(DeleteOffersFromArchiveResponses, {
    *     assignFrom(entity)
    * })
    * ```
    * @return the builder with the columns for the update or insert.
    */
    fun AssignmentsBuilder.assignFrom(entity: DeleteOffersFromArchiveResponse) {
        this.apply {
            set(DeleteOffersFromArchiveResponses.status, entity.status)
            set(DeleteOffersFromArchiveResponses.result, entity.result)
        }
    }

}


