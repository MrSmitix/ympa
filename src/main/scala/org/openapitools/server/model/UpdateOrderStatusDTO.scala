package org.openapitools.server.model


/**
 * Список заказов.
 *
 * @param id Идентификатор заказа. for example: ''null''
 * @param status  for example: ''null''
 * @param substatus  for example: ''null''
 * @param updateStatus  for example: ''null''
 * @param errorDetails Ошибка при изменении статуса заказа. Содержит описание ошибки и идентификатор заказа.  Возвращается, если параметр `updateStatus` принимает значение `ERROR`.  for example: ''null''
*/
final case class UpdateOrderStatusDTO (
  id: Option[Long] = None,
  status: Option[OrderStatusType] = None,
  substatus: Option[OrderSubstatusType] = None,
  updateStatus: Option[OrderUpdateStatusType] = None,
  errorDetails: Option[String] = None
)

