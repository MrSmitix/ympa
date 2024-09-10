package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import ympa_scala_finch_server._
import org.openapitools.models.PriceQuarantineVerdictParameterDTO
import org.openapitools.models.PriceQuarantineVerdictType
import scala.collection.immutable.Seq

/**
 * Причина попадания товара в карантин.
 * @param _type 
 * @param params Цена, из-за которой товар попал в карантин, и значения для сравнения. Конкретный набор параметров зависит от типа карантина.
 */
case class PriceQuarantineVerdictDTO(_type: Option[PriceQuarantineVerdictType],
                params: Seq[PriceQuarantineVerdictParameterDTO]
                )

object PriceQuarantineVerdictDTO {
    /**
     * Creates the codec for converting PriceQuarantineVerdictDTO from and to JSON.
     */
    implicit val decoder: Decoder[PriceQuarantineVerdictDTO] = deriveDecoder
    implicit val encoder: ObjectEncoder[PriceQuarantineVerdictDTO] = deriveEncoder
}
