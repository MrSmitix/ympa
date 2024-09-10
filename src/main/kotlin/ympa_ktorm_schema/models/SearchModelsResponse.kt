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
 * @param models Список моделей товаров.
 * @param currency 
 * @param regionId Идентификатор региона, для которого выводится информация о предложениях модели (доставляемых в этот регион).  Информацию о регионе по идентификатору можно получить с помощью запроса [GET regions/{regionId}](../../reference/regions/searchRegionsById.md). 
 * @param pager 
 */
object SearchModelsResponses : BaseTable<SearchModelsResponse>("SearchModelsResponse") {
    val currency = long("currency") /* null */
    val regionId = long("regionId") /* null */ /* Идентификатор региона, для которого выводится информация о предложениях модели (доставляемых в этот регион).  Информацию о регионе по идентификатору можно получить с помощью запроса [GET regions/{regionId}](../../reference/regions/searchRegionsById.md).  */
    val pager = long("pager") /* null */

    /**
     * Create an entity of type SearchModelsResponse from the model
     */
    override fun doCreateEntity(row: QueryRowSet, withReferences: Boolean) = SearchModelsResponse(
        models = emptyList() /* kotlin.Array<ModelDTO> */ /* Список моделей товаров. */,
        currency = CurrencyTypes.createEntity(row, withReferences) /* CurrencyType? */,
        regionId = row[regionId]  /* kotlin.Long? */ /* Идентификатор региона, для которого выводится информация о предложениях модели (доставляемых в этот регион).  Информацию о регионе по идентификатору можно получить с помощью запроса [GET regions/{regionId}](../../reference/regions/searchRegionsById.md).  */,
        pager = FlippingPagerDTOs.createEntity(row, withReferences) /* FlippingPagerDTO? */
    )

    /**
    * Assign all the columns from the entity of type SearchModelsResponse to the DML expression.
    *
    * Usage:
    *
    * ```kotlin
    * let entity = SearchModelsResponse()
    * database.update(SearchModelsResponses, {
    *     assignFrom(entity)
    * })
    * ```
    * @return the builder with the columns for the update or insert.
    */
    fun AssignmentsBuilder.assignFrom(entity: SearchModelsResponse) {
        this.apply {
            set(SearchModelsResponses.currency, entity.currency)
            set(SearchModelsResponses.regionId, entity.regionId)
            set(SearchModelsResponses.pager, entity.pager)
        }
    }

}


object SearchModelsResponseModelDTO : BaseTable<Pair<kotlin.Long, kotlin.Long>>("SearchModelsResponseModelDTO") {
    val searchModelsResponse = long("searchModelsResponse")
    val modelDTO = long("modelDTO")

    override fun doCreateEntity(row: QueryRowSet, withReferences: Boolean): Pair<kotlin.Long, kotlin.Long> =
        Pair(row[searchModelsResponse] ?: 0, row[modelDTO] ?: 0)

    fun AssignmentsBuilder.assignFrom(entity: Pair<kotlin.Long, kotlin.Long>) {
        this.apply {
            set(SearchModelsResponseModelDTO.searchModelsResponse, entity.first)
            set(SearchModelsResponseModelDTO.modelDTO, entity.second)
        }
    }

}

