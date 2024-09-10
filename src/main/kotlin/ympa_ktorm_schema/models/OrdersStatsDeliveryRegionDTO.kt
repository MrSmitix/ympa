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
 * Информация о регионе доставки.
 * @param id Идентификатор региона доставки.
 * @param name Название региона доставки.
 */
object OrdersStatsDeliveryRegionDTOs : BaseTable<OrdersStatsDeliveryRegionDTO>("OrdersStatsDeliveryRegionDTO") {
    val id = long("id") /* null */ /* Идентификатор региона доставки. */
    val name = text("name") /* null */ /* Название региона доставки. */

    /**
     * Create an entity of type OrdersStatsDeliveryRegionDTO from the model
     */
    override fun doCreateEntity(row: QueryRowSet, withReferences: Boolean) = OrdersStatsDeliveryRegionDTO(
        id = row[id]  /* kotlin.Long? */ /* Идентификатор региона доставки. */,
        name = row[name]  /* kotlin.String? */ /* Название региона доставки. */
    )

    /**
    * Assign all the columns from the entity of type OrdersStatsDeliveryRegionDTO to the DML expression.
    *
    * Usage:
    *
    * ```kotlin
    * let entity = OrdersStatsDeliveryRegionDTO()
    * database.update(OrdersStatsDeliveryRegionDTOs, {
    *     assignFrom(entity)
    * })
    * ```
    * @return the builder with the columns for the update or insert.
    */
    fun AssignmentsBuilder.assignFrom(entity: OrdersStatsDeliveryRegionDTO) {
        this.apply {
            set(OrdersStatsDeliveryRegionDTOs.id, entity.id)
            set(OrdersStatsDeliveryRegionDTOs.name, entity.name)
        }
    }

}


