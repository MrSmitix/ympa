package org.openapitools.server.model


/**
 * Краткие сведения о промаркированных товарах. Параметр возвращается, если ответ `OK`. 
 *
 * @param items Список позиций в заказе, подлежащих маркировке. for example: ''null''
*/
final case class OrderItemsModificationResultDTO (
  items: Seq[BriefOrderItemDTO]
)

