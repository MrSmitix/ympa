package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import ympa_scala_finch_server._

/**
 * Информация о части товара в коробке.
 * @param current Номер части, начиная с 1.
 * @param total На сколько всего частей разделен товар.
 */
case class OrderBoxLayoutPartialCountDTO(current: Int,
                total: Int
                )

object OrderBoxLayoutPartialCountDTO {
    /**
     * Creates the codec for converting OrderBoxLayoutPartialCountDTO from and to JSON.
     */
    implicit val decoder: Decoder[OrderBoxLayoutPartialCountDTO] = deriveDecoder
    implicit val encoder: ObjectEncoder[OrderBoxLayoutPartialCountDTO] = deriveEncoder
}
