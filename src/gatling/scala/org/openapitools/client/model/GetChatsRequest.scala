
package org.openapitools.client.model


case class GetChatsRequest (
    /* Фильтр по идентификаторам заказов на Маркете. */
    _orderIds: Option[List[Long]],
    /* Фильтр по типам чатов. */
    _types: Option[List[ChatType]],
    /* Фильтр по статусам чатов. */
    _statuses: Option[List[ChatStatusType]]
)
object GetChatsRequest {
    def toStringBody(var_orderIds: Object, var_types: Object, var_statuses: Object) =
        s"""
        | {
        | "orderIds":$var_orderIds,"types":$var_types,"statuses":$var_statuses
        | }
        """.stripMargin
}
