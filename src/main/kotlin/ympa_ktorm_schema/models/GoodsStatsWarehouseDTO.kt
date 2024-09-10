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
 * Информация о складе.
 * @param stocks Информация об остатках товаров на складе.
 * @param id Идентификатор склада.
 * @param name Название склада.
 */
object GoodsStatsWarehouseDTOs : BaseTable<GoodsStatsWarehouseDTO>("GoodsStatsWarehouseDTO") {
    val id = long("id") /* null */ /* Идентификатор склада. */
    val name = text("name") /* null */ /* Название склада. */

    /**
     * Create an entity of type GoodsStatsWarehouseDTO from the model
     */
    override fun doCreateEntity(row: QueryRowSet, withReferences: Boolean) = GoodsStatsWarehouseDTO(
        stocks = emptyList() /* kotlin.Array<WarehouseStockDTO> */ /* Информация об остатках товаров на складе. */,
        id = row[id]  /* kotlin.Long? */ /* Идентификатор склада. */,
        name = row[name]  /* kotlin.String? */ /* Название склада. */
    )

    /**
    * Assign all the columns from the entity of type GoodsStatsWarehouseDTO to the DML expression.
    *
    * Usage:
    *
    * ```kotlin
    * let entity = GoodsStatsWarehouseDTO()
    * database.update(GoodsStatsWarehouseDTOs, {
    *     assignFrom(entity)
    * })
    * ```
    * @return the builder with the columns for the update or insert.
    */
    fun AssignmentsBuilder.assignFrom(entity: GoodsStatsWarehouseDTO) {
        this.apply {
            set(GoodsStatsWarehouseDTOs.id, entity.id)
            set(GoodsStatsWarehouseDTOs.name, entity.name)
        }
    }

}


object GoodsStatsWarehouseDTOWarehouseStockDTO : BaseTable<Pair<kotlin.Long, kotlin.Long>>("GoodsStatsWarehouseDTOWarehouseStockDTO") {
    val goodsStatsWarehouseDTO = long("goodsStatsWarehouseDTO")
    val warehouseStockDTO = long("warehouseStockDTO")

    override fun doCreateEntity(row: QueryRowSet, withReferences: Boolean): Pair<kotlin.Long, kotlin.Long> =
        Pair(row[goodsStatsWarehouseDTO] ?: 0, row[warehouseStockDTO] ?: 0)

    fun AssignmentsBuilder.assignFrom(entity: Pair<kotlin.Long, kotlin.Long>) {
        this.apply {
            set(GoodsStatsWarehouseDTOWarehouseStockDTO.goodsStatsWarehouseDTO, entity.first)
            set(GoodsStatsWarehouseDTOWarehouseStockDTO.warehouseStockDTO, entity.second)
        }
    }

}

