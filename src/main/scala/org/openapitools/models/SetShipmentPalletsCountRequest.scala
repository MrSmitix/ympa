package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import ympa_scala_finch_server._

/**
 * Запрос на передачу количества упаковок в отгрузке.
 * @param placesCount Количество упаковок в отгрузке.
 */
case class SetShipmentPalletsCountRequest(placesCount: Int
                )

object SetShipmentPalletsCountRequest {
    /**
     * Creates the codec for converting SetShipmentPalletsCountRequest from and to JSON.
     */
    implicit val decoder: Decoder[SetShipmentPalletsCountRequest] = deriveDecoder
    implicit val encoder: ObjectEncoder[SetShipmentPalletsCountRequest] = deriveEncoder
}
