package org.openapitools.server.model

import java.time.OffsetDateTime

/**
 * Возврат заказа.
 *
 * @param id Идентификатор возврата. for example: ''null''
 * @param orderId Номер заказа. for example: ''null''
 * @param creationDate Дата создания возврата клиентом. for example: ''null''
 * @param updateDate Дата обновления возврата. for example: ''null''
 * @param refundStatus  for example: ''null''
 * @param logisticPickupPoint  for example: ''null''
 * @param shipmentRecipientType  for example: ''null''
 * @param shipmentStatus  for example: ''null''
 * @param refundAmount Сумма возврата. for example: ''null''
 * @param items Список товаров в возврате. for example: ''null''
 * @param returnType  for example: ''null''
 * @param fastReturn Используется ли опция **Быстрый возврат денег за дешевый брак**.  for example: ''null''
*/
final case class ReturnDTO (
  id: Option[Long] = None,
  orderId: Option[Long] = None,
  creationDate: Option[OffsetDateTime] = None,
  updateDate: Option[OffsetDateTime] = None,
  refundStatus: Option[RefundStatusType] = None,
  logisticPickupPoint: Option[LogisticPickupPointDTO] = None,
  shipmentRecipientType: Option[RecipientType] = None,
  shipmentStatus: Option[ReturnShipmentStatusType] = None,
  refundAmount: Option[Long] = None,
  items: Seq[ReturnItemDTO],
  returnType: Option[ReturnType] = None,
  fastReturn: Option[Boolean] = None
)

