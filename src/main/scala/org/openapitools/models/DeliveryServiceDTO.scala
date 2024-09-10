package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import ympa_scala_finch_server._

/**
 * Служба доставки.
 * @param id Идентификатор службы доставки.
 * @param name Наименование службы доставки.
 */
case class DeliveryServiceDTO(id: Option[Long],
                name: Option[String]
                )

object DeliveryServiceDTO {
    /**
     * Creates the codec for converting DeliveryServiceDTO from and to JSON.
     */
    implicit val decoder: Decoder[DeliveryServiceDTO] = deriveDecoder
    implicit val encoder: ObjectEncoder[DeliveryServiceDTO] = deriveEncoder
}
