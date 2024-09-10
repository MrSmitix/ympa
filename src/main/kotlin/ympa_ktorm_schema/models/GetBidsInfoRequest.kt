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
 * description.
 * @param skus Список товаров, для которых нужно получить значения ставок.  Если список не задан, постранично возвращаются все товары со ставками.  Если список задан, результаты возвращаются одной страницей, а параметры `page_token` и `limit` игнорируются. 
 */
object GetBidsInfoRequests : BaseTable<GetBidsInfoRequest>("GetBidsInfoRequest") {

    /**
     * Create an entity of type GetBidsInfoRequest from the model
     */
    override fun doCreateEntity(row: QueryRowSet, withReferences: Boolean) = GetBidsInfoRequest(
        skus = emptyList() /* kotlin.Array<kotlin.String>? */ /* Список товаров, для которых нужно получить значения ставок.  Если список не задан, постранично возвращаются все товары со ставками.  Если список задан, результаты возвращаются одной страницей, а параметры `page_token` и `limit` игнорируются.  */
    )

    /**
    * Assign all the columns from the entity of type GetBidsInfoRequest to the DML expression.
    *
    * Usage:
    *
    * ```kotlin
    * let entity = GetBidsInfoRequest()
    * database.update(GetBidsInfoRequests, {
    *     assignFrom(entity)
    * })
    * ```
    * @return the builder with the columns for the update or insert.
    */
    fun AssignmentsBuilder.assignFrom(entity: GetBidsInfoRequest) {
        this.apply {
        }
    }

}


object GetBidsInfoRequestSkus : BaseTable<Pair<kotlin.Long, kotlin.String>>("GetBidsInfoRequestSkus") {
    val getBidsInfoRequest = long("getBidsInfoRequest")
    val skus = text("skus")

    override fun doCreateEntity(row: QueryRowSet, withReferences: Boolean): Pair<kotlin.Long, kotlin.String> =
        Pair(row[getBidsInfoRequest] ?: 0, row[skus] ?: "")

    fun AssignmentsBuilder.assignFrom(entity: Pair<kotlin.Long, kotlin.String>) {
        this.apply {
            set(GetBidsInfoRequestSkus.getBidsInfoRequest, entity.first)
            set(GetBidsInfoRequestSkus.skus, entity.second)
        }
    }

}

