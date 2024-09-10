package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import ympa_scala_finch_server._

/**
 * Информация о грузоместе.
 * @param id Идентификатор грузоместа.
 * @param fulfilmentId Идентификатор грузового места в информационной системе магазина.
 */
case class OrderParcelBoxDTO(id: Option[Long],
                fulfilmentId: Option[String]
                )

object OrderParcelBoxDTO {
    /**
     * Creates the codec for converting OrderParcelBoxDTO from and to JSON.
     */
    implicit val decoder: Decoder[OrderParcelBoxDTO] = deriveDecoder
    implicit val encoder: ObjectEncoder[OrderParcelBoxDTO] = deriveEncoder
}
