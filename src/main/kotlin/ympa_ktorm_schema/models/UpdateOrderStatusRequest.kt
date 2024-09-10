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
 * @param order 
 */
object UpdateOrderStatusRequests : BaseTable<UpdateOrderStatusRequest>("UpdateOrderStatusRequest") {
    val order = long("order")

    /**
     * Create an entity of type UpdateOrderStatusRequest from the model
     */
    override fun doCreateEntity(row: QueryRowSet, withReferences: Boolean) = UpdateOrderStatusRequest(
        order = OrderStatusChangeDTOs.createEntity(row, withReferences) /* OrderStatusChangeDTO */
    )

    /**
    * Assign all the columns from the entity of type UpdateOrderStatusRequest to the DML expression.
    *
    * Usage:
    *
    * ```kotlin
    * let entity = UpdateOrderStatusRequest()
    * database.update(UpdateOrderStatusRequests, {
    *     assignFrom(entity)
    * })
    * ```
    * @return the builder with the columns for the update or insert.
    */
    fun AssignmentsBuilder.assignFrom(entity: UpdateOrderStatusRequest) {
        this.apply {
            set(UpdateOrderStatusRequests.order, entity.order)
        }
    }

}


