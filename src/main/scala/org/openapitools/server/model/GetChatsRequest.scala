package org.openapitools.server.model


/**
 * Фильтры по чатам, которые нужно вернуть. 
 *
 * @param orderIds Фильтр по идентификаторам заказов на Маркете. for example: ''null''
 * @param types Фильтр по типам чатов. for example: ''null''
 * @param statuses Фильтр по статусам чатов. for example: ''null''
*/
final case class GetChatsRequest (
  orderIds: Option[Seq[Long]] = None,
  types: Option[Seq[ChatType]] = None,
  statuses: Option[Seq[ChatStatusType]] = None
)

