package org.openapitools.server.model


/**
 * Информация о заказе, указанная в отзыве.
 *
 * @param shopOrderId Номер заказа, указанный в отзыве. for example: ''null''
 * @param delivery  for example: ''null''
*/
final case class FeedbackOrderDTO (
  shopOrderId: Option[String] = None,
  delivery: Option[FeedbackDeliveryType] = None
)

