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
 * Запрос на обновление изменение параметров прайс-листа.
 * @param parameters Параметры прайс-листа.  Обязательный параметр. 
 */
object SetFeedParamsRequests : BaseTable<SetFeedParamsRequest>("SetFeedParamsRequest") {

    /**
     * Create an entity of type SetFeedParamsRequest from the model
     */
    override fun doCreateEntity(row: QueryRowSet, withReferences: Boolean) = SetFeedParamsRequest(
        parameters = emptyList() /* kotlin.Array<FeedParameterDTO> */ /* Параметры прайс-листа.  Обязательный параметр.  */
    )

    /**
    * Assign all the columns from the entity of type SetFeedParamsRequest to the DML expression.
    *
    * Usage:
    *
    * ```kotlin
    * let entity = SetFeedParamsRequest()
    * database.update(SetFeedParamsRequests, {
    *     assignFrom(entity)
    * })
    * ```
    * @return the builder with the columns for the update or insert.
    */
    fun AssignmentsBuilder.assignFrom(entity: SetFeedParamsRequest) {
        this.apply {
        }
    }

}


object SetFeedParamsRequestFeedParameterDTO : BaseTable<Pair<kotlin.Long, kotlin.Long>>("SetFeedParamsRequestFeedParameterDTO") {
    val setFeedParamsRequest = long("setFeedParamsRequest")
    val feedParameterDTO = long("feedParameterDTO")

    override fun doCreateEntity(row: QueryRowSet, withReferences: Boolean): Pair<kotlin.Long, kotlin.Long> =
        Pair(row[setFeedParamsRequest] ?: 0, row[feedParameterDTO] ?: 0)

    fun AssignmentsBuilder.assignFrom(entity: Pair<kotlin.Long, kotlin.Long>) {
        this.apply {
            set(SetFeedParamsRequestFeedParameterDTO.setFeedParamsRequest, entity.first)
            set(SetFeedParamsRequestFeedParameterDTO.feedParameterDTO, entity.second)
        }
    }

}

