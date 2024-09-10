package org.openapitools.server.model


/**
 * Детали по товару в заказе.
 *
 * @param itemCount Количество единиц товара. for example: ''null''
 * @param itemStatus  for example: ''null''
 * @param updateDate Формат даты: `ДД-ММ-ГГГГ`.  for example: ''23-09-2022''
*/
final case class OrderItemDetailDTO (
  itemCount: Option[Long] = None,
  itemStatus: Option[OrderItemStatusType] = None,
  updateDate: Option[String] = None
)

