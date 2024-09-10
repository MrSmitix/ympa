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
object GetGoodsFeedbackCommentsResponses : BaseTable<GetGoodsFeedbackCommentsResponse>("GetGoodsFeedbackCommentsResponse") {
    val status = long("status") /* null */
    val result = long("result") /* null */

    /**
     * Create an entity of type GetGoodsFeedbackCommentsResponse from the model
     */
    override fun doCreateEntity(row: QueryRowSet, withReferences: Boolean) = GetGoodsFeedbackCommentsResponse(
        status = ApiResponseStatusTypes.createEntity(row, withReferences) /* ApiResponseStatusType? */,
        result = GoodsFeedbackCommentListDTOs.createEntity(row, withReferences) /* GoodsFeedbackCommentListDTO? */
    )

    /**
    * Assign all the columns from the entity of type GetGoodsFeedbackCommentsResponse to the DML expression.
    *
    * Usage:
    *
    * ```kotlin
    * let entity = GetGoodsFeedbackCommentsResponse()
    * database.update(GetGoodsFeedbackCommentsResponses, {
    *     assignFrom(entity)
    * })
    * ```
    * @return the builder with the columns for the update or insert.
    */
    fun AssignmentsBuilder.assignFrom(entity: GetGoodsFeedbackCommentsResponse) {
        this.apply {
            set(GetGoodsFeedbackCommentsResponses.status, entity.status)
            set(GetGoodsFeedbackCommentsResponses.result, entity.result)
        }
    }

}


