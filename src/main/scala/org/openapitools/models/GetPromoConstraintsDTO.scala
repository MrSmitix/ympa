package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import ympa_scala_finch_server._
import scala.collection.immutable.Seq

/**
 * Ограничения в акции.
 * @param warehouseIds Идентификаторы складов, для которых действует акция. Товары, которые лежат на других складах, не будут продаваться по акции.  Параметр возвращается, только если в условиях акции есть ограничение по складу. 
 */
case class GetPromoConstraintsDTO(warehouseIds: Option[Seq[Long]]
                )

object GetPromoConstraintsDTO {
    /**
     * Creates the codec for converting GetPromoConstraintsDTO from and to JSON.
     */
    implicit val decoder: Decoder[GetPromoConstraintsDTO] = deriveDecoder
    implicit val encoder: ObjectEncoder[GetPromoConstraintsDTO] = deriveEncoder
}
