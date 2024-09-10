package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import ympa_scala_finch_server._

/**
 * Результат выполнения запроса. Выводится, если `status=\"OK\"`. 
 * @param id Идентификатор точки продаж, присвоенный Маркетом.
 */
case class OutletResponseDTO(id: Option[Long]
                )

object OutletResponseDTO {
    /**
     * Creates the codec for converting OutletResponseDTO from and to JSON.
     */
    implicit val decoder: Decoder[OutletResponseDTO] = deriveDecoder
    implicit val encoder: ObjectEncoder[OutletResponseDTO] = deriveEncoder
}
