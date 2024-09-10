package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import ympa_scala_finch_server._

/**
 * Информация о службе доставки.
 * @param id Идентификатор службы доставки.
 * @param name Наименование службы доставки.
 */
case class DeliveryServiceInfoDTO(id: Long,
                name: String
                )

object DeliveryServiceInfoDTO {
    /**
     * Creates the codec for converting DeliveryServiceInfoDTO from and to JSON.
     */
    implicit val decoder: Decoder[DeliveryServiceInfoDTO] = deriveDecoder
    implicit val encoder: ObjectEncoder[DeliveryServiceInfoDTO] = deriveEncoder
}
