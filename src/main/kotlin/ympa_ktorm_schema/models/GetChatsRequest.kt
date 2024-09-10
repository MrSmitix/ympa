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
 * Фильтры по чатам, которые нужно вернуть. 
 * @param orderIds Фильтр по идентификаторам заказов на Маркете.
 * @param types Фильтр по типам чатов.
 * @param statuses Фильтр по статусам чатов.
 */
object GetChatsRequests : BaseTable<GetChatsRequest>("GetChatsRequest") {

    /**
     * Create an entity of type GetChatsRequest from the model
     */
    override fun doCreateEntity(row: QueryRowSet, withReferences: Boolean) = GetChatsRequest(
        orderIds = emptyList() /* kotlin.Array<kotlin.Long>? */ /* Фильтр по идентификаторам заказов на Маркете. */,
        types = emptyList() /* kotlin.Array<ChatType>? */ /* Фильтр по типам чатов. */,
        statuses = emptyList() /* kotlin.Array<ChatStatusType>? */ /* Фильтр по статусам чатов. */
    )

    /**
    * Assign all the columns from the entity of type GetChatsRequest to the DML expression.
    *
    * Usage:
    *
    * ```kotlin
    * let entity = GetChatsRequest()
    * database.update(GetChatsRequests, {
    *     assignFrom(entity)
    * })
    * ```
    * @return the builder with the columns for the update or insert.
    */
    fun AssignmentsBuilder.assignFrom(entity: GetChatsRequest) {
        this.apply {
        }
    }

}


object GetChatsRequestOrderIds : BaseTable<Pair<kotlin.Long, kotlin.Long>>("GetChatsRequestOrderIds") {
    val getChatsRequest = long("getChatsRequest")
    val orderIds = long("orderIds")

    override fun doCreateEntity(row: QueryRowSet, withReferences: Boolean): Pair<kotlin.Long, kotlin.Long> =
        Pair(row[getChatsRequest] ?: 0, row[orderIds] ?: 0)

    fun AssignmentsBuilder.assignFrom(entity: Pair<kotlin.Long, kotlin.Long>) {
        this.apply {
            set(GetChatsRequestOrderIds.getChatsRequest, entity.first)
            set(GetChatsRequestOrderIds.orderIds, entity.second)
        }
    }

}

object GetChatsRequestChatType : BaseTable<Pair<kotlin.Long, kotlin.Long>>("GetChatsRequestChatType") {
    val getChatsRequest = long("getChatsRequest")
    val chatType = long("chatType")

    override fun doCreateEntity(row: QueryRowSet, withReferences: Boolean): Pair<kotlin.Long, kotlin.Long> =
        Pair(row[getChatsRequest] ?: 0, row[chatType] ?: 0)

    fun AssignmentsBuilder.assignFrom(entity: Pair<kotlin.Long, kotlin.Long>) {
        this.apply {
            set(GetChatsRequestChatType.getChatsRequest, entity.first)
            set(GetChatsRequestChatType.chatType, entity.second)
        }
    }

}

object GetChatsRequestChatStatusType : BaseTable<Pair<kotlin.Long, kotlin.Long>>("GetChatsRequestChatStatusType") {
    val getChatsRequest = long("getChatsRequest")
    val chatStatusType = long("chatStatusType")

    override fun doCreateEntity(row: QueryRowSet, withReferences: Boolean): Pair<kotlin.Long, kotlin.Long> =
        Pair(row[getChatsRequest] ?: 0, row[chatStatusType] ?: 0)

    fun AssignmentsBuilder.assignFrom(entity: Pair<kotlin.Long, kotlin.Long>) {
        this.apply {
            set(GetChatsRequestChatStatusType.getChatsRequest, entity.first)
            set(GetChatsRequestChatStatusType.chatStatusType, entity.second)
        }
    }

}

