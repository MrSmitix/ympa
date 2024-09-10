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
 * Общее вознаграждение партнеру за DBS-доставку и все скидки на товар:  * по промокодам, купонам и акциям; * по баллам Плюса; * по доставке (DBS).  Передается в валюте заказа. 
 * @param type 
 * @param amount Сумма субсидии.
 */
object OrderSubsidyDTOs : BaseTable<OrderSubsidyDTO>("OrderSubsidyDTO") {
    val type = long("type") /* null */
    val amount = decimal("amount") /* null */ /* Сумма субсидии. */

    /**
     * Create an entity of type OrderSubsidyDTO from the model
     */
    override fun doCreateEntity(row: QueryRowSet, withReferences: Boolean) = OrderSubsidyDTO(
        type = OrderSubsidyTypes.createEntity(row, withReferences) /* OrderSubsidyType? */,
        amount = row[amount]  /* java.math.BigDecimal? */ /* Сумма субсидии. */
    )

    /**
    * Assign all the columns from the entity of type OrderSubsidyDTO to the DML expression.
    *
    * Usage:
    *
    * ```kotlin
    * let entity = OrderSubsidyDTO()
    * database.update(OrderSubsidyDTOs, {
    *     assignFrom(entity)
    * })
    * ```
    * @return the builder with the columns for the update or insert.
    */
    fun AssignmentsBuilder.assignFrom(entity: OrderSubsidyDTO) {
        this.apply {
            set(OrderSubsidyDTOs.type, entity.type)
            set(OrderSubsidyDTOs.amount, entity.amount)
        }
    }

}


