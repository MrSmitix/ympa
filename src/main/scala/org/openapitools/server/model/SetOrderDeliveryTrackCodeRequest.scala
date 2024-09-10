package org.openapitools.server.model


/**
 * @param trackCode Трек‑номер посылки. for example: ''null''
 * @param deliveryServiceId Идентификатор службы доставки. Информацию о службе доставки можно получить с помощью запроса [GET delivery/services](../../reference/orders/getDeliveryServices.md). for example: ''null''
*/
final case class SetOrderDeliveryTrackCodeRequest (
  trackCode: String,
  deliveryServiceId: Long
)

