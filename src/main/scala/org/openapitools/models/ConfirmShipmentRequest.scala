package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import ympa_scala_finch_server._

/**
 * Запрос для подтверждения отгрузки.
 * @param externalShipmentId Идентификатор отгрузки в системе поставщика.
 */
case class ConfirmShipmentRequest(externalShipmentId: Option[String]
                )

object ConfirmShipmentRequest {
    /**
     * Creates the codec for converting ConfirmShipmentRequest from and to JSON.
     */
    implicit val decoder: Decoder[ConfirmShipmentRequest] = deriveDecoder
    implicit val encoder: ObjectEncoder[ConfirmShipmentRequest] = deriveEncoder
}
