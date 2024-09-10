package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import ympa_scala_finch_server._

/**
 * 
 * @param trackCode Трек‑номер посылки.
 * @param deliveryServiceId Идентификатор службы доставки. Информацию о службе доставки можно получить с помощью запроса [GET delivery/services](../../reference/orders/getDeliveryServices.md).
 */
case class SetOrderDeliveryTrackCodeRequest(trackCode: String,
                deliveryServiceId: Long
                )

object SetOrderDeliveryTrackCodeRequest {
    /**
     * Creates the codec for converting SetOrderDeliveryTrackCodeRequest from and to JSON.
     */
    implicit val decoder: Decoder[SetOrderDeliveryTrackCodeRequest] = deriveDecoder
    implicit val encoder: ObjectEncoder[SetOrderDeliveryTrackCodeRequest] = deriveEncoder
}
