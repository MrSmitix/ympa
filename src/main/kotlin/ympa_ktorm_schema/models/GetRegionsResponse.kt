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
 * @param regions Регион доставки.
 * @param paging 
 */
object GetRegionsResponses : BaseTable<GetRegionsResponse>("GetRegionsResponse") {
    val paging = long("paging") /* null */

    /**
     * Create an entity of type GetRegionsResponse from the model
     */
    override fun doCreateEntity(row: QueryRowSet, withReferences: Boolean) = GetRegionsResponse(
        regions = emptyList() /* kotlin.Array<RegionDTO> */ /* Регион доставки. */,
        paging = ForwardScrollingPagerDTOs.createEntity(row, withReferences) /* ForwardScrollingPagerDTO? */
    )

    /**
    * Assign all the columns from the entity of type GetRegionsResponse to the DML expression.
    *
    * Usage:
    *
    * ```kotlin
    * let entity = GetRegionsResponse()
    * database.update(GetRegionsResponses, {
    *     assignFrom(entity)
    * })
    * ```
    * @return the builder with the columns for the update or insert.
    */
    fun AssignmentsBuilder.assignFrom(entity: GetRegionsResponse) {
        this.apply {
            set(GetRegionsResponses.paging, entity.paging)
        }
    }

}


object GetRegionsResponseRegionDTO : BaseTable<Pair<kotlin.Long, kotlin.Long>>("GetRegionsResponseRegionDTO") {
    val getRegionsResponse = long("getRegionsResponse")
    val regionDTO = long("regionDTO")

    override fun doCreateEntity(row: QueryRowSet, withReferences: Boolean): Pair<kotlin.Long, kotlin.Long> =
        Pair(row[getRegionsResponse] ?: 0, row[regionDTO] ?: 0)

    fun AssignmentsBuilder.assignFrom(entity: Pair<kotlin.Long, kotlin.Long>) {
        this.apply {
            set(GetRegionsResponseRegionDTO.getRegionsResponse, entity.first)
            set(GetRegionsResponseRegionDTO.regionDTO, entity.second)
        }
    }

}

