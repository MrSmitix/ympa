package org.openapitools.server.model


/**
 * Информация о трек-номере посылки (DBS).
 *
 * @param trackCode Трек‑номер посылки. for example: ''null''
 * @param deliveryServiceId Идентификатор службы доставки. Информацию о службе доставки можно получить с помощью запроса [GET delivery/services](../../reference/orders/getDeliveryServices.md). for example: ''null''
*/
final case class OrderTrackDTO (
  trackCode: Option[String] = None,
  deliveryServiceId: Option[Long] = None
)

