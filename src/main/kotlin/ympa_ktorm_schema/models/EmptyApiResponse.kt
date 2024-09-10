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
 * Пустой ответ сервера.
 * @param status 
 */
object EmptyApiResponses : BaseTable<EmptyApiResponse>("EmptyApiResponse") {
    val status = long("status") /* null */

    /**
     * Create an entity of type EmptyApiResponse from the model
     */
    override fun doCreateEntity(row: QueryRowSet, withReferences: Boolean) = EmptyApiResponse(
        status = ApiResponseStatusTypes.createEntity(row, withReferences) /* ApiResponseStatusType? */
    )

    /**
    * Assign all the columns from the entity of type EmptyApiResponse to the DML expression.
    *
    * Usage:
    *
    * ```kotlin
    * let entity = EmptyApiResponse()
    * database.update(EmptyApiResponses, {
    *     assignFrom(entity)
    * })
    * ```
    * @return the builder with the columns for the update or insert.
    */
    fun AssignmentsBuilder.assignFrom(entity: EmptyApiResponse) {
        this.apply {
            set(EmptyApiResponses.status, entity.status)
        }
    }

}


