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
 * Информация о группе складов.
 * @param name Название группы складов.
 * @param mainWarehouse 
 * @param warehouses Список складов, входящих в группу.
 */
object WarehouseGroupDTOs : BaseTable<WarehouseGroupDTO>("WarehouseGroupDTO") {
    val name = text("name") /* Название группы складов. */
    val mainWarehouse = long("mainWarehouse")

    /**
     * Create an entity of type WarehouseGroupDTO from the model
     */
    override fun doCreateEntity(row: QueryRowSet, withReferences: Boolean) = WarehouseGroupDTO(
        name = row[name] ?: "" /* kotlin.String */ /* Название группы складов. */,
        mainWarehouse = WarehouseDTOs.createEntity(row, withReferences) /* WarehouseDTO */,
        warehouses = emptyList() /* kotlin.Array<WarehouseDTO> */ /* Список складов, входящих в группу. */
    )

    /**
    * Assign all the columns from the entity of type WarehouseGroupDTO to the DML expression.
    *
    * Usage:
    *
    * ```kotlin
    * let entity = WarehouseGroupDTO()
    * database.update(WarehouseGroupDTOs, {
    *     assignFrom(entity)
    * })
    * ```
    * @return the builder with the columns for the update or insert.
    */
    fun AssignmentsBuilder.assignFrom(entity: WarehouseGroupDTO) {
        this.apply {
            set(WarehouseGroupDTOs.name, entity.name)
            set(WarehouseGroupDTOs.mainWarehouse, entity.mainWarehouse)
        }
    }

}


object WarehouseGroupDTOWarehouseDTO : BaseTable<Pair<kotlin.Long, kotlin.Long>>("WarehouseGroupDTOWarehouseDTO") {
    val warehouseGroupDTO = long("warehouseGroupDTO")
    val warehouseDTO = long("warehouseDTO")

    override fun doCreateEntity(row: QueryRowSet, withReferences: Boolean): Pair<kotlin.Long, kotlin.Long> =
        Pair(row[warehouseGroupDTO] ?: 0, row[warehouseDTO] ?: 0)

    fun AssignmentsBuilder.assignFrom(entity: Pair<kotlin.Long, kotlin.Long>) {
        this.apply {
            set(WarehouseGroupDTOWarehouseDTO.warehouseGroupDTO, entity.first)
            set(WarehouseGroupDTOWarehouseDTO.warehouseDTO, entity.second)
        }
    }

}

