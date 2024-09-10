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
 * Описывает проблемы, возникшие при сохранении товара.
 * @param status 
 * @param results Ошибки и предупреждения, которые появились при обработке списка характеристик. Каждый элемент списка соответствует одному товару.  Если ошибок и предупреждений нет, поле не передается. 
 */
object UpdateOfferMappingsResponses : BaseTable<UpdateOfferMappingsResponse>("UpdateOfferMappingsResponse") {
    val status = long("status") /* null */

    /**
     * Create an entity of type UpdateOfferMappingsResponse from the model
     */
    override fun doCreateEntity(row: QueryRowSet, withReferences: Boolean) = UpdateOfferMappingsResponse(
        status = ApiResponseStatusTypes.createEntity(row, withReferences) /* ApiResponseStatusType? */,
        results = emptyList() /* kotlin.Array<UpdateOfferMappingResultDTO>? */ /* Ошибки и предупреждения, которые появились при обработке списка характеристик. Каждый элемент списка соответствует одному товару.  Если ошибок и предупреждений нет, поле не передается.  */
    )

    /**
    * Assign all the columns from the entity of type UpdateOfferMappingsResponse to the DML expression.
    *
    * Usage:
    *
    * ```kotlin
    * let entity = UpdateOfferMappingsResponse()
    * database.update(UpdateOfferMappingsResponses, {
    *     assignFrom(entity)
    * })
    * ```
    * @return the builder with the columns for the update or insert.
    */
    fun AssignmentsBuilder.assignFrom(entity: UpdateOfferMappingsResponse) {
        this.apply {
            set(UpdateOfferMappingsResponses.status, entity.status)
        }
    }

}


object UpdateOfferMappingsResponseUpdateOfferMappingResultDTO : BaseTable<Pair<kotlin.Long, kotlin.Long>>("UpdateOfferMappingsResponseUpdateOfferMappingResultDTO") {
    val updateOfferMappingsResponse = long("updateOfferMappingsResponse")
    val updateOfferMappingResultDTO = long("updateOfferMappingResultDTO")

    override fun doCreateEntity(row: QueryRowSet, withReferences: Boolean): Pair<kotlin.Long, kotlin.Long> =
        Pair(row[updateOfferMappingsResponse] ?: 0, row[updateOfferMappingResultDTO] ?: 0)

    fun AssignmentsBuilder.assignFrom(entity: Pair<kotlin.Long, kotlin.Long>) {
        this.apply {
            set(UpdateOfferMappingsResponseUpdateOfferMappingResultDTO.updateOfferMappingsResponse, entity.first)
            set(UpdateOfferMappingsResponseUpdateOfferMappingResultDTO.updateOfferMappingResultDTO, entity.second)
        }
    }

}

