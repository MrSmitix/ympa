package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import ympa_scala_finch_server._
import org.openapitools.models.EnrichedOrderBoxLayoutDTO
import scala.collection.immutable.Seq

/**
 * Распределение товаров по коробкам.
 * @param boxes Список коробок.
 */
case class OrderBoxesLayoutDTO(boxes: Seq[EnrichedOrderBoxLayoutDTO]
                )

object OrderBoxesLayoutDTO {
    /**
     * Creates the codec for converting OrderBoxesLayoutDTO from and to JSON.
     */
    implicit val decoder: Decoder[OrderBoxesLayoutDTO] = deriveDecoder
    implicit val encoder: ObjectEncoder[OrderBoxesLayoutDTO] = deriveEncoder
}
