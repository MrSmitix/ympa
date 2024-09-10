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
 * description.
 * @param status 
 * @param result 
 */
object GetBidsRecommendationsResponses : BaseTable<GetBidsRecommendationsResponse>("GetBidsRecommendationsResponse") {
    val status = long("status") /* null */
    val result = long("result") /* null */

    /**
     * Create an entity of type GetBidsRecommendationsResponse from the model
     */
    override fun doCreateEntity(row: QueryRowSet, withReferences: Boolean) = GetBidsRecommendationsResponse(
        status = ApiResponseStatusTypes.createEntity(row, withReferences) /* ApiResponseStatusType? */,
        result = GetBidsRecommendationsResponseDTOs.createEntity(row, withReferences) /* GetBidsRecommendationsResponseDTO? */
    )

    /**
    * Assign all the columns from the entity of type GetBidsRecommendationsResponse to the DML expression.
    *
    * Usage:
    *
    * ```kotlin
    * let entity = GetBidsRecommendationsResponse()
    * database.update(GetBidsRecommendationsResponses, {
    *     assignFrom(entity)
    * })
    * ```
    * @return the builder with the columns for the update or insert.
    */
    fun AssignmentsBuilder.assignFrom(entity: GetBidsRecommendationsResponse) {
        this.apply {
            set(GetBidsRecommendationsResponses.status, entity.status)
            set(GetBidsRecommendationsResponses.result, entity.result)
        }
    }

}


