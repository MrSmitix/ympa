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
 * Информация об остатках товара. 
 * @param count Количество доступного товара. 
 * @param updatedAt Дата и время последнего обновления информации об остатках. <br><br> Если вы не передали параметр `updatedAt`, используется текущее время. <br><br> Формат даты и времени: ISO 8601 со смещением относительно UTC. Например, `2017-11-21T00:42:42+03:00`. 
 */
object UpdateStockItemDTOs : BaseTable<UpdateStockItemDTO>("UpdateStockItemDTO") {
    val count = long("count") /* Количество доступного товара.  */
    val updatedAt = datetime("updatedAt") /* null */ /* Дата и время последнего обновления информации об остатках. <br><br> Если вы не передали параметр `updatedAt`, используется текущее время. <br><br> Формат даты и времени: ISO 8601 со смещением относительно UTC. Например, `2017-11-21T00:42:42+03:00`.  */

    /**
     * Create an entity of type UpdateStockItemDTO from the model
     */
    override fun doCreateEntity(row: QueryRowSet, withReferences: Boolean) = UpdateStockItemDTO(
        count = row[count] ?: 0 /* kotlin.Long */ /* Количество доступного товара.  */,
        updatedAt = row[updatedAt]  /* java.time.LocalDateTime? */ /* Дата и время последнего обновления информации об остатках. <br><br> Если вы не передали параметр `updatedAt`, используется текущее время. <br><br> Формат даты и времени: ISO 8601 со смещением относительно UTC. Например, `2017-11-21T00:42:42+03:00`.  */
    )

    /**
    * Assign all the columns from the entity of type UpdateStockItemDTO to the DML expression.
    *
    * Usage:
    *
    * ```kotlin
    * let entity = UpdateStockItemDTO()
    * database.update(UpdateStockItemDTOs, {
    *     assignFrom(entity)
    * })
    * ```
    * @return the builder with the columns for the update or insert.
    */
    fun AssignmentsBuilder.assignFrom(entity: UpdateStockItemDTO) {
        this.apply {
            set(UpdateStockItemDTOs.count, entity.count)
            set(UpdateStockItemDTOs.updatedAt, entity.updatedAt)
        }
    }

}


