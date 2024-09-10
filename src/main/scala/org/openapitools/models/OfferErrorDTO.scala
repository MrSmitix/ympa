package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import ympa_scala_finch_server._

/**
 * Сообщение об ошибке, связанной с размещением товара.
 * @param message Тип ошибки.
 * @param comment Пояснение.
 */
case class OfferErrorDTO(message: Option[String],
                comment: Option[String]
                )

object OfferErrorDTO {
    /**
     * Creates the codec for converting OfferErrorDTO from and to JSON.
     */
    implicit val decoder: Decoder[OfferErrorDTO] = deriveDecoder
    implicit val encoder: ObjectEncoder[OfferErrorDTO] = deriveEncoder
}
