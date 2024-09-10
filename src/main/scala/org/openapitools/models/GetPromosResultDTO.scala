package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import ympa_scala_finch_server._
import org.openapitools.models.GetPromoDTO
import scala.collection.immutable.Seq

/**
 * Информация об акциях Маркета.
 * @param promos Акции Маркета.
 */
case class GetPromosResultDTO(promos: Seq[GetPromoDTO]
                )

object GetPromosResultDTO {
    /**
     * Creates the codec for converting GetPromosResultDTO from and to JSON.
     */
    implicit val decoder: Decoder[GetPromosResultDTO] = deriveDecoder
    implicit val encoder: ObjectEncoder[GetPromosResultDTO] = deriveEncoder
}
