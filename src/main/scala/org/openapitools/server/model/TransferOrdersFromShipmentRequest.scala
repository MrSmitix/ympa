package org.openapitools.server.model


/**
 * Запрос переноса заказов из отгрузки.
 *
 * @param orderIds Список заказов, которые вы не успеваете подготовить. for example: ''null''
*/
final case class TransferOrdersFromShipmentRequest (
  orderIds: Seq[Long]
)

