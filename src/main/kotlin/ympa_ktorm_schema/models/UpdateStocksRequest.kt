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
 * Запрос на изменение информации по остаткам товаров.
 * @param skus Данные об остатках товаров. 
 */
object UpdateStocksRequests : BaseTable<UpdateStocksRequest>("UpdateStocksRequest") {

    /**
     * Create an entity of type UpdateStocksRequest from the model
     */
    override fun doCreateEntity(row: QueryRowSet, withReferences: Boolean) = UpdateStocksRequest(
        skus = emptyList() /* kotlin.collections.Set<UpdateStockDTO> */ /* Данные об остатках товаров.  */
    )

    /**
    * Assign all the columns from the entity of type UpdateStocksRequest to the DML expression.
    *
    * Usage:
    *
    * ```kotlin
    * let entity = UpdateStocksRequest()
    * database.update(UpdateStocksRequests, {
    *     assignFrom(entity)
    * })
    * ```
    * @return the builder with the columns for the update or insert.
    */
    fun AssignmentsBuilder.assignFrom(entity: UpdateStocksRequest) {
        this.apply {
        }
    }

}


object UpdateStocksRequestUpdateStockDTO : BaseTable<Pair<kotlin.Long, kotlin.Long>>("UpdateStocksRequestUpdateStockDTO") {
    val updateStocksRequest = long("updateStocksRequest")
    val updateStockDTO = long("updateStockDTO")

    override fun doCreateEntity(row: QueryRowSet, withReferences: Boolean): Pair<kotlin.Long, kotlin.Long> =
        Pair(row[updateStocksRequest] ?: 0, row[updateStockDTO] ?: 0)

    fun AssignmentsBuilder.assignFrom(entity: Pair<kotlin.Long, kotlin.Long>) {
        this.apply {
            set(UpdateStocksRequestUpdateStockDTO.updateStocksRequest, entity.first)
            set(UpdateStocksRequestUpdateStockDTO.updateStockDTO, entity.second)
        }
    }

}

