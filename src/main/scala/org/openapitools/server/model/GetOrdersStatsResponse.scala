package org.openapitools.server.model


/**
 * Ответ на запрос информации по заказам.
 *
 * @param status  for example: ''null''
 * @param result  for example: ''null''
*/
final case class GetOrdersStatsResponse (
  status: Option[ApiResponseStatusType] = None,
  result: Option[OrdersStatsDTO] = None
)

