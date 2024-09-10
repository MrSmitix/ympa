package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import ympa_scala_finch_server._

/**
 * Информация о трек-номере посылки (DBS).
 * @param trackCode Трек‑номер посылки.
 * @param deliveryServiceId Идентификатор службы доставки. Информацию о службе доставки можно получить с помощью запроса [GET delivery/services](../../reference/orders/getDeliveryServices.md).
 */
case class OrderTrackDTO(trackCode: Option[String],
                deliveryServiceId: Option[Long]
                )

object OrderTrackDTO {
    /**
     * Creates the codec for converting OrderTrackDTO from and to JSON.
     */
    implicit val decoder: Decoder[OrderTrackDTO] = deriveDecoder
    implicit val encoder: ObjectEncoder[OrderTrackDTO] = deriveEncoder
}
