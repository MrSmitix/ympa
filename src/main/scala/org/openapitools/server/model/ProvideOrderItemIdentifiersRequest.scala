package org.openapitools.server.model


/**
 * @param items Список позиций, требующих маркировки.  for example: ''null''
*/
final case class ProvideOrderItemIdentifiersRequest (
  items: Seq[OrderItemInstanceModificationDTO]
)

