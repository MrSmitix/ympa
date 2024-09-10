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
 * Запрос рекомендованных карточек товара.
 * @param offers Список товаров.
 */
object GetSuggestedOfferMappingEntriesRequests : BaseTable<GetSuggestedOfferMappingEntriesRequest>("GetSuggestedOfferMappingEntriesRequest") {

    /**
     * Create an entity of type GetSuggestedOfferMappingEntriesRequest from the model
     */
    override fun doCreateEntity(row: QueryRowSet, withReferences: Boolean) = GetSuggestedOfferMappingEntriesRequest(
        offers = emptyList() /* kotlin.Array<MappingsOfferDTO> */ /* Список товаров. */
    )

    /**
    * Assign all the columns from the entity of type GetSuggestedOfferMappingEntriesRequest to the DML expression.
    *
    * Usage:
    *
    * ```kotlin
    * let entity = GetSuggestedOfferMappingEntriesRequest()
    * database.update(GetSuggestedOfferMappingEntriesRequests, {
    *     assignFrom(entity)
    * })
    * ```
    * @return the builder with the columns for the update or insert.
    */
    fun AssignmentsBuilder.assignFrom(entity: GetSuggestedOfferMappingEntriesRequest) {
        this.apply {
        }
    }

}


object GetSuggestedOfferMappingEntriesRequestMappingsOfferDTO : BaseTable<Pair<kotlin.Long, kotlin.Long>>("GetSuggestedOfferMappingEntriesRequestMappingsOfferDTO") {
    val getSuggestedOfferMappingEntriesRequest = long("getSuggestedOfferMappingEntriesRequest")
    val mappingsOfferDTO = long("mappingsOfferDTO")

    override fun doCreateEntity(row: QueryRowSet, withReferences: Boolean): Pair<kotlin.Long, kotlin.Long> =
        Pair(row[getSuggestedOfferMappingEntriesRequest] ?: 0, row[mappingsOfferDTO] ?: 0)

    fun AssignmentsBuilder.assignFrom(entity: Pair<kotlin.Long, kotlin.Long>) {
        this.apply {
            set(GetSuggestedOfferMappingEntriesRequestMappingsOfferDTO.getSuggestedOfferMappingEntriesRequest, entity.first)
            set(GetSuggestedOfferMappingEntriesRequestMappingsOfferDTO.mappingsOfferDTO, entity.second)
        }
    }

}

